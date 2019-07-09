# -*- coding: utf-8 -*-
"""
Created on Wed Jun 26 22:04:21 2019

@author: Stuart on Spyder
"""
#import nltk
#from nltk.translate.bleu_score import sentence_bleu 
import json
import pandas as pd
import numpy as np
from template_generator import template_generater
from bleu import compute_bleu


tempfile = 'F:/portfolio/GSoC/DBpedia/NSpMdatasets/QALD7Training_NSpM_Query_Templates/NSpMQueryTemplatesQALD7QT.LOC.csv'   

def placeholder(string):
    if ('<' in string) or ('>' in string) or ('?' in string):
        string = 'PLACEHOLDER'
    return string;
    
def preprocess(strings):
    if strings == '' or strings == ' ' or len(strings)<1 :
        return 'PLACEHOLDER'
    elif isinstance(strings, list) :
        strings = [placeholder(string) for string in strings]
        return strings;

def evaluateBLEU(tempfile):
    temps = pd.read_csv(tempfile, header=None)
    questions = list(temps[0])
    standard_temp_quest = [preprocess(str(sq).split()) for sq in list(temps[1])] 
    standard_temp_query = [preprocess(str(sq).split()) for sq in list(temps[2])] 
    #standard_temp_Query = list(temps[3])
    standard_sparql = [preprocess(str(sq).split()) for sq in list(temps[4])] 
    templates = []
    for quest in questions:
            #print(quest)
            # quest = questions[1]
            try:            
                template = template_generater(quest)
                #print(template)
            except:
                template = ['placeholder', 'placeholder', 'placeholder', 'placeholder'] 
                #print('__________');
            templates.append(template);
            
    templateset = [list(template) for template in templates ]
    templateset = pd.DataFrame(templateset)
    temp_quest = [preprocess(str(tq).split()) for tq in list(templateset[1]) ]
    temp_query = [preprocess(str(tq).split()) for tq in list(templateset[2]) ]
    temp_Query = [preprocess(str(tq).split()) for tq in list(templateset[3]) ]
    
    assert(len(questions)==len(standard_temp_quest))and(len(templates)==len(standard_temp_query))
    length = len(templates)
    scoreset = []
    for i in range(0, length):
        quest_score = compute_bleu(standard_temp_quest[i], temp_quest[i] )
        query_score = compute_bleu(standard_temp_query[i], temp_query[i] )
        Query_score = compute_bleu(standard_temp_query[i], temp_Query[i] )
        #query_scores = (query_score + Query_score)/2.0
        scores = [quest_score, query_score, Query_score]
        scoreset.append(scores);
        
    quest_scores = compute_bleu(standard_temp_quest, temp_quest  )
    query_scores = compute_bleu(standard_temp_query , temp_query  )
    Query_scores = compute_bleu(standard_temp_query , temp_Query  )
    result = {'ensemble':{'quest_scores':quest_scores, 'query_scores':query_scores, 'Query_scores':Query_scores}, 'individuals':scoreset}
    
    return result ;


#def evaluateBLEU(tempfile):
#    temps = pd.read_csv(tempfile, header=None)
#    questions = list(temps[0])
#    standard_temp_quest = list(temps[1])
#    standard_temp_query = list(temps[2])
#    #standard_temp_Query = list(temps[3])
#    standard_sparql = list(temps[4])
#    templates = []
#    for quest in questions:
#            #print(quest)
#            # quest = questions[1]
#            try:            
#                template = template_generater(quest)
#                #print(template)
#            except:
#                template = ['placeholder', 'placeholder', 'placeholder', 'placeholder'] 
#                #print('__________');
#            templates.append(template)
#            #print();
#    assert(len(questions)==len(standard_temp_quest))and(len(templates)==len(standard_temp_query))
#    length = len(templates)
#    scoreset = []
#    for i in range(0, length):
#        template = templates[i]
#        if (type(template) is not str):
#            temp_quest = placeholder(template[1])
#            temp_query = placeholder(template[2])
#            temp_Query = placeholder(template[3])
#            #score = sentence_bleu(reference, candidate)
#            quest_score = sentence_bleu(str(standard_temp_quest[i]).split(), str(temp_quest).split() )
#            query_score = sentence_bleu(str(standard_temp_query[i]).split(), str(temp_query).split() )
#            Query_score = sentence_bleu(str(standard_temp_query[i]).split(), str(temp_Query).split() )
#            query_scores = (query_score + Query_score)/2.0
#            scores = (quest_score, query_scores)
#        else:
#            scores = (0, 0)
#        scoreset.append(scores);
#    return scoreset ;


if __name__ == '__main__':
    result = evaluateBLEU(tempfile)
    with open('./templatesEvaluations.json', 'w', encoding='utf-8') as outfile:
        #print('saving...')
        json.dump(result, outfile, ensure_ascii=False, indent=4)  
    print('ok!')
    
    #scoreset.to_csv('./bleu_score.csv')
    
    
    
    
    
    
    
    

