#!/usr/bin/env python
# coding: utf-8

import sys
import os
import json
import pandas as pd

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
        result = annotation.annotate(question)
        assert(result.items() is not False)
        assert(len(result)>0)
        
        temp, schemas,variables = annotation.getTemplate(question)
        if (len(schemas)>0) and (len(schemas[0])>0) and (schemas[0]!='') : 
            clas = schemas[0] #)   str('dbo:'+         
        else:
            clas = 'dbo:generic'
               
        pairs = semantic_parser.dependParse(question)
        pairs_annotated = []
        for pair in pairs:
            v = []
            for p in pair:
                if p in variables.keys():
                    v.append('?'+str(variables[p]) ) 
                elif (p not in variables.keys()) and (p in result.keys() ):
                    v.append(result[p]['Ref']) 
                pairs_annotated.append(v);
        
        conditions=''
        for pa in pairs_annotated:
            if (len(pa)==1) and (pa[0][-1] in variables.values() ):
                conditions += str(' '+pa[0]+' '+clas+' '+'[]'+'.'+' ' ) #[conditions+e+clas for e in pa]
            elif len(pa)>1:
                for e in pa:
                    conditions += str(' '+e ) ;
                conditions = conditions +' '+'[]'+ '.'+' ' ; #
            conditions = conditions +'#';
            
        conditionsList = conditions.split('#') 
        conditionsSet = list(set(conditionsList ) )
        conditionsSet.sort( key = conditionsList.index)
        conditions = str('').join(conditionsSet)
        
        Conditions=''
        for pa in pairs_annotated:
            if (len(pa)==1) and (pa[0][-1] in variables.values() ):
                placeholder = '<'+pa[0][-1]+'>'
                Conditions += str(' '+ placeholder +' '+clas+' '+pa[0] +'.'+' ') #[conditions+e+clas for e in pa]
            elif len(pa)>1:
                for e in pa:
                    Conditions += str(' '+e ) ;
                Conditions +=   '.'+' ' ; #
            Conditions = Conditions +'#';
            
        ConditionsList = Conditions.split('#') 
        ConditionsSet = list(set(ConditionsList ))
        ConditionsSet.sort(key=ConditionsList.index)
        Conditions = str('').join(ConditionsSet)
            
        p = ''
        P = ''
        for v in variables.values():
            p += ' ?'+v
            P += ' <'+ str(v).upper() + '> '
        query = ' select distinct('+p+') where { '+conditions+' };' #
        Query = ' select '+P+' where {' +Conditions+ '};' #S
        template = (clas, temp, Query, query)
        return template;
            
        
#            if ( len(pair)==3) and ( (pair[0] in result.keys() ) or (pair[1] in result.keys() ) or (pair[-1] in result.keys() ) ):
#                #v0, v1, v2 = result[pair[0]], result[pair[1]], result[pair[-1]
#                #pairs_annotated.append((v0, v1, v2))
#            elif ( len(pair)==2) and ( (pair[0] in result.keys() ) or (pair[-1] in result.keys() ) ):
#                v0, v1 = result[pair[0]], result[pair[-1]]
#                pairs_annotated.append((v0, v1))
        
        
#        relations = []
#        for q in quest:
#            if (q not in variables.keys()) and (q in result.keys() ):
#                relations.append((q, result[q]));
#        
#        condition = []
#        for i in range(0, len(quest)):
#            q = quest[i]
#            q_ = quest[i+1]
#            if (q in result.keys() ) and (q not in variables.keys() ):
#                p = '?'+str(variables[q]).lower()
#                que = '<%s>'%str(variables[q]) + ' <%s> ' + p + ' .\n'
#                condition.append(que)
#            elif (q in result.keys()) and (q not in variables.keys() ):
#                e = condition[-1]
#                qe ="<%s>"%result[q]["@URI"]
#                condition[-1] = str(e)%qe
#        s = ''
#        where = [ s+c for c in condition]
#        
#        Condition = []
#        for q in quest:
#            if q in result.keys():
#                e = '?'+str(variables[q]).lower()
#                qe = '<%s>'%str(variables[q]) + ' <%s> ' + e + ' [] . '
#                Condition.append(qe)
#            elif (q in result.keys()) and (q not in variables.keys() ):
#                e = Condition[-1]
#                qe ="<%s>"%result[q]["@URI"]
#                ont = '?'+ str(variables[q]).lower() + ' a <http://dbpedia.org/ontology/%s>'%result[q]["DBpedia"]
#                Condition[-1] = str(e)%qe + ont
#        S = ''
#        Where = [ S+C for C in Condition]
#        
#        head = 'SELECT %(v)s WHERE '+ '{ %(C)s };'%{'C':where}
#        tail = 'SELECT ?a WHERE { %(C)s };'%{'C':Where }
#            
#        template = classes[0] + ';' + temp + ';' + head + ';' + tail
#        return template;
#        


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
       
#        question = "Where is the palace ?"
#        questions = pd.read_csv('F:/portfolio/GSoC/DBpedia/neural-qa/data/annotations_monument.csv')
#        questionset = [row[-1] for row in questions.iterrows()]
#        qset = [q.to_string() for q in questionset]
#        df.values.tolist()
    
    
    
        '''
        fp = 'F:/portfolio/GSoC/DBpedia/neural-qa/data/annotations_monument.csv'
        qs = []
        qcol = open(fp, 'r')
        for q in qcol.readlines():
            qs.append(q);
            
        questions = []
        for q in qs:
            q = q.split(';')
            q = list(filter(lambda a: a != '', q)) 
            q = list(filter(lambda a: 'dbo:'not in a, q)) 
            question = q[1] if ('dbo'==q[0][0:3]) else q[0]
            question = question.replace('<A>','Buckingham')
            question = question.replace('<B>','pyramid')
            questions.append(question) ;
        '''
        
#        templates = []
#        questions = [str(q) for q in open('F:/portfolio/GSoC/DBpedia/QALD7_task/to_ask.bin', encoding='utf-8') if q!= '']
#        for quest in questions:
#            #print(quest)
#            try:            
#                template = template_generater(quest)
#                #print(template)
#            except:
#                template = False 
#                #print('__________');
#            templates.append(template)
#            #print()
#            
#        templates_examples = pd.DataFrame(templates)
#        print('saving...')
#        templates_examples.to_csv("./QALD7_templates_examples.201906261642.csv")
#        print('ok!')
        
            #templates_examples[quest] = template
        
#        templates_examples = {templates}
#        print ("begin to dump:")
#        fp = open("QALD7_templates_examples.201906261642.json", 'w')
#        print ("dumping...")
#        json.dump(templates_examples,fp)
#        print ("dumped.")
            
            
        
       
        
        
        
        
        
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
'''
mailto = ['cc', 'bbbb', 'afa', 'sss', 'bbbb', 'cc', 'shafa']
addr_to = list(set(mailto))
addr_to.sort(key = mailto.index)
'''








