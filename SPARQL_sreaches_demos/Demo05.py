#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Here is the continual processing for the previous demo04.py

############################################################################### 
                   
for k in resultsetj.keys():
    if (type(resultsetj[k]) is str) and (str(resultsetj[k]) in ['True','False'] ):
         answer = [{"head": {}, "boolean": str(resultsetj[k]).lower(), "results": {} }] 
         answerSet[k] = answer
    
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.answers.json', 'r', encoding='utf-8') as srcf:    
    forma = json.load(srcf)
    for i in range(0, len(forma['questions']) ):
        forma['questions'][i]['answers'].clear()
        idn = forma['questions'][i]['id']
        if idn in answerSet.keys():
            forma['questions'][i]['answers'].append(answerSet[idn])
        
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/qald-7-evaluation.en.answers.20190624.json', 'w', encoding='utf-8') as outfile:
    json.dump(forma, outfile, ensure_ascii=False, indent=4)  
    
    

with open('F:/portfolio/GSoC/DBpedia/QALD7_task/201906232157/output.qald7.eva.decoded.sparql', 'r', encoding='utf-8') as file:
    lines = [l for l in file.readlines() if l[0] != ' ']
    queris = {}
    i = 0
    for l in lines:
        queris[str(i)] = l
        i += 1


   
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/201906232157/FINAL/qald-7-evaluation.en.myanswers.json', 'r', encoding='utf-8') as benchmark:    
    jf = json.load(benchmark)
    for i in range(0, len(jf['questions']) ):        
        d = jf['questions'][i]['id']
        jf['questions'][i]['query'] = queris[d]

questions = jf['questions']
    
with open('F:/portfolio/GSoC/DBpedia/QALD7_task/201906232157/FINAL/qald-7-evaluation.en.myanswers.json', 'w', encoding='utf-8') as outfile:           
    json.dump(jf, outfile, ensure_ascii=False, indent=4)      


questions = [str(q) for q in open('F:/portfolio/GSoC/DBpedia/QALD7_task/to_ask.bin') if q!= '']


