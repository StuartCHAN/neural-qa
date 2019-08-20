# -*- coding: utf-8 -*-
"""

"""
from vec_utils import sentence_encoder
import sentences_filter
import question_convertor
import query_generator
import pickle
import pandas as pd

import argparse
parser = argparse.ArgumentParser(description='manual to this script')
parser.add_argument('--dbo_class', type=str, default = None)
parser.add_argument('--temps_fpath', type=str, default = None)
parser.add_argument('--text_fpath', type=str, default = None)
parser.add_argument('--ntriple_fpath', type=str, default = None)
parser.add_argument('--train_vec', type=bool, default=False)
parser.add_argument('--vecpath', type=str, default = None)
parser.add_argument('--temp_save_path', type=str, default=None)
args = parser.parse_args()
#print( args.dbo_class)
#print( args.temps_fpath)





def parse_existing_templates(fpath):
    temps = pd.read_csv(fpath)
    rows = [str(list(row[-1])[0]) for row in temps.iterrows()]
    parts = [[part for part in row.strip(';').strip().split(';') if (part !='' and part!=' ' and 'dbo:' not in part) ] for row in rows ]
    template_questions = []
    template_queries = []
    for part in parts:
        template_questions.append(part[0] )
        template_queries.append(str(';').join(part[-2:]) )
    return template_questions,template_queries ; 
        
    
    




if __name__ == "__main__":
    
    
    dbo_class = args.dbo_class
    temps_fpath = args.temps_fpath
    text_fpath = args.text_fpath
    ntriple_fpath = args.ntriple_fpath
    train_vec = args.train_vec
    vecpath = args.vecpath
    temp_save_path = args.temp_save_path
    
    template_questions,template_queries = parse_existing_templates(temps_fpath)
    
    if train_vec:
       BASE_VECTORS = sentence_encoder.get_data(template_questions, vecpath)
    else:
       BASE_VECTORS = pickle.load(vecpath) ; 
    
    collected_set = sentences_filter.sentence_filtering(text_fpath, ntriple_fpath);
    
    templateset = []
    with open(temp_save_path, 'a', encoding='UTF-8') as save:
        for item in collected_set :
            sentence = item.split(",")[0]
            ntriple = item.split(",")[-1]
            ntriples = str(ntriple).strip('.').split()
            triple = ntriples[-1]
            question = question_convertor.convert(sentence, triple)
            
            matched = sentence_encoder.semantic_search(question, template_queries, BASE_VECTORS)
            matched_proba_score = matched[0]
            
            if matched_proba_score >= 0.9:
                matched_template_idx = matched[-1]
                query = template_queries[matched_template_idx]
            else:             
                prediacte = ntriples[1]
                subject = ntriples[0]            
                query = query_generator.compose_query(prediacte, subject);
                
            template = "dbo:"+dbo_class+";;;"+question+";"+query
            save.write(template+'\n')
            templateset.append(template)
            
        save.close();
        
        
        
    
    
