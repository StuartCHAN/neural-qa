#!/usr/bin/env python
# -*- coding: utf-8 -*-

from vec_utils import sentence_encoder
from TemplateGenerator import annotation
from TemplateGenerator import FALCONutil

import csv
import pickle
import os

path = "../data" #文件夹目录
files= os.listdir(path) #得到文件夹下的所有文件名称
templates_pool = []
for file in files: #遍历文件夹
     if os.path.isdir(path+"/"+file): #判断是否是文件夹，不是文件夹才打开
          templates_pool.append(file) #每个文件的文本存到list中
print('\n The existing templates pool contains these Classes: \n ', s) #打印结果


def match_templates(questions, templates, template_queries):
    texts_processed, BASE_VECTORS = sentence_encoder.get_data(templates)
    matched_proba_scores = []
    matched_templates = []
    matched_template_index = []
    for question in questions:
        matched = sentence_encoder.semantic_search(question, template_queries, BASE_VECTORS)
        matched_proba_score = matched[0]
        matched_template = matched[1]
        matched_template_idx = matched[-1]
        matched_proba_scores.append(matched_proba_score)
        matched_templates.append(matched_template)
        matched_template_index.append(matched_template_idx)
    return  matched_proba_scores, matched_templates, matched_template_index ;

        
def distribute_class(questions):    
    class_pool = []
    for question in questions:
        annotated = annotation.annotate(question)
        for k in annotated.keys():
            try:
                clas = annotated[k]['Schema']
                class_pool.append(clas)
            except:
                pass;
    return class_pool


def distribute_class(clas):
    if clas in templates_pool:
        BASE_VECTORS = pickle.load(path+"/"+ clas +"/USent2vec.pkl")
        template_queries = open(path+"/"+ clas +"/"+ clas +".template_queries.", "r", encoding="UTF-8").readlines() 
        template_questions = open(path+"/"+ clas +"/"+ clas +".template_questions.", "r", encoding="UTF-8").readlines() 
        csvFile = open(path+"/"+ clas +"/"+ clas +".csv", "a")
        #writer = csv.writer(csvFile)
        return BASE_VECTORS, template_queries, template_questions, csvFile ;



        
    
     


