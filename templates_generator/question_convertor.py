# -*- coding: utf-8 -*-
import pandas as pd

import nltk

import semantic_parser 

 
sentence = " nine months later <A> was named the 2009 <B> laureate  ?"

triple = "<http://dbpedia.org/resource/Albert_Einstein>"


def convert(sentence, triple):
    text = []
    for s in str(sentence).split():
        if ('<' not in s and '>' not in s and s != "<A>"):
            text.append(s)
        elif s == "<A>":
            text.append('$')
        elif s != "<A>" and('<' in s and '>' in s):
            text.append('#');
    sentence = str(' ').join(text)
    tokens = nltk.word_tokenize(sentence)
    tagged = nltk.pos_tag(tokens)
    
    classes = semantic_parser.get_supper_class(triple)
    #v =any(["<http://www.w3.org/2001/XMLSchema#date>"in clas for clas in classes ])
    if any(["<http://www.w3.org/2001/XMLSchema#date>"in clas for clas in classes ]):
       interogative = "when"     
    elif "Person" in classes:
        interogative = "who"
    elif "Place"in classes or "Monument"in classes:
        interogative = "where"
    else:
        interogative = "what";
        
    auxiliary_verbs = [i for i, w in enumerate(tagged) if w[1] == 'V']
    if auxiliary_verbs:
        tagged.insert(0, tagged.pop(auxiliary_verbs[0]))
    elif interogative == "who":
        tagged.insert(0, ('is', 'VBD'))
    else:
        tagged.insert(0, ('did', 'VBD'));
    tagged.insert(0, (interogative, 'WRB'))
    question = str(' ').join([t[0] for t in tagged if "#" not in t ])
    question = question.replace("$", "<A>")
    return question


"""

sentences = open('../data/Bank/Person/Barack_Obama/Barack_Obama.csv','r', encoding='UTF-8').readlines()
 
with open('./data/Bank/Person/Barack_Obama/new/Statue_of_Liberty.filtered.theta.templates.csv','a', encoding='UTF-8') as templateset:
    for row in pd.read_csv('./data/Bank/Person/Barack_Obama/new/Statue_of_Liberty.filtered.theta.questions.csv').iterrows():
        try:
            item = list(row[-1])
            sentence = item[0]
            triple = str(item[-1]).split()[-2]
            template = convert(sentence, triple)
            templateset.write(str(" , ").join([template, triple])+'\n')
        except:
            pass;
"""        
        