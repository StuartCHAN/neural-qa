# -*- coding: utf-8 -*-
"""
Created on Mon Jul 28 08:41:43 2019

@author: Lenovo
"""
import pandas as pd

templates = open('../data/SentencesEncoder/annotations_SportsLeague.csv', 'r', encoding="UTF-8").readlines()  

templateSet = [str(template).strip().split(';') for template in templates ]


questions = []
for templateset in templateSet:
    for template in templateset:
        if (template != '') and ('dbo:' not in template) and ('{' not in template):
            questions.append(template+'?')

with open('./annotations_SportsLeague.questions.bin', 'w', encoding='UTF-8') as out:
    for question in questions:
        out.write(question+' \n')
        
paraphrases =[str(paraphrase).replace('< A >', '<A>') for paraphrase in open('./annotations_SportsLeague.questions.paraphrased.bin', 'r', encoding='UTF-8').readlines() ]        
paraphrases =[str(paraphrase).replace('< B >', '<B>') for paraphrase in paraphrases ]        

with open('./annotations_SportsLeague.questions.paraphrased.bin', 'w', encoding='UTF-8') as save:
    for paraphrase in paraphrases:
        if paraphrase[0] != ' ':
            save.write(paraphrase.strip()+' \n')

temp_queries = [template[-2:] for template in templateSet]
with open('./annotations_SportsLeague.temp_queries.bin', 'w', encoding='UTF-8') as save:
    for temp_query in temp_queries:
        save.write(str(';').join(temp_query)+' \n')
     