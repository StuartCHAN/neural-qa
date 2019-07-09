# -*- coding: utf-8 -*-
"""
Created on Mon Jul  8 23:37:57 2019
Final demo
@author: Stuart
"""
import gensim
import nltk
from nltk.tokenize import word_tokenize
import vec_utils.vectors_distance_calculator as vectors_distance_calculator


class calculator: # the calculator to get the comparing score
         
    def __init__(self, w2v_path): #loads distributed word vectors
        self.w2v_path = w2v_path
        self.model = gensim.models.Word2Vec.load(self.w2v_path,mmap='r') #load Word2Vec vectors
        
    
    def score(self, seq1, seq2, tail = 100, head = 10): # preprocessing inputs for scoring
        
        seq1_word_list = word_tokenize(seq1.strip().lower())[-tail:]
        seq2_word_list = word_tokenize(seq2.strip().lower())[:head]
        sim_score = self.similarity_score(seq1_word_list, seq2_word_list )
        return sim_score
   
    
    def similarity_score(self, wordlist1, wordlist2 ): # calculate the similarity and de the comparison
        maxes = []
        for word in wordlist1:
            cur_max = 0
            for word2 in wordlist2:
                if word == word2:
                    sim = 1
                    cur_max = sim
                elif word in self.model.vocab and word2 in self.model.vocab:
                    vec=self.model[word]
                    vec2 = self.model[word2]
                    sim = vectors_distance_calculator.jaccard_similarity_coefficient_distance(vec, vec2) # calculate the Jaccard similarity coefficient distance for words
                    if sim > cur_max:
                        cur_max = sim ;
            if cur_max != 0:
                maxes.append(cur_max)
        if sum(maxes) == 0:
            return 0
        similarity_score = float(float(sum(maxes)) / len(maxes))
        return similarity_score ;
        
#    def similarity_score(self, wordlist1, wordlist2 ):
#        maxes = []
#        for word in wordlist1:
#            cur_max = 0
#            for word2 in wordlist2:
#    				if word == word2: #case where words are identical
#    					sim = 1
#    					cur_max = sim
#    				elif word in self.model.vocab and word2 in self.model.vocab:
#    					vec=self.model[word]
#    					vec2 = self.model[word2]
#    					sim = vectors_distance_calculator.jaccard_similarity_coefficient_distance(vec, vec2)
#    					if sim > cur_max:
#    						cur_max = sim ;
#			if cur_max != 0:
#				maxes.append(cur_max)
#        if sum(maxes) == 0:
#            return 0
#        similarity_score = float(float(sum(maxes)) / len(maxes))
#        return similarity_score
#        		
#    	
#    	