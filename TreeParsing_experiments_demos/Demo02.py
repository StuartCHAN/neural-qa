# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script 
"""

from SPARQLWrapper import SPARQLWrapper, JSON

############################################################
    

from SPARQLWrapper import SPARQLWrapper, JSON
#  http://dbpedia.org/resource/Barack_Obama
query = """
SELECT distinct ?subject
FROM <http://dbpedia.org>
{
   ?subject rdfs:domain ?object .
   <http://dbpedia.org/ontology/Person> rdfs:subClassOf ?object
   OPTION (TRANSITIVE, t_distinct, t_step('step_no') as ?n, t_min (0) ).
}"""

sparql = SPARQLWrapper("http://dbpedia.org/sparql")
sparql.setQuery(query)
sparql.setReturnFormat(JSON)
results = sparql.query().convert()

for result in results["results"]["bindings"]:
    print(result["subject"]["value"])
    