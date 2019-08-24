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
parser.add_argument('--temp_save_fpath', type=str, default=None)
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
    temp_save_path = args.temp_save_fpath
    
    template_questions,template_queries = parse_existing_templates(temps_fpath)
    
    if train_vec:
       BASE_VECTORS = sentence_encoder.get_data(template_questions, vecpath)
    else:
       BASE_VECTORS = pickle.load(open(vecpath,'rb')) ; 
    
    print("\n The sentences filtering process starts: ")

    #collected_set = sentences_filter.sentence_filtering(text_fpath, ntriple_fpath);
    collected_set = sentences_filter.sentence_distill(text_fpath, ntriple_fpath);

    print(" the collected set is: \n")
    _ = [print("for %(i)d th sent: %(sent)s "%{"i":i, "sent":sent }) for i, sent in enumerate(collected_set) ]
    
    templateset = []
    with open(temp_save_path, 'a', encoding='UTF-8') as save:
        print("\n ---------- templates generstion starts -------- ")
        for i, item in enumerate(collected_set) :
            print("---- %d ----- "%i )
            sentence = item.split(",")[0]
            ntriple = item.split(",")[-1]
            ntriples = str(ntriple).strip('.').split()
            triple = ntriples[-1]
            #question = question_convertor.convert(sentence, triple)
            question = sentence 
            print("\n question: ", question)
            matched = sentence_encoder.semantic_search(question, template_queries, BASE_VECTORS)
            matched_proba_score = matched[0]
            print("\n matched proba score: ", matched_proba_score)
            if matched_proba_score >= 0.9:
                print(" *pass the treshold ")
                matched_template_idx = matched[-1]
                query = template_queries[matched_template_idx]
                print("\n the matched query is : ", query)
            else: 
                print(" *below the treshold ") 
                print(" -begin to compose the template ")            
                prediacte = ntriples[1]
                subject = ntriples[0]            
                query = query_generator.compose_query(prediacte, subject);
                print("\n the composed query is : \n", query)

            template = "dbo:"+dbo_class+";;;"+question+";"+query
            print("\n TEMPLATE:   ", template)
            save.write(template+'\n')
            templateset.append(template)
            print("\n -saved- \n")
            
        save.close();
        
"""
python templates_generate_main.py  --dbo_class=Place --temps_fpath=../data/annotations_place.csv --text_fpath=../data/Bank/DBresourses/Place/Djurab_Desert/Djurab_Desert.txt --ntriple_fpath=../data/Bank/DBresourses/Place/Djurab_Desert/Djurab_Desert.ntriples --train_vec=True  --vecpath=../data/Bank/DBresourses/Place/Djurab_Desert/Djurab_Desert.vectors   --temp_save_fpath=../data/Bank/DBresourses/Place/Djurab_Desert/Djurab_Desert.template.csv   

python templates_generate_main.py  --dbo_class=Person --temps_fpath=../data/annotations_Person.csv --text_fpath=../data/Bank/DBresourses/Person/Barack_Obama/Barack_Obama.txt --ntriple_fpath=../data/Bank/DBresourses/Person/Barack_Obama/Barack_Obama.ntriples --train_vec=True  --vecpath=../data/Bank/DBresourses/Person/Barack_Obama/Barack_Obama.vectors   --temp_save_fpath=../data/Bank/DBresourses/Person/Barack_Obama/Barack_Obama.template.csv   

"""
        
    
    
