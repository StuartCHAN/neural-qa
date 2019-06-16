#!/usr/bin/env python
# coding: utf-8

import sys
import os
import json

import annotation
import query_generator
import semantic_parser


'''
def template_generate(fp):
    for q in open(fp,'r').readlines():
        query = query_generator.query_generate(q)
        temp = annotation.getTemplate(q)
'''

be = ['NNP','VBZ','IN','WRB']
Interrogative = ['what','who','Which','whose', 'whom','when', 'where', 'why', 'how']

def template_generater(question):
        #query = query_generator.query_generate(question)
        result = annotation.annotate(question)
        quest = question.split()
        #tagged = semantic_parser.POStag(question) 
        
        temp, schemas,variables = annotation.getTemplate(question)
        classes = ['dbo:'+e for e in schemas]
        
        relations = []
        for q in quest:
            if (q not in variables.keys()) and (q in result.keys() ):
                relations.append((q, result[q]));
        
        condition = []
        for q in quest:
            if q in result.keys():
                e = '?'+str(variables[q]).lower()
                qe = '<%s>'%str(variables[q]) + ' <%s> ' + e + ' .\n'
                condition.append(qe)
            elif (q in result.keys()) and (q not in variables.keys() ):
                e = condition[-1]
                qe ="<%s>"%result[q]["@URI"]
                condition[-1] = str(e)%qe
        s = ''
        where = [ s+c for c in condition]
        
        Condition = []
        for q in quest:
            if q in result.keys():
                e = '?'+str(variables[q]).lower()
                qe = '<%s>'%str(variables[q]) + ' <%s> ' + e + ' [] . '
                Condition.append(qe)
            elif (q in result.keys()) and (q not in variables.keys() ):
                e = Condition[-1]
                qe ="<%s>"%result[q]["@URI"]
                ont = '?'+ str(variables[q]).lower() + ' a <http://dbpedia.org/ontology/%s>'%result[q]["DBpedia"]
                Condition[-1] = str(e)%qe + ont
        S = ''
        Where = [ S+C for C in Condition]
        
        head = 'SELECT %(v)s WHERE { %(C)s };'%where
        tail = 'SELECT ?a WHERE { %(C)s };'%Where
            
        template = classes[0] + ';' + temp + ';' + head + ';' + tail
        return template;
        


'''
def template_generate(question):
        query = query_generator.query_generate(question)
        temp, schemas = annotation.getTemplate(question)
        classes = ['dbo:'+e for e in schemas]
        lines = query.splitlines(True)
        query_temp = ''
        n = 65 
        line = ''      
        for l in lines:
                if '?x2' in l:
                        line = l.replace('?x2', '?a')
                        
                if '?x0' in l:
                        line = l.replace('?x0', '?a')
                        
                if '?x1' in l:
                        line = l.replace('?x1', '?b') 

                query_temp += ' '+line;
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
'''

if __name__ == "__main__":
        question = "What is a car?"
        template = template_generater(question)
        print template 
        print
        
        
        
        
        
'''        
        if question == '':
                question = input('please input the question: ')
        classes, temp, query_temp = template_generate(question)
        templates = {'Classes':classes, 'QuestionTemplate':temp, "QueryTemplate":query_temp}
        print ("begin to dump:")
        fp = file("templates.json", 'w')
        print "dumping..."
        json.dump(templates,fp)
        print "dumped."
'''










