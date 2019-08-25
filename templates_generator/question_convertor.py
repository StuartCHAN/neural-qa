# -*- coding: utf-8 -*-
import pandas as pd
import nltk
#import spacy
import semantic_parser 
"""
 This script is to convert the sentences extrated from the pages after preprocessiing into interogative questions:
 For example,
   sentence = " nine months later <A> was named the 2009 <B> laureate  ?"
   triple = "<http://dbpedia.org/resource/Albert_Einstein>"
"""

def convert(sentence, triple):
    """This is to convert the sentence by POS-tagging:
    """
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
    try:
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
    except:
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


def distill(predicate, triple ): 
    """This is to convert the sentences to interogative form by making use of the syntactic structure and the RDF:
    """
    try:  
        classes = semantic_parser.get_supper_class(triple)
        if any(["<http://www.w3.org/2001/XMLSchema#date>"in clas for clas in classes ]):
            interogative = "when"     
        elif "Person" in classes or "Politician" in classes or "Artist" in classes:
            interogative = "who"
        elif "Place"in classes or "Monument"in classes:
            interogative = "where"
        else:
            interogative = "what";
    except:
        interogative = "which";
    pos = str(nltk.pos_tag(predicate)[-1])
    if pos == "ADJ" :
        question = interogative + " <A> is " +predicate +" ?" 
        print("\n The question is: ", question)
        return question
    elif pos.startswith("N"):
        question = interogative + " is the "+ predicate +" of <A> ?" 
        print("\n The question is: ", question)
        return question
    elif pos.startswith("V"):
        question = interogative + " <A> "+ predicate +" ?" 
        print("\n The question is: ", question)
        return question
    else:
        question = interogative + " is the "+ predicate +" of <A> ?" 
        print("\n The question is: ", question)
        return question 
    
        