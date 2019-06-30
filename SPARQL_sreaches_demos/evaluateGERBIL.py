# -*- coding: utf-8 -*-
"""
Created on Thu Jun 20 16:59:52 2019

@author: Stuart on Spyder
"""
import pandas as pd


fp = 'F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.qa.csv'

df = pd.read_csv(fp)

jf = df.to_json(r'F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.qa.json')

jd = df.to_dict()

dataset = open(fp, 'r').readlines()

row1 = df.iloc[0]['string']

data = []
questions = []
for i in range(0, 214):
    item = {}
    row = df.iloc[i]
    item['id'] = str(row['id'])
    item['answertype'] = row['answertype']
    item['answersvalue']	=row['answersvalue']
    item['query']	= str(row['query']).replace('\r\n','    ').replace('\t','')
    item['keywords'] =row['keywords']
    item['string'] =row['string']
    questions.append(row['string']) #S+'\r\n'
    data.append(item);

import json
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.qa.json', 'w', encoding='utf-8') as outfile:
    json.dump(data, outfile, ensure_ascii=False, indent=2)

with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.questions.txt', 'w') as file:
    for q in questions:
        file.write(q)
        
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.templates.csv', 'w') as file:
    for t in templates:
        if t is not False:
            #t = list(t)
            t = str(';').join(t)
            t = t.replace('\r\n',' ') + '\r\n'
            if 'dbo:' != t[0:4]:
                t = 'dbo:'+t
                file.write(t)
        else:
            file.write(' ')


templatesSet = []
for t in templates:
        if t is not False:
            #t = list(t)
            t = t[0]+';;;'+t[1]+';'+t[2]+t[-1]
            t = t.replace('\r\n',' ')
            if 'dbo:' != t[0:4]:
                t = 'dbo:'+t
                templatesSet.append(t)

templateSet = pd.DataFrame(templatesSet)
templateSet.to_csv('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.templateSet.csv')

results= {}
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/decoded_sparql.txt', 'r') as file:
    data = list(file.readlines())
    i = 0
    for l in range(0, len(data) ):
        if l%2 == 0:
            line = data[l]
            line = str(line).replace('\n','')
            results[str(i)]=line;
            i += 1

with open('F:/portfolio/GSoC/DBpedia/QALD7_task/decoded_sparql.json', 'w', encoding='utf-8') as outfile:
    json.dump(results, outfile, ensure_ascii=False, indent=2)            


with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.qa.json', 'r', encoding='utf-8') as file:    
    benchemark = {}
    j = json.load(file)
    for item in j:
        s = item["query"]
        i = item['id']
        s = s.split('    ')
        string  = [e for e in s if "PREFIX" not in e]
        s = str(' ').join(string)
        s = s.replace('res:', 'dbr:')
        benchemark[i]=s.strip()
       
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.benchemark.json', 'w', encoding='utf-8') as outfile:
    json.dump(benchemark, outfile, ensure_ascii=False, indent=2)            
       
    
###########################
 #  
er = []
forma = {"dataset": {"id": "qald-7-answers"}, "questions": [] }
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-train-multilingual.json', 'r', encoding='utf-8') as jfile:
    jf = json.load(jfile)
    i = 0
    for qa in jf["questions"]:        
        question = qa
        for quest in qa["question"]:
            if (quest["language"]== "en") and ( 'Kaurismäki' not in quest["string"])  :
                #er.append()
                ques = [quest]
                question["question"] = ques
                #
                question["id"] = str(i)
                
#                s = qa["query"]["sparql"].split('    ')
#                string  = [e for e in s if "PREFIX" not in e]
#                s = str(' ').join(string)
#                s = s.replace('res:', 'dbr:')
#                s = s.replace('\n', ' ')
                #question["query"]["sparql"] =s.strip()
                if (str(i) in benchemark.keys()):
                    question["query"] = benchemark[str(i)]
                i += 1
                forma["questions"].append(question) ;
            
toask = []        
for l in open('F:/portfolio/GSoC/DBpedia/QALD7_task/to_ask.bin').readlines():
    if len(l)>1:
        toask.append(l)

e = [r for r in er if r not in toask]

with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.answers.json', 'w', encoding='utf-8') as outfile:
    json.dump(forma, outfile, ensure_ascii=False, indent=2)            
   

from SPARQLWrapper import SPARQLWrapper, JSON, XML
import traceback
import sys

results = {}
sparql = SPARQLWrapper("http://dbpedia.org/sparql")
for b in benchemark.items():
    i = b[0]
    query = b[-1]
    try:
        sparql.setQuery(query)
        sparql.setReturnFormat(JSON)
        result = sparql.query().convert()
    except:
        print(i, query)
        sys.exc_info()
        traceback.print_exc()
        result = ' '
        print('')
    results[i] = result

p_list = []

for sub_result in result["results"]["bindings"]:
    p_list.append(str(sub_result['p']['value']).split('/')[-1].split('#')[-1])

print (p_list)
####################################
results = []
sparql = SPARQLWrapper("http://dbpedia.org/sparql")
with open('F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7_model/decoded_sparql.q.txt', 'r', encoding='utf-8') as file:
    data = list(file.readlines())
    #i = 0
    for l in range(0, len(data) ):
        if l%2 == 0:
            line = data[l]
            line = str(line).strip()
            if line[-1] != '}':
                line = line+'}'
            results.append(line)
            #results[str(i)]=line;
            #i += 1
answers = []            
for query in results:
query = '''
PREFIX res:    <http://dbpedia.org/resource/>
PREFIX dbo:    <http://dbpedia.org/ontology/>
ask where { res:Abraham_Lincoln dbo:deathPlace ?p .
           ?p dbo:website ?w .
           }
'''
query = '''ask where{<http://dbpedia.org/resource/Blue_Murder> rdfs:label ?l . ?a rdf:type dbo:TelevisionShow . ?a foaf:name ?l . ?a dbo:completionDate ?ad . ?a dbo:numberOfEpisodes ?an . ?b rdf:type dbo:TelevisionShow . ?b foaf:name ?l . ?b dbo:completionDate ?bd . ?b dbo:numberOfEpisodes ?bn . filter(?ad > ?bd && ?an > ?bn) }
'''
    try:
        sparql.setQuery(query)
        sparql.setReturnFormat(JSON)
        a = sparql.query().convert()
    except:
        print( query)
        sys.exc_info()
        traceback.print_exc()
        a = ' '
        print('')
    answers.append(a )  
        
with open('F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7_model/decoded_sparql.queries.txt', 'w', encoding='utf-8' ) as outfile:
    for result in results:
        outfile.write(str(result)+'\n')
 
###############################################
loc = [l for l in open('F:/portfolio/GSoC/DBpedia/NSpMdatasets/QALD7Training_NSpM_Query_Templates/ART.csv', 'r') ] 

locdata = [] 
for l in loc:
    l = l.split(',')  
    data = [d for d in l if (d != '')and(d != ' ')and(len(d)>1)] 
    locdata.append(data)          

benchmarks = []
templates = []
for data in locdata:
    if len(data)==5:
        nlq = data[0]
        tq = data[1]
        tqu = data[2:-1]
        tqus = str(';').join(tqu)
        query = data[-1]
    elif len(data)==4:
        nlq = data[0]
        tq = data[1]
        tqu = data[2]
        tqus = tqu+';'+tqu
        query = data[-1]
    template = 'dbo:Place;;;'+tq+';'+tqus
    benchmark = [nlq, query]
    templates.append(template)
    benchmarks.append(benchmark);

templates = []
for data in locdata:
    if len(data)==3:
        lq = data[0]
        tq = data[1]
        tqu = data[-1]
        tqus = tq+';'+tqu        
    elif len(data)==2:
        lq = data[0]
        tq = data[1]
        tqus = tq+';'+tq        
    template = 'dbo:Art;;;'+lq+';'+tqus
    templates.append(template)
    #benchmarks.append(benchmark);
    
with open('F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7_model/evatemp.art.csv', 'w', encoding='utf-8' ) as outfile:
    for temp in templates:
        outfile.write(str(temp)+'\n')

bencmkfile = pd.DataFrame(benchmarks)    
bencmkfile.to_csv('F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7_model/evabenchm.csv')



with open('F:/portfolio/GSoC/DBpedia/neural-qa/data/evatemp/to_ask_place.txt', 'w', encoding='utf-8' ) as fi:
    for ben in benchmarks:
        fi.write(str(ben[0])+'\n')
##############################################################################

from stanfordnlp.server import CoreNLPClient
from nltk.tree import Tree
with CoreNLPClient(annotators=[ 'tokenize','ssplit','pos','parse'],
                   timeout=30000,
                   output_format="json",
                   properties={'tokenize.language' :'fr',
                               'pos.model' : 'edu/stanford/nlp/models/pos-tagger/french/french.tagger',
                               'parse.model' : 'edu/stanford/nlp/models/lexparser/frenchFactored.ser.gz'}) as client :
    ann = client.annotate(text)

output = ann['sentences'][0]['parse']

###############################################################################

from SPARQLWrapper import SPARQLWrapper, JSON, XML, N3
import traceback
import sys

#sparqlset = 'F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7/QALD7/QALD7.benchmark/SPARQLset.bin'
sparqlset = '/data/DBPEDIA/neural-qa/data/QALD7.benchmark/SPARQLset.bin'
queries = [l for l in open(sparqlset, 'r') ] 

with open('/data/DBPEDIA/neural-qa/data/QALD7.benchmark/RESULTset.json', 'w', encoding='utf-8' ) as outfile:
    responses = {}
    i = 0
    for q in queries:
        q = queries[412]
        query = "select distinct ?uri where{<http://dbpedia.org/resource/You're_in_Love,_Charlie_Brown> dbo:editor ?uri . }"#str(q)
        try:
            sparql.setQuery(query)
            sparql.setReturnFormat(JSON)
            re = sparql.query().convert()
            print('Oui')
        except:
            print( query)
            sys.exc_info()
            traceback.print_exc()
            re = ' '
            print('Non')
        responses[str(i)]={'query':query, 'result':re} 
        i += 1 ;
    json.dump(responses, outfile, ensure_ascii=False, indent=2)
    print('It is finished. ')
    



with open('/data/DBPEDIA/neural-qa/data/QALD7.benchmark/RESULTset.bin', 'w', encoding='utf-8' ) as fi:
    for response in reponses:
        fi.write(str(response)+'\n')

        