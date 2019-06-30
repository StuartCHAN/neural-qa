# -*- coding: utf-8 -*-
#from SPARQLWrapper import SPARQLWrapper, JSON, XML, N3
'''
We do not use the SPARQLWrapper library, 
because we might get glitches while dealing with different connection problems in different countries.
'''
import traceback
import sys
import json
import requests
import xmltodict
from collections import OrderedDict
'''
This is the workable one of the functions that aim to get result from the Virtuoso endpont, 
regardless of most connectivity issues due to the regional limits, after numerous trials.
'''


def getVirtuoso(query):
    # For a short trial, you can uncomment the follwing codes to have a run.

    # query = 'describe ?a where{<http://dbpedia.org/resource/Scotsport> rdfs:label ?l . ?a a dbo:TelevisionShow . ?a foaf:name ?l . ?a dbo:completionDate ?ad}order by desc (?ad) limit 1'
    # 'select ?a where{<http://dbpedia.org/resource/Never_on_Sunday> dbo:starring ?a }'
    # 'ask where{<http://dbpedia.org/resource/Blue_Murder> rdfs:label ?l . ?a rdf:type dbo:TelevisionShow . ?a foaf:name ?l . ?a dbo:completionDate ?ad . ?a dbo:numberOfEpisodes ?an . ?b rdf:type dbo:TelevisionShow . ?b foaf:name ?l . ?b dbo:completionDate ?bd . ?b dbo:numberOfEpisodes ?bn . filter(?ad > ?bd && ?an > ?bn) }' 
    # 'describe ?a where{<http://dbpedia.org/resource/Scotsport> rdfs:label ?l . ?a a dbo:TelevisionShow . ?a foaf:name ?l . ?a dbo:completionDate ?ad}order by desc (?ad) limit 1'
    data={
            'query':query,
            'default-graph-uri':'http://dbpedia.org'
            }
    response = requests.post("https://dbpedia.org/sparql", data=data)
    try:
        content = response.json()
    except:
        content = response.text
    return content;
    
