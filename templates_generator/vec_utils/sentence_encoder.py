# -*- coding: utf-8 -*-

from __future__ import absolute_import
from __future__ import print_function

import numpy as np
np.random.seed(1337)  # for reproducibility

import numpy as np
import pandas as pd

import tensorflow as tf
import tensorflow_hub as hub
import re

import pickle

from sklearn.preprocessing import MultiLabelBinarizer

from spacy.lang.en import English

from keras import backend as K
from keras.optimizers import Adam

from keras.layers.core import Lambda, Dense
from keras.layers import Input, Flatten
from keras.models import Model

import random
from keras.models import Sequential
from keras.layers.core import *
from keras.optimizers import SGD, RMSprop



module_url = "https://tfhub.dev/google/universal-sentence-encoder-large/3" #@param ["https://tfhub.dev/google/universal-sentence-encoder/2", "https://tfhub.dev/google/universal-sentence-encoder-large/3"]

embed = hub.Module(module_url)


def get_features(texts):
    if type(texts) is str:
        texts = [texts]
    with tf.Session() as sess:
        sess.run([tf.global_variables_initializer(), tf.tables_initializer()])
        return sess.run(embed(texts))


nlp = English()


def remove_stopwords_and_punctuations(text):  
  customize_spacy_stop_words = ["'ve", "n't", "\n", "'s"] #removed "rt" from the list  
  for w in customize_spacy_stop_words:
    nlp.vocab[w].is_stop = True
    parsed_text = nlp(text)
    tokens = [(token.text) for token in parsed_text if not token.is_stop and not token.is_punct]
    return ' '.join(tokens)
  
  
def lemmatize_text(text):       
  text = nlp(text)
  text = ' '.join([word.lemma_ if word.lemma_ != '-PRON-' else word.text for word in text])
  return text


def preprocess_text(text):  
  text=re.sub('rt','', text)
  text = re.sub(' +', ' ', text)  # remove extra whitespace
  text = re.sub('@[^\s]+', '.', text) #remove username
  text = re.sub(r"http\S+", "", text) # remove url
  text = lemmatize_text(text)
  text = remove_stopwords_and_punctuations(text)
  text = str(text).replace('\n', '')
  text=re.sub(' +', ' ',text) # replace more than one space with one space
  text = text.strip()  # remove whitespaces  
  return text



"""## Preprocessing"""

def get_data(texts, path):
    texts_processed = [preprocess_text(text.lower()) for text in texts]
    IDS = list(np.arange(0, len(texts_processed)) )
    BASE_VECTORS = get_features(texts_processed)    
    U_sent2vec=dict.fromkeys(IDS)   
    for id, vec in zip(U_sent2vec, BASE_VECTORS):      
      U_sent2vec[id]=vec    
    print("\nThe U_sent2vec length is: ", len(U_sent2vec) )  
    #save universal sentence encoded features of tweets into pkl obj      
    pickle.dump( U_sent2vec, open( "../data/dataset/"+ path+"/USent2vec.pkl", "wb" ) )
    return BASE_VECTORS ;



"""# One-Shot Learning:"""

def contrastive_loss(y, d):
    """ Contrastive loss from Hadsell-et-al.'06
        http://yann.lecun.com/exdb/publis/pdf/hadsell-chopra-lecun-06.pdf
    """
    margin = 1
    return K.mean(y * K.square(d) + (1 - y) * K.square(K.maximum(margin - d, 0)))
  

def euclidean_distance(inputs):
    assert len(inputs) == 2, \
        'Euclidean distance needs 2 inputs, %d given' % len(inputs)
    u, v = inputs
    return K.sqrt((K.square(u - v)).sum(axis=1, keepdims=True))


def create_base_network(input_shape):
    '''Base network to be shared (eq. to feature extraction).
    '''
    input = Input(shape=(input_shape,))
    #x = Flatten()(input)
    x = Dense(512, activation=None)(input)
#     x = Dropout(0.1)(x)
#     x = Dense(128, activation='relu')(x)
#     x = Dropout(0.1)(x)
#     x = Dense(128, activation='relu')(x)
    return Model(input, x)


def eucl_dist_output_shape(shapes):
    shape1, shape2 = shapes
    return (shape1[0], 1)


def siamesa_model(input_shape):
  base_network = create_base_network(input_shape)
  input_a = Input(shape=(input_shape, ))
  input_b = Input(shape=(input_shape, ))
  # because we re-use the same instance `base_network`,
  # the weights of the network
  # will be shared across the two branches
  processed_a = base_network(input_a)
  processed_b = base_network(input_b)  
  # Getting the L1 Distance between the 2 encodings
  L1_layer = Lambda(lambda tensor:K.abs(tensor[0] - tensor[1]))
  # Add the distance function to the network
  L1_distance = L1_layer([processed_a, processed_b])  
  prediction = Dense(1,activation='sigmoid')(L1_distance)
  model = Model(inputs=[input_a,input_b],outputs=prediction)
  optimizer = Adam(lr = 0.00006)
  model.compile(loss="binary_crossentropy",optimizer=optimizer)     
  return model
  
  
oneshot_model =siamesa_model(512) 
  
oneshot_model.summary()


def siamesa_model(input_shape=512):  
  left_input = Input((1,512))  
  right_input = Input((1,512))  
  model=Se      
  # Add a customized layer to compute the absolute difference between the encodings
  L1_layer = Lambda(lambda tensors:K.abs(tensors[0] - tensors[1]))  
  L1_distance = L1_layer([left_input, right_input])
  # Add a dense layer with a sigmoid unit to generate the similarity score
  prediction = Dense(1,activation='sigmoid')(L1_distance)  
  prediction = Model(inputs=[left_input, right_input], outputs=prediction)  
  return prediction


def initialize_bias(shape, name=None):
    """
        The paper, http://www.cs.utoronto.ca/~gkoch/files/msc-thesis.pdf
        suggests to initialize CNN layer bias with mean as 0.5 and standard deviation of 0.01
    """
    return np.random.normal(loc = 0.5, scale = 1e-2, size = shape)


def test_similarity(text1, text2):
    vec1 = get_features(text1)[0]
    vec2 = get_features(text2)[0]        
    vec1=vec1.reshape(1,512)    
    vec2=vec2.reshape(1,512)   
    #similarity_score=oneshot_model.fit(x=[vec1,vec2], y=targets, batch_size=1,epochs=1)
    similarity_score = oneshot_model.predict(x=[vec1,vec2])    
    return similarity_score


"""#Semantic Matching/Searching"""

def cosine_similarity(v1, v2):
    mag1 = np.linalg.norm(v1)
    mag2 = np.linalg.norm(v2)
    if (not mag1) or (not mag2):
        return 0
    return np.dot(v1, v2) / (mag1 * mag2)


def semantic_search(query, texts_processed, vectors):
    query = preprocess_text(query)
    print("\n Extracting features...")
    query_vec = get_features(query)[0].ravel()
    res = []
    for i, d in enumerate(texts_processed):
        qvec = vectors[i].ravel()
        sim = cosine_similarity(query_vec, qvec)
        res.append((sim, d[:100], i))
        
    sorted(res, key=lambda x : x[0], reverse=True)
    return res[0] ;

#res = semantic_search("This is a sentence. ", texts_processed, BASE_VECTORS)

