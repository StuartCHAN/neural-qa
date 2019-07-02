# -*- coding: utf-8 -*-
"""
Created on Tue Jul  2 20:34:17 2019
Demo04 about the Quest2Vec
@author: Stuart on Spyder
"""


import importlib
importlib.reload(sys)
import gensim, logging
from gensim.models.doc2vec import Doc2Vec, TaggedDocument
from gensim.test.utils import get_tmpfile
import os
import jieba



# logging information
logging.basicConfig(format='%(asctime)s : %(levelname)s : %(message)s', level=logging.INFO)



# get input file, text format
fp = "F:/portfolio/GSoC/DBpedia/NSpMdatasets/QALD7Training_NSpM_Query_Templates/natural_language_template.txt"

f = open(fp,'r')
input = f.readlines()
count = len(input)
print(count) # 217



# read file and separate words
alldocs=[] # for the sake of check, can be removed
count=0 # for the sake of check, can be removed
docslist = []

with open("./natural_language_template.bin", "w", encoding="UTF-8") as output:
    for line in input:
        line = str(line).replace('\n',"")
        line = line.replace(".", "")
        line=line.replace("?","")
        line=line.replace("!","");
        if line != "" and line != " ":                       
            line = line.strip()
            seg_list = str(line).split()
            docslist.append(seg_list)
            output.write(' '.join(seg_list) + '\n')
            alldocs.append(gensim.models.doc2vec.TaggedDocument(seg_list,count)) # for the sake of check, can be removed
            count+=1 ; # for the sake of check, can be removed

documents = [TaggedDocument(doc, [i]) for i, doc in enumerate(docslist)]
model = Doc2Vec(documents, vector_size=5, window=2, min_count=1, workers=4)
model.train(documents, total_examples=model.corpus_count)
fname = get_tmpfile("my_doc2vec_model")
model.save(fname)
model = Doc2Vec.load(fname)  # you can continue training with the loaded model!



'''
# sentences = [TaggedDocument(doc, [i]) for i, doc in enumerate(alldocs)] #doesn't work
sentences = alldocs
# PV-DM w/concatenation - window=5 (both sides) approximates paper's 10-word total window size
PV_DM = Doc2Vec(sentences,dm=1, dm_concat=1, size=100, window=2, hs=0, min_count=2, workers=4)

# PV-DBOW  
PV_DBOW = Doc2Vec(sentences,dm=0, size=100, hs=0, min_count=2, workers=cores)

# PV-DM w/average
PV_DM = Doc2Vec(sentences,dm=1, dm_mean=1, size=100, window=2, hs=0, min_count=2, workers=cores)



# train and save the model
sentences= gensim.models.doc2vec.TaggedLineDocument('F:/portfolio/GSoC/DBpedia/NSpMdatasets/QALD7Training_NSpM_Query_Templates/output.seq') #'output.seq'
model = gensim.models.Doc2Vec(sentences,size=100, window=3)
model.train(sentences)
model.save('./all_model.txt')



# save vectors
out=open("all_vector.txt","wb")
for num in range(0,count):
    docvec =model.docvecs[num]
    out.write(docvec)
    #print num
    #print docvec
out.close()



# test, calculate the similarity
# the  docid strarts from 0
# 计算与训练集中第一篇文档最相似的文档
sims = model.docvecs.most_similar(0)
print( sims)
# get similarity between doc1 and doc2 in the training data
sims = model.docvecs.similarity(1,2)
print( sims)
'''

###############################################################################

from gensim.models.doc2vec import Doc2Vec
from gensim.models.doc2vec import LabeledSentence
file_path  = fp
documents = gensim.models.doc2vec.TaggedLineDocument(file_path)
model = gensim.models.doc2vec.Doc2Vec(vector_size = 100) #确定Doc2Vec要取多少个特征，这里取了5个
model.build_vocab(documents)#建立字典
model.train(documents,total_examples = model.corpus_count,epochs=model.iter)#训练模型
model.save('./all_model.txt')

