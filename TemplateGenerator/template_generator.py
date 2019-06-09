#!/usr/bin/env python
# coding: utf-8

import sys
import os

import annotation
import query_generator

'''
def template_generate(fp):
    for q in open(fp,'r').readlines():
        query = query_generator.query_generate(q)
        temp = annotation.getTemplate(q)
'''

def template_generate(question):
        query = query_generator.query_generate(question)
        temp, schemas = annotation.getTemplate(question)
        classes = ['dbo:'+e for e in schemas]
        lines = query.splitlines(True)
        query_temp = ''
        n = 65       
        for l in lines:
                if '?x2' in l:
                        l = l.replace('?x2', '?a')
                        
                if '?x0' in l:
                        l = l.replace('?x0', '?a')
                        
                if '?x1' in l:
                        l = l.replace('?x1', '?b') 
                query_temp += ' ' + l;
        query_temp_split = query_temp.split() 
        for e in schemas:
                for q in query_temp_split :
                        if e in q :
                                p = schemas.index(e)
                                n += p
                                variable ='<'+ chr(n)+'>'
                                query_temp = query_temp.replace(q, variable);
                        if '@en' in q:
                             query_temp = query_temp.replace(q, '');   
        query_temp = query_temp.strip()
        if query_temp[-1] != '}':
                query_temp += '}'
        print question
        print classes
        print  temp
        print query_temp
        return classes, temp, query_temp;


if __name__ == "__main__":
        question = "Which movie does Audrey star ?"
        if question == '':
                question = input('please input the question: ')
        classes, temp, query_temp = template_generate(question)











