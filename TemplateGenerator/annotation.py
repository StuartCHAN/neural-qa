#!/usr/bin/env python
# coding: utf-8

import requests
#import datetime
import json
import xmltodict

import semantic_parser


'''
curl http://api.dbpedia-spotlight.org/en/annotate  --data-urlencode "text=President Obama"  --data "confidence=0.35" -H "Accept: application/json"  
'''

def searchLookup(word):
    #r = requests.get('http://lookup.dbpedia.org/api/search.asmx/KeywordSearch?QueryClass=place&QueryString=berlin', stream=True)
    query = 'http://lookup.dbpedia.org/api/search.asmx/PrefixSearch?QueryClass=&MaxHits=5&QueryString=%s'%word
    r = requests.get(query, stream=True)    
    
    text =  r.text
    t = text.encode("utf-8")
    xmldict = xmltodict.parse(t)
    result = list(xmldict.values() )[0]['Result'] 
    uris = [r['URI'] for r in result]
    return uris ;



def annotate(text):
    headers = {
        'Accept': 'application/json',
    }
    #text = "What is a car?" "enitenziagite" #"President Obama"
    data = {
    "text":text ,
    'confidence': '0.35'
    }
    response = requests.post('http://api.dbpedia-spotlight.org/en/annotate', headers=headers, data=data)
    response_json = response.json()
    if "Resources" in response_json.keys():
        resources = response_json["Resources"]
        result = {}
        for resource in resources:
            surfaceForm = resource["@surfaceForm"]
            uri = resource["@URI"]
            ref = uri.replace("http://dbpedia.org/resource/", 'dbr:')#
            ref = ref.replace("http://dbpedia.org/ontology/", 'dbo:')
            ref = ref.replace("http://dbpedia.org/property/", 'dbp:')
            
            types = resource["@types"]
            t = ''
            db = []
            for i in types.split(","):
                if "Schema:" in i:
                    #i.replace("Schema:",'')
                    i = i[7:]
                    i.strip()
                    t = i;
                if "DBpedia:" in i:
                    #i.replace("DBpedia:",'')
                    i = i[8:]
                    i.strip()
                    db.append(i);
            r = { "@URI":uri, 'Ref':ref, "Schema":t, "DBpedia":db  } 
            result[surfaceForm] = r;
        return result;
    #elif ("Resources" not in response_json.keys()) and [ annotation.lookupByName(w) for w in text ]
    else:
        tagged = semantic_parser.POStag(text)
        result = {}
        for e in tagged:
            if e[1] == 'NN':
                result[e[0]] ={ "@URI":'?uri', 'Ref':'?rdfs', "Schema":'generic', "DBpedia":'generic'  } 
        return result;


def getTemplate(text):
    result = annotate(text)
    entities = result.keys()
    n = 97 #A65 #X88
    schemas = []
    variables = {}
    temp = ""
    for e in entities:
        s = result[e]["Schema"]
        if s != '':
            p = chr(n)
            placeholder = '<'+ p.upper() +'>'
            temp = text.replace(e, placeholder)
            n += 1 
            schemas.append(s)
            variables[e] = p           
    return temp, schemas, variables ;
 
    

quest = ['am','is','are','was','were','be','do','did','does','have','has','had','can','could','shall','should','will','would']
Interrogative = ['what','who','which','whose', 'whom','when', 'where', 'why', 'how']


    
def get_header(question):
    question = str(question).strip().split()
    if question[0] in quest:
        head = False
    else:
        head = True;
    return head
    




