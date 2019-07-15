# -*- coding: utf-8 -*-
"""
Created on Mon Jul  8 23:37:57 2019
Final demo
@author: Stuart
"""
import gensim
import nltk # we will try to change to spacy which is lite and swift.
from nltk.tokenize import word_tokenize
import vec_utils.vectors_distance_calculator as vectors_distance_calculator
#import vectors_distance_calculator as vectors_distance_calculator


class calculator: # the calculator to get the comparing score
         
    def __init__(self, w2v_path): #loads distributed word vectors
        print("The similarity calculator is built.")
        self.w2v_path = w2v_path
        self.model = gensim.models.KeyedVectors.load_word2vec_format(self.w2v_path, binary=False) #load Word2Vec vectors
        print("the vector model is loaded.")
        #For example:
        #self.model = gensim.models.KeyedVectors.load_word2vec_format('F:/portfolio/References/w2vDB/sgns.baidubaike.bigram-char', binary=False)
    
    def score(self, seq1, seq2, tail = 100, head = 10): # preprocessing inputs for scoring
        print(" seq1: ", seq1)
        print(" seq2: ", seq2)
        seq1_word_list = word_tokenize(seq1.strip().lower())[-tail:]
        seq2_word_list = word_tokenize(seq2.strip().lower())[:head]
        sim_score = self.similarity_score(seq1_word_list, seq2_word_list )
        print("their similarity score is: ", sim_score)
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
                    try:
                        vec=self.model[word]
                        print(word, " : ")
                    except:
                        print(word," no vector found, ")
                        pass;
                    try:
                        vec2 = self.model[word2]
                        print(word2, " : ")
                    except:
                        print(word2," no vector found...")
                        pass;
                    try:
                        sim = self.model.similarity(word, word2) # calculate the similarity distance for words
                    except:
                        sim = 0 ;
                    print(" ----> ", sim)
                    if sim > cur_max:
                        cur_max = sim ;
            if cur_max != 0:
                maxes.append(cur_max)
        if sum(maxes) == 0:
            return 0
        similarity_score = float(float(sum(maxes)) / len(maxes))
        print("then, the similarity score is: ", similarity_score)
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