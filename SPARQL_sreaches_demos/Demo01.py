#!/usr/bin/env python
# -*- coding: utf-8 -*-

#This is the demo for testing the function getVirtuoso(query), and see how pertinent the results can be. 
#from SPARQLWrapper import SPARQLWrapper, JSON, XML, N3
import traceback
import sys
import json
import requests
import xmltodict
from collections import OrderedDict




def getVirtuoso(query):
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
    

# 
    

if __name__ == '__main__':
    # For example, the files below were the datasets used by my testing.
    
    #sparqlset = 'F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7/QALD7/QALD7.benchmark/SPARQLset.bin'
    #saved = 'F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7/QALD7/QALD7.benchmark/RESULTset.json' 
    #sparqlset = './SPARQLset.bin'
    saved = 'F:/portfolio/GSoC/DBpedia/QALD7_task/201906232157/output.qald7.eva.decoded.sparql.results.json'
    sparqlset = 'F:/portfolio/GSoC/DBpedia/QALD7_task/201906232157/output.qald7.eva.decoded.sparql'
    queries = [l for l in open(sparqlset, 'r',encoding='utf-8') if l[0]!=' ' ] 
    
    with open(saved, 'w', encoding='utf-8' ) as outfile:
        responses = {}
        i = 0
        for q in queries:
            #q = queries[412]
            query = str(q).strip()
            try:
                re = getVirtuoso(query) 
                print(' Oui ', str(i))
            except:
                print( query)
                sys.exc_info()
                traceback.print_exc()
                re = ' '
                print(' Non ', str(i))
            responses[str(i)]={'query':query, 'result':re} 
            i += 1 ;
        json.dump(responses, outfile, ensure_ascii=False, indent=2)
        print('It is finished. ')
# There is the continual processing in the next demo02.py