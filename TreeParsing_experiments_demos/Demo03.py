#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Here is the continual processing for the previous demo02.py

##################################################################################

entity = "old"

query_template = """
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
#ORDER BY ?itemLabel
""" %entity

sparql = SPARQLWrapper("http://dbpedia.org/sparql")
sparql.setQuery(query)
sparql.setReturnFormat(JSON)
results = sparql.query().convert()

predicates = []

for result in results["results"]["bindings"]:
    p = str( result['subject']['value'])
    predicate = p.replace("http://dbpedia.org/ontology/", "")
    predicates.append(predicate)

print (p_list)