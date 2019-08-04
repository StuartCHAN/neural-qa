# -*- coding: utf-8 -*-
"""
Created on Tue Jul 23 19:48:51 2019

@author: Stuart Chen

To use the API
FALCON API can be run in two modes :

 1. Relations and Entities linking in a sentence:

    curl --header "Content-Type: application/json" \
      --request POST \
      --data '{"text":"Who painted The Storm on the Sea of Galilee?"}' \
      https://labs.tib.eu/falcon/api?mode=long


 2. Entities linking in a short text or a term:

    curl --header "Content-Type: application/json" \
      --request POST \
      --data '{"text":"germany"}' \
      https://labs.tib.eu/falcon/api?mode=short

###
      nlq : who is the author of the famous book, Becoming?
      new_q: who is <dbo:author> of the famous book, <dbr:Becoming>
      de-annotated_q: who is <dbo:author> of the famous book <ent>
      
"""
import sys
import importlib
import unidecode    
import requests
import pandas as pd
import gensim
import spacy

import annotation
from properties_processor import property_process


nlp = spacy.load('en_core_web_md')  # make sure to use larger model!
tokens = nlp(u'dog cat banana') 

w2v_path = "../data/glove2wordvec/word2vec.6B.300d.txt" # This is the fixed path in the repository.
model = gensim.models.KeyedVectors.load_word2vec_format(w2v_path, binary=False)

def replacement(dblink):
    dblink = str(dblink).replace('http://dbpedia.org/ontology/','dbo:')
    dblink = str(dblink).replace('http://dbpedia.org/property/','dbp:')
    dblink = str(dblink).replace('http://dbpedia.org/resource/Category:','dbc:')
    dblink = str(dblink).replace('http://dbpedia.org/resource/','dbr:')
    dblink = str(dblink).replace('http://www.w3.org/1999/02/22-rdf-syntax-ns#type','rdf:type')
    return dblink;



def falcon(sentence):
        
    headers = {
        'Content-Type': 'application/json',
    }
    
    params = (
        ('mode', 'long'),
    )
    
    data = '{"text":"'+ sentence +'"}'
    
    response = requests.post('https://labs.tib.eu/falcon/api', headers=headers, params=params, data=data)  
    
    content = response.json()
    
    return content;    


    
def make_template(sentence):
    
    content = falcon(sentence)
    
    entities = content["entities"]
    
    relations = content["relations"]
    
    annotateds = annotation.annotate(sentence)
    
    falcon_pool = {}
    for entity in entities:
        falcon_pool[str(entity[-1]).strip().lower()] = replacement(entity[0])
    for relation in relations:
        falcon_pool[str(relation[-1]).strip().lower()] = replacement(relation[0])
        
    spolight_pool = {}
    for key in annotateds.keys():
        k = str(key).strip().lower()       
        dbe = annotateds[key]['Ref']
        spolight_pool[k] = dbe
    
    pool = {}
    overlapping_phrases = list(set(falcon_pool.keys() ).intersection(set(spolight_pool.keys() )))
    for key in overlapping_phrases:
        flc = property_process(falcon_pool[key] )
        spl = property_process(spolight_pool[key] )
        sim_flc = nlp(key).similarity(flc)
        sim_spl = nlp(key).similarity(spl)
        pool[key] = spolight_pool[key] if (sim_flc < sim_spl) else falcon_pool[key] 
            
    new_q = str(sentence).strip().lower()
    
    for key in annotateds.keys():
        k = str(key).strip().lower()
        if k in new_q:
            dbe = annotateds[key]['Ref'] if (k not in pool.keys() ) else pool[k]
            new_q = new_q.replace(k, '<'+dbe+'>')
                
    for entity in entities:
        k = str(entity[-1]).strip().lower()
        dbe = replacement(entity[0]) if (k not in pool.keys() ) else pool[k]
        phrase = str(entity[-1]).lower()
        new_q = new_q.replace(phrase, '<'+dbe+'>')
        
    for relation in relations:
        k = str(relation[-1]).strip().lower()
        rel = replacement(relation[0]) if (k not in pool.keys() ) else pool[k]
        phrase = str(relation[-1]).lower()
        new_q = new_q.replace(phrase, '<'+rel+'>')
        
    de_annotated_q = str(' ').join( ['<ent>'if 'dbr:' in q else q for q in str(new_q).split() ] )
    
    return [sentence, new_q, de_annotated_q] ;
    
    
        
    


if __name__ == '__main__':
    
#    importlib.reload(sys) 
#    
#    fp = sys.argv[1]
    fp = 'F:/portfolio/GSoC/DBpedia/neural-qa/data/DBNQA/DBNQA/DBNQA.dev.597to3827.top300.en'
    questions = open(fp, 'r', encoding="UTF-8").readlines()
    question = "what is hawkeye real name?"
    #q = unidecode.unidecode(question)
#    annotatees = []
#    for question in questions:
#        annotated = falcon(question)
#    print(annotated)    
    #temps = make_template(question)
    templateset = []
    for question in questions:
        question = str(question).replace('\n', '')
        question = unidecode.unidecode(question)
        print("question: ", question)
        try:
            temps = make_template(question)
            templateset.append(temps)
            print(temps)
        except:
            print(" -XXXX-> ", question)
            pass;
    
    print("OK!")
    tempsSet = pd.DataFrame(templateset)
    fname = fp+'.csv'
    print("save it to ", fname)
    tempsSet.to_csv(fname)
    print("csv saved.")
        
    
    
