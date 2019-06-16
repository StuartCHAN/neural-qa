#!/usr/bin/env python
# coding: utf-8


import nltk
from SPARQLWrapper import SPARQLWrapper, JSON
import json


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



if __name__ == "__main__":
    
    question = "Which movie does Audrey Hepburn star in ?"
      
    dbo = "Person" #http://dbpedia.org/resource/Barack_Obama
    Predicates = hasPredicates(dbo)
    
    dbr = "Barack_Obama"
    properties = hasProperties(dbr)
    
    print (Predicates)
    print 
    print (properties)
    
    print "begin to dump:"
    fp1 = file("Predicates.json", 'w')
    fp2 = file("properties.json", 'w')
    print "dumping..."
    json.dump(Predicates,fp1)
    json.dump(properties,fp2)
    print "dumped."
        

