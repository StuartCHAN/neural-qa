# -*- coding: utf-8 -*-
"""
Created on Tue Aug 13 21:14:54 2019

@author: Lenovo
"""
from nltk.corpus import wordnet
from nltk.stem import PorterStemmer 

   
ps = PorterStemmer() 

def paraphrase(word):
    word = str(word).strip().lower()
    synsets = wordnet.synsets(word)
    #synonyms = [[[lemma.name() for lemma in synonym.lemmas()] for synonym in synset.hyponyms()] for synset in synsets ]
    synonyms = [[lemma.name() for lemma in synonym.lemmas()] for synonym in synsets[0].hyponyms()]
    
    synonymset = []
    for synonym in synonyms :
        for syn in synonym:
            syn = str(syn).replace('_', ' ').lower()
            if len(syn.split()) == 1:
                syn = ps.stem(syn)
            synonymset.append(syn) ;
    #synonymset.append(word)
    synonymset = list(set(synonymset))
    synonymset.insert(0, word)
    return synonymset

#    
#word = "parents"
#synonymset = paraphrase(word)



