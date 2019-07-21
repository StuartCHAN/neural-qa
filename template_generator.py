#!/usr/bin/env python
# coding: utf-8

import sys
import os
import importlib

import json
import pandas as pd

import annotation
import query_generator
import semantic_parser
import properties_processor



be = ['NNP','VBZ','IN','WRB']
Interrogative = ['what','who','Which','whose', 'whom','when', 'where', 'why', 'how']


def template_generater(question):
        result = annotation.annotate(question)
        #assert(result.items() is not False)
        #assert(len(result)>0)        
        temp, schemas,variables = annotation.getTemplate(question)
        phrases = [e[0] for e in semantic_parser.extract_phrase(question)]
        properties = []
        Properties = []
        processor = properties_processor.properties_processor()
        for key in result.keys():
            var = result[key]['Ref']
            phrase = str(" ").join(phrases)
            properti = processor.process( var.split(':')[-1], phrase)
            properties.append(str(" "+variables[key]+" "+properti+"."))
            Properties.append(str(" <"+str(variables[key]).upper()+"> "+properti+"."));
        properties = str("#").join(properties)
        if properties[-1]==".":
            properties[-1]=" "
        Properties = str("#").join(Properties)
        if Properties[-1]==".":
            Properties[-1]=" "
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
                conditions += str(' '+pa[0]+' a'+clas+' '+'.'+' ' ) #[conditions+e+clas for e in pa] #+'[]'
            elif len(pa)>1:
                for e in pa:
                    conditions += str(' '+pa[0]+' '+e ) ;
                conditions = conditions +' '+ '.'+' '; #+'[]'
            conditions = conditions +'#'+str(' '+pa[0]+' '+e )
            conditions = conditions +'#'+properties ;
            
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
            Conditions = Conditions +'#'+Properties;
            
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
            
        


if __name__ == "__main__":
    
    importlib.reload(sys) 
    questions_file = sys.argv[1]
    save_templates_file = sys.argv[2]
    questions =[str(question).strip().replace('\n', '') for question in open(questions_file, "r", encoding="UTF-8").readlines() ]
    print(questions)
    templates = []
    for question in questions:
        try:
            templates.append(template_generater(question))
        except:
            pass;
    templates = pd.DataFrame(templates)
    templates.to_csv(save_templates_file)
    
    """
    F:/portfolio/GSoC/DBpedia/QALD7_task/to_ask.txt
    F:/portfolio/GSoC/DBpedia/QALD7_task/templates_generated.csv
    python template_generator.py F:/portfolio/GSoC/DBpedia/QALD7_task/to_ask.bin  F:/portfolio/GSoC/DBpedia/QALD7_task/templates_generated.csv 
    
    """

            
            
        
       
        
        
        






