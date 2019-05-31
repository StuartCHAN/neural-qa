# -*- coding: utf-8 -*-
"""
Created on Thu May 28 11:01:38 2019

@author: Stuart
"""


import requests
import sys
import os
import re
from generator_utils import decode,fix_URI
from fuzzywuzzy import fuzz
import pandas as pd
import csv

def create_csv(path):
    with open(path,'wb') as f:
        csv_write = csv.writer(f)
        csv_head = ["question","language","NSpM","GERBIL","evaluation"]
        csv_write.writerow(csv_head)

def get_gerbil(query, lang):
    data = {
      'query': query,
      'lang': lang
    }    
    response = requests.post('http://localhost:8080/gerbil', data=data)
    response_json = response.json()
    questions = response_json["questions"]
    q = questions[0]["query"]
    sparql = q["sparql"]
    return sparql;
'''
query=u"What is the capital of Germany?"
lang='en'

re = get_gerbil(query, lang)   
j = re

re.url.__str__()
'''
def get_NSpM(encoded_sparql):
    encoded_sparql = encoded_sparql #
    decoded_sparql = decode(encoded_sparql)
    decoded_sparql = fix_URI(decoded_sparql)
    return decoded_sparql;

def compare_ratio(q1, q2):
    ratio = fuzz.ratio(q1, q2)
    return float(ratio);

if __name__ == '__main__':
    reload(sys)
    sys.setdefaultencoding("utf-8")
    args = []
    for i in range(0,len(sys.argv)):
        args.append(sys.argv[i])
    encoded_sparql = args[1]
    query_line = args[2]
    model_dir = args[3]
    lang = "en"
    nspm = get_NSpM(encoded_sparql)
    gerbil = get_gerbil(query_line, lang)
    evalu = compare_ratio(nspm, gerbil)
    print("NSpM : ", nspm)
    print("GERBIL : ",gerbil )
    print("their evaluated output is : ", evalu)
    df = pd.DataFrame(data [query_line, lang, nspm, gerbil, evalu])
    save_path = "../" + model_dir + '/evaluation.csv'
    if os.path.exists(save_path):
        df.to_csv(save_path, mode='a', header=False)
    else:
        print("It is creating the record file at : " ,save_path )
        create_csv(save_path)
        df.to_csv(save_path, header=False)
    print("");
    







