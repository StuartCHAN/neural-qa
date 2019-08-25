# -*- coding: utf-8 -*-
"""This is the script to do the RDF filtering through the sentences from the Wikipedia page articles.
"""
import pandas as pd
import numpy as np
import string
import unidecode
import spacy
import neuralcoref
nlp = spacy.load('en_core_web_sm') 
neuralcoref.add_to_pipe(nlp)
import paraphraser
import collections
import question_convertor 


# to do the preprocesing:
def preprocess(strin ):
    if "#" in strin:
        strin = str(strin).split("#")[-1]
    elif "^^" in strin:
        strin = str(strin).split("^^")[0]
    elif "/" in strin:
        strin = str(strin).split("/")[-1]
    strin = [s if s not in string.punctuation else ' ' for s in strin ]
    stri =str().join( [s  if s in string.ascii_lowercase else " "+str(s).lower() for s in strin])
    return stri;
 
# to get the dbpedia entity url out of the link format:
def refine(dblink):
    dblink = str(dblink).replace('http://dbpedia.org/ontology/','')
    dblink = str(dblink).replace('http://dbpedia.org/property/','')
    dblink = str(dblink).replace('http://dbpedia.org/resource/Category:','')
    dblink = str(dblink).replace('http://dbpedia.org/resource/','')
    dblink = str(dblink).replace('http://www.w3.org/1999/02/22-rdf-syntax-ns#type','') ;            
    if "^^" in dblink:
        dblink = str(dblink).split("^^")[0]
    elif "#" in dblink:
        dblink = str(dblink).split("#")[-1]
        dblink = dblink.replace('"', '')
    elif "/" in dblink:
        dblink = str(dblink).split("/")[-1] ;
    #dblink = [s if s not in string.punctuation else ' ' for s in dblink ]
    dblink = str(dblink).replace('<', '').replace('>', '')
    if len(dblink.split('_')) > 1:
        dblink = str(' ').join( [str(db).lower() for db in dblink.split('_')])
    else:
        dblink = str().join( [" "+str(s).lower()  if s in string.ascii_uppercase else s for s in dblink ])
    dblink = str(' ').join( dblink.split() )
    return dblink;


# to load the RDF ntriple files:
def prepare_rdf(ntriple_fpath):
    ntriple =[str(ntrpl).strip().replace('\n', '') for ntrpl in open(ntriple_fpath, 'r', encoding='UTF-8' ).readlines() if ('@' not in ntrpl)and("http://www.w3.org/" not in ntrpl ) ]   
    triples = [[refine(link) for link in str(triple).split() if ((link not in string.punctuation) and (link != '') and (link != ' ')) ] for triple in ntriple[5:] ]    
    triples = [ (triple[0], triple[1], str(' ').join(triple[2:]) ) for triple in triples]
    return ntriple, triples 

# to get the subject of the neural correference resolution:
def get_subject_coref(text, topic): 
    topic = str(topic).replace("_", " ")
    doc = nlp(str(text).replace('\n', ' '))
    text_coref = doc._.coref_clusters 
    coreflist = []
    for coref in text_coref:
        coref = [str(span) for span in coref]
        print(" coref --> ", coref)
        if topic in coref:
            _ = [ coreflist.append(ref) for ref in coref if len(ref)<=len(topic)]
    coreflist = list(set(coreflist))
    subject_coref = [ str().join([e if e not in string.punctuation else ' ' for e in str(s).strip().lower()]).strip() for s in coreflist ]
    subject_coref = list(set(subject_coref))
    return subject_coref 

# to check whether the sentence contains any elements of the list:       
def containsAny(sentence, seq):
    #e.g. return True if any(' '+i+' ' in sentence for i in seq) else False
    n = 0
    for i in seq:
        if ' '+i+' ' in sentence:
            n +=1
    if n >= 1:
        return True
    else:
        return False;
            
    
def placeholdAny(sentence, seq):
    if containsAny(sentence, seq):
        for i in seq:
            if ' '+i+' ' in sentence:
                sentence = str(sentence).replace(' '+i+' ', ' <A> ')
                return sentence;
    else:
        return sentence;
    
       
def sentence_distill(text_fpath, ntriple_fpath): 
    """To use a method to extract the RDFs from the sentences:
    

    """    
    ntriple, triples = prepare_rdf(ntriple_fpath)
    print("\n Ntriples: ", ntriple)
    print("\n Triples: ", triples)    
    text = open(text_fpath, 'r', encoding='UTF-8' ).read()
    
    text_segmented = [ str(sent.text).strip().lower()  for sent in nlp(text).sents if (sent.text != '' and sent.text != '\n' and sent.text != ' ') ] 
    
    print("\n text segmented: ", text_segmented )

    topic = str(str(ntriple_fpath).split('/')[-1]).replace('.ntriples','').strip() 
    print("\n topic: ", topic )

    subject_coref = get_subject_coref(text, topic)

    print("\n subject_coref: ", subject_coref )
            
    length = int(np.mean([len(sentence.split()) for sentence in text_segmented]))

    print("\n The treshold length is: ", length)

    collected_pool_ = [ ] 
    text_segmented_ = list(text_segmented)
    for triple, ntrpl in zip(triples, ntriple[5:]) :
        for txt in range(0, len(text_segmented_)):         
            tx = text_segmented_[txt]
            if len(str(tx).split()) <= length:                
                tx =str().join( [t for t in unidecode.unidecode(str(tx).lower().replace('\n', '') ) if t not in string.punctuation or t == ',' ])
                tx = str(tx).replace(',',' ,')                 
                tx = ' '+tx+' '
                trpl = triple[2]
                pred = triple[1]
                paraphrases = []            
                try:
                    paraphras = paraphraser.paraphrase(pred)
                    paraphrases.extend(paraphras)
                    print("\n the paraphrases are: ", paraphrases)
                except:
                    paraphrases.append(pred)
                    print("\n the paraphrase is: ", paraphrases)
                    pass;            
                  
                if ((triple[0] != triple[-1])and(trpl != '')and(tx != '')and(pred != '')) and( (' '+trpl+' 'in tx) or containsAny(tx, paraphrases) )and containsAny(str(tx), subject_coref) : 
                    predicate = None
                    try:
                        for paraphrase in paraphrases:
                            if ' '+paraphrase+' ' in tx:
                                tx = str(tx).replace(paraphrase, '<'+paraphrase+'>')
                                predicate = paraphrase
                                break;
                    except:
                        pass;

                    if predicate is not None :
                        obeject = str(ntrpl).strip('.').split()[-1]
                        question = question_convertor.distill(predicate, obeject )
                        
                        try:
                            collected_pool_.append( str(' , ').join([question, ntrpl]) )
                            print("\n * the text collected is: ",tx)
                            text_segmented_.remove(text_segmented_[txt])
                            break;
                        except:
                            continue;
                    #text_segmented_.remove(text_segmented_[txt])
                    #break;
                    
                          
    collected_set_ = list(set(collected_pool_))
    collected_set_.sort(key=collected_pool_.index)
    savepath = ntriple_fpath+'.csv' 
    with open(savepath, 'w', encoding='UTF-8') as save:
        for collected in collected_set_:
            save.write(collected+'\n')
    return collected_set_ ;      



            
            