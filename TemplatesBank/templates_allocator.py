#!/usr/bin/env python
# -*- coding: utf-8 -*-

from vec_utils import sentence_encoder
from TemplateGenerator import annotation
from TemplateGenerator import FALCONutil

import csv
import pickle
import os

path = "../data/Bank" #the Bank directory
files= os.listdir(path) #to get all the files/folders names in the dir
templates_pool = []
for file in files: #iterate to get the folders
     if os.path.isdir(path+"/"+file): # whether a folder 
          templates_pool.append(file) #get the folder into the templates_pool list
print('\n The existing templates pool contains these Classes: \n ', s) #display the result


def match_templates(questions):
    #texts_processed, BASE_VECTORS = sentence_encoder.get_data(templates)
    matched_proba_scores = []
    matched_templates = []
    matched_template_index = []
    class_pool = distribute_class(questions)
    for question, clas in zip(questions, class_pool):
        BASE_VECTORS, template_queries, template_questions, csvFile = distribute_class(clas)
        matched = sentence_encoder.semantic_search(question, template_queries, BASE_VECTORS)
        matched_proba_score = matched[0]
        matched_template = matched[1]
        matched_template_idx = matched[-1]
        matched_proba_scores.append(matched_proba_score)
        matched_templates.append(matched_template)
        matched_template_index.append(matched_template_idx)
        matched_query = template_queries[matched_template_idx]
        writer = csv.writer(csvFile)
        writer.writerow('dbo:'+clas+';;;'+ question +';'+ matched_query )
        csvFile.close()
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
                clas = annotated[k]['DBpedia'][0]
                class_pool.append(clas)
    return class_pool


def distribute_class(clas):
    if clas in templates_pool:
        BASE_VECTORS = pickle.load(path+"/"+ clas +"/USent2vec.pkl")
        template_queries = open(path+"/"+ clas +"/"+ clas +".template_queries.", "r", encoding="UTF-8").readlines() 
        template_questions = open(path+"/"+ clas +"/"+ clas +".template_questions.", "r", encoding="UTF-8").readlines() 
        csvFile = open(path+"/"+ clas +"/"+ clas +".csv", "a")
        #writer = csv.writer(csvFile)
        return BASE_VECTORS, template_queries, template_questions, csvFile ;



        
    
     


