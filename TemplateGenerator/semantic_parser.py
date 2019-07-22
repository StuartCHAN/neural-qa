#!/usr/bin/env python
# coding: utf-8


import nltk
from nltk.parse.stanford import StanfordDependencyParser
from nltk.corpus import stopwords
from nltk.corpus import brown
from SPARQLWrapper import SPARQLWrapper, JSON
import json
import numpy as np
 


  
def extract_phrase(text):
    text_list = nltk.word_tokenize(text)
    # to remove the English punctuations
    english_punctuations = [',', '.', ':', ';', '?', '(', ')', '[', ']', '&', '!', '*', '@', '#', '$', '%']
    text_list = [word for word in text_list if word not in english_punctuations]
    # to remove the stop words
    stops = set(stopwords.words("english"))
    text_list = [word for word in text_list if word not in stops]
    
    tagged = nltk.pos_tag(text_list)
    entities = []
    for t in tagged :
        if str(t[1]) in ['NN', 'NNS', 'NNPS', 'NNP']:
            e = (str(t[0]), str(t[1]) )
            entities.append(e)
    return entities;


dbr_query = '''
select distinct ?property ?label {
  { dbr:%(dbr)s ?property ?o }
  union
  { ?s ?property dbr:%(dbr)s }

  optional { 
    ?property rdfs:label ?label .
    filter langMatches(lang(?label), 'en')
  }
}
'''

dbo_query ="""
PREFIX  rdfs:  <http://www.w3.org/2000/01/rdf-schema#>
PREFIX   dbo:  <http://dbpedia.org/ontology/>
PREFIX   bif:  <bif:>

SELECT DISTINCT ?itemLabel  
                ?item  
                ?itemDescription 
WHERE
{  
    ?item       rdfs:label    ?itemLabel .
    ?itemLabel  bif:contains  "%s" .
    ?item       dbo:abstract  ?itemDescription .
    FILTER (lang(?itemDescription) = 'en')
    FILTER (lang(?itemLabel) = 'en')
}
LIMIT 10
"""

def POStag(question):
    tokens = nltk.word_tokenize(question)
    tagged = nltk.pos_tag(tokens)
    entities = []
    for t in tagged :
        e = (str(t[0]), str(t[1]) )
        entities.append(e)
    return entities;


def hasPredicates(dbo):    
    query = str(dbo_query)%dbo

    sparql = SPARQLWrapper("http://dbpedia.org/sparql")
    sparql.setQuery(query)
    sparql.setReturnFormat(JSON)
    results = sparql.query().convert()

    predicates = []

    for result in results["results"]["bindings"]:
        p = str( result['item']['value'])  #['subject']
        p = p.replace("http://dbpedia.org/ontology/", "dbo:")
        p = p.replace("http://dbpedia.org/property/", "dbp:")
        predicate = p.replace("http://dbpedia.org/resource/", "dbr:")
        predicates.append(predicate)

    return predicates;



def hasProperties(dbr):    
    query = str(dbr_query)%{"dbr":dbr} 

    sparql = SPARQLWrapper("http://dbpedia.org/sparql")
    sparql.setQuery(query)
    sparql.setReturnFormat(JSON)
    results = sparql.query().convert()

    properties = []

    for result in results["results"]["bindings"]:
        p = str( result['property']['value'])
        p = p.replace("http://dbpedia.org/ontology/", "dbo:")
        p = p.replace("http://dbpedia.org/property/", "dbp:")
        properti = p.replace("http://dbpedia.org/resource/", "dbr:")
        properties.append(properti)

    return properties;


def lookupByName(name):
    #name = 'car'
    query = 'select ?e where { ?e foaf:name "%s"@en }LIMIT 1 '%name 

    sparql = SPARQLWrapper("http://dbpedia.org/sparql")
    sparql.setQuery(query)
    sparql.setReturnFormat(JSON)
    results = sparql.query().convert()

    if len( results["results"]["bindings"] ) > 0:
        #entities = []
        for result in results["results"]["bindings"]:
            e = str( result['e']['value'])
            e = e.replace("http://dbpedia.org/ontology/", "dbo:")
            e = e.replace("http://dbpedia.org/property/", "dbp:")
            ent = e.replace("http://dbpedia.org/resource/", "dbr:")
            entities = ent
    else:
       entities = False ;
    return entities;


def dependParse(question):
    eng_parser = StanfordDependencyParser(r"E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser.jar",r"E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser-3.9.2-models.jar",r"E:\nltk_data\stanford-parser-full-2018-10-17\stanford-parser-3.9.2-models\edu\stanford\nlp\models\lexparser\englishPCFG.ser.gz")
    res = list(eng_parser.parse(question.split()))
    
    rows = []
    for row in res[0].triples():
        r = (row[0][0], row[-1][0])
        rows.append(r);
    
    pairs = []   
    for i in range(0, len(rows)):
        if ( (i+1) < len(rows) ) and rows[i][-1] == rows[i+1][0]:
            pair = (rows[i][0], rows[i][-1], rows[i+1][-1])
            pairs.append(pair)
            pairs.append(rows[i])
        else:
            pairs.append(rows[i])
            
    return pairs;




    
    
    
    
    
"""
if __name__ == "__main__":
    
    question = "when was the Battle of Gettysburg?"
    annotated = annotate(question)
    print(annotated)
    tagged_ = POStag(text)
    phrases = extract_phrase(text)
      
    dbo = "Person" #http://dbpedia.org/resource/Barack_Obama
    Predicates = hasPredicates(dbo)
    
    dbr = "Barack_Obama"
    properties = hasProperties(dbr)
    
    print (Predicates)
    print 
    print (properties)
"""
    
#    print "begin to dump:"
#    fp1 = file("Predicates.json", 'w')
#    fp2 = file("properties.json", 'w')
#    print "dumping..."
#    json.dump(Predicates,fp1)
#    json.dump(properties,fp2)
#    print "dumped."
        

