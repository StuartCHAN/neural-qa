# -*- coding: utf-8 -*-
"""
Created on Thu Aug  1 21:07:54 2019

@author: Lenovo
"""
import numpy as np

def detemplate(en_fp, sparql_fp):
    data_en = open(en_fp, 'r', encoding='UTF-8').readlines()
