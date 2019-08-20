#!/usr/bin/env python
# -*- coding: utf-8 -*-

import wiki_extract
from vec_utils import sentence_encoder
import annotation
import FALCONutil

import csv
import pickle
import os


path = "../data/Bank" #the Bank directory
files= os.listdir(path) #to get all the files/folders names in the dir
templates_pool = []
for file in files: #iterate to get the folders
     if os.path.isdir(path+"/"+file): # whether a folder 
          templates_pool.append(file) #get the folder into the templates_pool list
print('\n The existing templates pool contains these Classes: \n ', templates_pool ) #display the result


def match_templates(questions):
    #texts_processed, BASE_VECTORS = sentence_encoder.get_data(templates)
    matched_resultset = []
    #class_pool = distribute_class(questions)
    for question in questions:
        template = {}
        clas = get_class(question)
        BASE_VECTORS, template_queries, template_questions, csvFile = distribute_class(clas)
        matched = sentence_encoder.semantic_search(question, template_queries, BASE_VECTORS)
        matched_proba_score = matched[0]
        matched_template = matched[1]
        matched_template_idx = matched[-1]
        template["matched_template_idx"] = matched_template_idx
        template["matched_proba_scores"] = matched_proba_score
        template["matched_templates"] = matched_template
        template["matched_template_index"] = matched_template_idx
        matched_query = template_queries[matched_template_idx]
        template["matched_query"] = matched_query 
        matched_resultset.append(template)
        writer = csv.writer(csvFile)
        writer.writerow('dbo:'+clas+';;;'+ question +';'+ matched_query +'\n')
        csvFile.close()
    return matched_resultset ;

        
def get_class(question):    
    #class_pool = []
    #for question in questions:
    annotated = annotation.annotate(question)
    for k in annotated.keys():
        try:
            clas = annotated[k]['Schema']
            #class_pool.append(clas)
        except:
            clas = annotated[k]['DBpedia'][0]
            #class_pool.append(clas)
    return clas#s_pool


def distribute_class(clas):
    if (clas in templates_pool) and ( os.path.exists(path+'/'+clas)):
        BASE_VECTORS = pickle.load(path+"/"+ clas +"/USent2vec.pkl")
        template_queries = open(path+"/"+ clas +"/"+ clas +".template_queries.", "r", encoding="UTF-8").readlines() 
        template_questions = open(path+"/"+ clas +"/"+ clas +".template_questions.", "r", encoding="UTF-8").readlines() 
        csvFile = open(path+"/"+ clas +"/"+ clas +".csv", "a")
        #writer = csv.writer(csvFile)
        return BASE_VECTORS, template_queries, template_questions, csvFile ;



        
    
     


