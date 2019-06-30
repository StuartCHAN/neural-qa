# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

from SPARQLWrapper import SPARQLWrapper, JSON


entity_type = "dbo:Person"

query = '''
    PREFIX dbr:    <http://dbpedia.org/resource/>
PREFIX dbo:    <http://dbpedia.org/ontology/>
PREFIX dbp:	<http://dbpedia.org/property/>
PREFIX dct:    <http://purl.org/dc/terms/>
PREFIX owl:    <http://www.w3.org/2002/07/owl#>
PREFIX prov:   <http://www.w3.org/ns/prov#>
PREFIX qb:     <http://purl.org/linked-data/cube#>
PREFIX qudt:   <http://qudt.org/1.1/schema/qudt#>
PREFIX rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs:   <http://www.w3.org/2000/01/rdf-schema#>
PREFIX schema: <http://schema.org/>
PREFIX skos:   <http://www.w3.org/2004/02/skos/core#>
PREFIX unit:   <http://qudt.org/vocab/unit#>
PREFIX xsd:    <http://www.w3.org/2001/XMLSchema#>
PREFIX sdmx:   <http://purl.org/linked-data/sdmx#>

select distinct ?prettyName ?property where {

  { select distinct ?property where {
      [ a dbo:Person ; ?property [] ]
    } }

  values (?prefixURI ?prefixName) {
    (dbo: "dbo")
    (dbp:     "dbp")

  }

  filter strstarts(str(?property),str(?prefixURI))

  bind(concat(?prefixName,":",strafter(str(?property),str(?prefixURI))) as ?prettyName)
}
limit 10
'''%entity_type ;
    
sparql = SPARQLWrapper("http://dbpedia.org/sparql")
sparql.setQuery(query)
#sparql.setReturnFormat(JSON)
response = sparql.query()#.convert();
print (entity_type, ' ----> ', response)
Predicates = response #[]

for p in response["results"]["bindings"]:
    predicate = str(p['p']['value']).split('/')[-1].split('#')[-1]
    Predicates.append(predicate);
