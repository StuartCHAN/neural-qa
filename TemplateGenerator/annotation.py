#!/usr/bin/env python
# coding: utf-8

import requests
#import datetime
import json

'''
curl http://api.dbpedia-spotlight.org/en/annotate  --data-urlencode "text=President Obama"  --data "confidence=0.35" -H "Accept: application/json"  
'''

def annotate(text):
    headers = {
        'Accept': 'application/json',
    }
    #"President Obama"
    data = {
    "text":text ,
    'confidence': '0.35'
    }
    response = requests.post('http://api.dbpedia-spotlight.org/en/annotate', headers=headers, data=data)
    response_json = response.json()
    resources = response_json["Resources"]
    result = {}
    for resource in resources:
        surfaceForm = resource["@surfaceForm"]
        uri = resource["@URI"]
        ref = uri.replace("http://dbpedia.org/resource/", '')
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

def getTemplate(text):
    result = annotate(text)
    entities = result.keys()
    n = 65 #88
    schemas = []
    for e in entities:
        s = result[e]["Schema"]
        if s != '':
            placeholder = '<'+ chr(n)+'>'
            temp = text.replace(e, placeholder)
            n += 1 
            schemas.append(s);
    return temp, schemas ;
    


'''
if __name__ == '__main__':
    #text = """President Obama called Wednesday on Congress to extend a tax break for students included in last year's economic stimulus package, arguing that the policy provides more generous assistance."""
    #text = "President Obama"
    text = "what time is it in Chile?"
    response_json = annotate(text)
    print(response_json)
    temp = getTemplate(text) 
    print("the template is :", temp)
'''


'''
    resources = response_json["Resources"]
    result = {}
    for resource in response:
        surfaceForm = resource["@surfaceForm"]
        uri = resource["@URI"]
        types = resource["@types"]
        t = ''
        db = []
        for i in types.split(","):
            if "Schema:" in i:
                i.replace("Schema:",'')
                i.strip()
                t = i;
            if "DBpedia:" in i:
                i.replace("DBpedia:",'')
                i.strip()
                db.append(i);
        r = { "@URI":uri, "Schema":t, "DBpedia":db  } 
        result[surfaceForm] = r;
    

    #path = str(datatime.datatime())+".json"
    print ("begin to dump:")
    fp = file("result.json", 'w')
    print "dumping..."
    json.dump(response_json,fp)
    print "dumped."
    
'''
