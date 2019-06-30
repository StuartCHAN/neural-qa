#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
In this file,
list the methods that we would deploy in the future based on the NLTK tools. 
'''

###############################################

import nltk

question = "If you are a few years out of school, Google no longer requires you to submit your transcript, so whether or not you are selected for an interview mostly depends on your work experience, and having a referral makes it fairly likely that you will be selected."

tokens = nltk.word_tokenize(question)
tagged = nltk.pos_tag(tokens)
#entities = nltk.chunk.ne_chunk(tagged)
ent = nltk.chunk.ne_chunk(tagged)

Entities = []
for t in tagged :
    e = {str(t[0]) : str(t[1]) }
    Entities.append(e)

##################################################

    
from nltk.parse.stanford import StanfordDependencyParser

path_to_jar = 'E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser.jar'
path_to_models_jar = 'E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser-3.9.2-models.jar'

dependency_parser = StanfordDependencyParser(path_to_jar=path_to_jar, path_to_models_jar=path_to_models_jar)

sent = 'I shot an elephant in my sleep'

result = dependency_parser.raw_parse(sent)
#result = dependency_parser.parse(sent)
dep = result.next()

list(dep.triples())

import spacy

nlp = spacy.load('en')
sents = nlp(u'A woman is walking through the door.')

#################################################

import os
from nltk.parse import stanford

os.environ['STANFORD_PARSER'] = 'E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser.jar'
os.environ['STANFORD_MODELS'] = 'E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser-3.9.2-models.jar'

parser = stanford.StanfordParser(model_path="E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser-3.9.2-models/edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz")
sentences = parser.raw_parse_sents(("Hello, My name is Melroy.", "What is your name?"))
sents = list(sentences)
for s in sents[0]: #.triples()
    print(s)
'''
(ROOT
  (S
    (INTJ (UH Hello))
    (, ,)
    (NP (PRP$ My) (NN name))
    (VP (VBZ is) (ADJP (JJ Melroy)))
    (. .)))
'''

####################################3

from nltk.parse.stanford import StanfordDependencyParser

eng_parser = StanfordDependencyParser(r"E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser.jar",r"E:/nltk_data/stanford-parser-full-2018-10-17/stanford-parser-3.9.2-models.jar",r"E:\nltk_data\stanford-parser-full-2018-10-17\stanford-parser-3.9.2-models\edu\stanford\nlp\models\lexparser\englishPCFG.ser.gz")
s = "the quick brown fox jumps over the lazy dog"
question = 'What is job of the wife of Obama ?'
res = list(eng_parser.parse(question.split()))

rows = []
for row in res[0].triples():
    r = (row[0][0], row[-1][0])
    rows.append(r);

pairs = []   
for i in range(0, len(rows)):
    if ( (i+1) < len(rows) ) and rows[i][-1] == rows[i+1][0]:
        pair = (rows[i][0], rows[i][-1], rows[i+1][-1])
        pairs.append(pair)
        pairs.append(rows[i])
    else:
        pairs.append(rows[i])
    
'''
(('fox', 'NN'), 'det', ('the', 'DT'))
(('fox', 'NN'), 'amod', ('quick', 'JJ'))
(('fox', 'NN'), 'amod', ('brown', 'JJ'))
(('fox', 'NN'), 'dep', ('jumps', 'NNS'))
(('jumps', 'NNS'), 'nmod', ('dog', 'NN'))
(('dog', 'NN'), 'case', ('over', 'IN'))
(('dog', 'NN'), 'det', ('the', 'DT'))
(('dog', 'NN'), 'amod', ('lazy', 'JJ'))
'''
ne_tree = ne_chunk(pos_tag(word_tokenize(ex)))
print(ne_tree)


##############################################
import spacy
from nltk import Tree


en_nlp = spacy.load('en')

doc = en_nlp("The quick brown fox jumps over the lazy dog.")

def to_nltk_tree(node):
    if node.n_lefts + node.n_rights > 0:
        return Tree(node.orth_, [to_nltk_tree(child) for child in node.children])
    else:
        return node.orth_


#[to_nltk_tree(sent.root).pretty_print() for sent in doc.sents]
####################################################################
        
from __future__ import unicode_literals
import spacy,en_core_web_sm
import textacy

nlp = en_core_web_sm.load()
sentence = 'The author is writing a new book.'
pattern = r'<VERB>?<ADV>*<VERB>+'
doc = textacy.Doc(sentence, lang='en_core_web_sm')
lists = textacy.extract.pos_regex_matches(doc, pattern)
for list in lists:
    print(list.text);