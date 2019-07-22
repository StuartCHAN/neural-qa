#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
    This is the file showing how the extraction of verbal phrases that express the entities consisting of more than one word.
'''    
import nltk
from nltk.corpus import stopwords

stopwords = stopwords.words('english')

grammar = r"""
 NBAR:
    {<NN.*|JJ>*<NN.*>}  # Nouns and Adjectives, terminated with Nouns
 NP:
    {<NBAR>}
    {<NBAR><IN><NBAR>}  # Above, connected with in/of/etc...
"""
grammar = "NP: {<DT>?<JJ>*<NN>}"
   
lemmatizer = nltk.WordNetLemmatizer()
stemmer = nltk.stem.porter.PorterStemmer()


class NounPhraseExtractor(object):

    def __init__(self, sentence):
        self.sentence = sentence

    def execute(self):
        # Taken from Su Nam Kim Paper...
        chunker = nltk.RegexpParser(grammar)
        #toks = nltk.regexp_tokenize(text, sentence_re)
        # #postoks = nltk.tag.pos_tag(toks)
        toks = nltk.word_tokenize(self.sentence)
        postoks = nltk.tag.pos_tag(toks)
        self.tree = chunker.parse(postoks)
        return self.tree

    def leaves(self):#tree
        """Finds NP (nounphrase) leaf nodes of a chunk tree."""
        for subtree in self.tree.subtrees(filter=lambda t: t.label() == 'NP'):
            yield subtree.leaves()

    def normalise(self, word):
        """Normalises words to lowercase and stems and lemmatizes it."""
        word = word.lower()
        word = stemmer.stem(word)
        word = lemmatizer.lemmatize(word)
        return word

    def acceptable_word(self, word):
        """Checks conditions for acceptable word: length, stopword."""
        accepted = bool(2 <= len(word) <= 40
                    and word.lower() not in stopwords)
        return accepted

    def get_terms(self): #,tree
        for leaf in self.leaves( ): #tree
            term = [self.normalise(w) for w, t in leaf if self.acceptable_word(w)]
        yield term

    def extract(self):
        self.execute()
        terms = self.get_terms()
        matches = []
        for term in terms:
            for word in term:
                matches.append(word)
        return matches;


sentence = 'The author writes a book.'
matches = NounPhraseExtractor(sentence).extract()

def ie_preprocess(document):
     sentences = nltk.sent_tokenize(document) 
     sentences = [nltk.word_tokenize(sent) for sent in sentences] 
     sentences = [nltk.pos_tag(sent) for sent in sentences] 
     return sentences;
 
sents = ie_preprocess(sentence)
grammar = "NP: {<DT>?<JJ>*<NN>}"
cp = nltk.RegexpParser(grammar)
result = cp.parse(sents)

for n in result: #chunked
	if isinstance(n, nltk.tree.Tree):
		if n.node=='NP':
			a = n;
            