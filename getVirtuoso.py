# -*- coding: utf-8 -*-
"""
Created on Sat Jul  6 18:00:16 2019

@author: Stuart
"""
import traceback
import sys
import importlib
import json
import requests
import xmltodict
from collections import OrderedDict
from SPARQLWrapper import SPARQLWrapper, JSON, XML



def getVirtuoso(query):
    data={
            'query':query,
            'default-graph-uri':'http://dbpedia.org'
            }
    response = requests.post("https://dbpedia.org/sparql", data=data)
    try:
        content = response.json()
    except:
        content = response.text;
    try:
        content = xmltodict.parse(content)
        content = json.loads(json.dumps(content, indent=4, default=str))
    except:
        content = content
    return content;
 
    
def getSPARQL(query):    
    sparql = SPARQLWrapper("http://dbpedia.org/sparql")
    sparql.setQuery(query)
    try:
        sparql.setReturnFormat(JSON)
        response = sparql.query().convert()
    except:
        sparql.setReturnFormat(XML)
        response = sparql.query().convert()
    return response;


    
def process(fp, savefile):
    questions = open(fp, "r", encoding="UTF-8").readlines()
    responset = {}
    idn = 1
    for question in questions:
        query = str(question).strip()
        try:
            response = getSPARQL(query)
        except:
            response = getVirtuoso(query)
        print(response)
        print()
        responset[str(idn)] = response
        idn += 1 ;
    #savefile = "qald-7.output.dbnqa.20190720.responset.json"
    with open(savefile, 'w', encoding='utf-8' ) as savfile:
        json.dump(responset, savfile, ensure_ascii=False, indent=4)
    print("The responset.json has been saved.")
    return responset;
        
 
def post_process(savefile):
    responset = json.load( open(savefile,'r', encoding="UTF-8") )
    cleaned_responset = {}
    for k in responset.keys():
        response = responset[k]
        try:
            result = response['sparql']['results']['result']['binding']
            cleaned_responset[k] = result
        except :
            pass;
    return cleaned_responset;
        

def make_file(template_file, cleaned_responset, questions, new_template_file):
    # template_file = "F:\\portfolio\\GSoC\\DBpedia\\QALD7_task\\20190706\\qald-7-evaluation.en.myanswers.20190706.template.json"
    template = json.load(open(template_file, 'r', encoding="UTF-8") )
    for i in range(0, len(template['questions'])):
        template['questions'][i]['query']['sparql'] = questions[i]
        idn = template['questions'][i]['id']
        idn = str(int(idn)+1)
        if idn in cleaned_responset.keys():
            if 'literal' in cleaned_responset[idn].keys() :
                typ = 'literal'
                if cleaned_responset[idn]["@name"] == 'year':
                    var = 'date'
                elif cleaned_responset[idn]["@name"] == 'num':
                    var = 'number'
                else:
                    var = 'c'
                value =  cleaned_responset[idn]['literal']["#text"] 
            else:
                typ = 'uri'
                var = 'uri' 
                value = cleaned_responset[idn]['uri'];
            #template['questions'][i]['query']['sparql'] = questions[i]
            if len(template['questions'][i]['answers']) > 0:
                if  'vars' in template['questions'][i]['answers'][0]['head'].keys():   
                    template['questions'][i]['answers'][0]['head']['vars'].clear()
                    template['questions'][i]['answers'][0]['head']['vars'].append(var)
                if 'bindings' in template['questions'][i]['answers'][0]['results'].keys():
                    template['questions'][i]['answers'][0]['results']['bindings'].clear()
                    template['questions'][i]['answers'][0]['results']['bindings'].append( {var:{'type':typ, 'value':value }} );
    #with open('qald-7-evaluation.en.myanswers.201907062337.template.json', 'w', encoding="UTF-8") as outfile:
    with open(new_template_file, 'w', encoding="UTF-8") as outfile:    
        json.dump(template, outfile, ensure_ascii=False, indent=4)
                
            
            
            
            
            
    


       
if __name__ == '__main__':
    
    importlib.reload(sys) 
    
    fp = sys.argv[1]
    # For example, 
    #fp = "F:\\portfolio\\GSoC\\DBpedia\\QALD7_task\\201906232157\\output.qald7.eva.decoded.sparql.txt" #"F:/portfolio/GSoC/DBpedia/neural-qa/data/qald7templateSet/output.201907092034.decoded.txt"#"F:/portfolio/GSoC/DBpedia/neural-qa/data/DBNQA/output.20190720.decoded.txt" #"F:/portfolio/GSoC/DBpedia/QALD7_task/output.20190709.decoded.txt" #"F:/portfolio/GSoC/DBpedia/QALD7_task/Task4/output.qald-7-train-en-wikidata.json.decoded.txt"
    
    savefile = sys.argv[2] 
    # For example,
    #savefile = "F:\\portfolio\\GSoC\\DBpedia\\QALD7_task\\201906232157\\output.qald7.eva.decoded.sparql.responset.json" #"F:/portfolio/GSoC/DBpedia/neural-qa/data/qald7templateSet/qald-7.output.qald7templateSet.201907202049.responset.json"#"F:/portfolio/GSoC/DBpedia/neural-qa/data/DBNQA/qald-7.output.dbnqa.20190720.responset.json"
    
    template_file = sys.argv[3]
    # For example,
    #template_file =  "F:\\portfolio\\GSoC\\DBpedia\\QALD7_task\\20190706\\qald-7-evaluation.en.myanswers.20190706.template.json" #'F:/portfolio/GSoC/DBpedia/neural-qa/data/DBNQA/qald-7-evaluation.dbnqa.gerbil.json' #
    
    new_template_file = sys.argv[4]
    # For example,
    #new_template_file = "F:/portfolio/GSoC/DBpedia/neural-qa/data/qald7templateSet\\UPGRADED/qald-7-evaluation.qald7.eva.gerbil.json" #"F:/portfolio/GSoC/DBpedia/neural-qa/data/qald7templateSet/qald-7.output.qald7templateSet.gerbil.json"    
    
    responset = process(fp, savefile)
        
    cleaned_responset = post_process(savefile)
        
    questions = open(fp, "r", encoding="UTF-8").readlines()
    
    make_file(template_file, cleaned_responset, questions,new_template_file)

