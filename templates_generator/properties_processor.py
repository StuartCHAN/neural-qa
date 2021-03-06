# -*- coding: utf-8 -*-
"""
Created on Wed Jul 10 12:21:50 2019

@author: Lenovo
"""
import numpy as np
import string
import gensim
from gensim.scripts.glove2word2vec import glove2word2vec
from vec_utils.similarity_calculator import calculator
#from similarity_calculator import calculator
from semantic_parser import hasProperties  

#default path is in the "data/glove2wordvec" folder, but your can set this to your own path
your_glove_path = '../data/glove2wordvec/word2vec.6B.300d.txt'


def glove_to_w2v(glove_input_file, word2vec_output_file):
    (count, dimensions) = gensim.scripts.glove2word2vec.glove2word2vec(glove_input_file, word2vec_output_file)
    print("The count is: ", count, ' , \n and the dimension is: ', dimensions)
 
    
# This is to pre-process the string of entities like the URL links of the DBpedia entites to transform into a readable string,
# for example: the "http://dbpedia.org/ontology/spouse" will be transformed into the "spouse" that is fit for word2vec model mapping.
def property_process(strin ):
    if "/" in strin:
        strin = str(strin).split("/")[-1]
    elif ":" in strin:
        strin = str(strin).split(":")[-1]
    stri =str().join( [s  if s in string.ascii_lowercase else " "+str(s).lower() for s in strin])
    return stri;


# This is the function to compare the similarity between a phrase and a list of strings of the properties
def get_most_similar(phrase, strins_list):
    print("The properties processor is going to work: ")
    scores_list = []
    scores_map = {}
    print("The GloVe path is in: ", your_glove_path)
    property_calculator = calculator(your_glove_path)    
    for strin in strins_list:
        print(strin)
        strin = property_process(strin )
        print(strin)
        if len(str(strin).split())==1: # if there is only a single string to compare, we just use gensim.
            try:
                score = property_calculator.model.similarity(phrase, strin)
            except:
                score = property_calculator.score(phrase, strin)
        elif len(str(strin).split()) >1: # else if it's long and numerous, we use our own method.
            score = property_calculator.score(phrase, strin)
        print(score)
        scores_list.append(score)
        scores_map[strin] = score
    max_score = max(scores_list)
    print("the scores map is : \n ", scores_map)
    print("The closet is: ", max_score)
    sims = [strin for strin in scores_map.keys() if max_score==scores_map[strin] ]
    print(sims)
    return sims ;


# This is the pipeline for all the functions above:
class properties_processor:
    def __init__(self):
        self.vec_file = your_glove_path
    def process(self, dbr, phrase ):
        self.properties = hasProperties(dbr)
        print(" The Properties are: \n ", self.properties)
        sims = get_most_similar(phrase, self.properties )
        sim_properties = [[properti for properti in self.properties if s in properti] for s in sims]
        print(" The most similar : ", sim_properties)
        sim_properti = sim_properties[0][0]
        print(" ----> ",sim_properti)
        return sim_properti
        

