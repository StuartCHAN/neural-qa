#!/usr/bin/env python
# coding: utf-8

import numpy as np
import pandas as pd 
from nltk.translate.bleu_score import sentence_bleu

import template_generator



fp = 'F:/portfolio/GSoC/DBpedia/neural-qa/data/annotations_monument.csv' 

def read(fp):
    qs = []
    qcol = open(fp, 'r')
    for q in qcol.readlines():
        q = q.split(';')
        q = [i for i in q if (i != '') and (i != 'dbo:Monument')]
        questions = []
        for i in q:
           i = i.replace('<A>','Eiffel_Tower')
           i = i.replace('<B>','Tower')
           questions.append(i)
        qs.append(questions[0]+'?')
      return qs;  
        



def prepareQuestions(col):
    qset = []
    for c in col:
        question = c[1]
        question = str(question)
        question = question.replace('<A> ','Eiffel_Tower')
        question = question.replace('<B> ','Tower')
        qset.append(question)
    return qset;


def BLEU(qset, questions, queries):
    reference = [questions, queries]
    candidate = []
    for q in qs:
        try:
            classes, temp, query_temp = template_generator.template_generate(q)
        except :
            classes, temp, query_temp = [], '', ''
        candidate.append( [classes, temp, query_temp] );
        
     score = sentence_bleu(reference, candidate)
     print(score)  
     return score;
            
    
