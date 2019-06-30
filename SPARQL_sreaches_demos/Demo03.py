#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Here is the continual processing for the previous demo02.py

###############################################################################   
answers = {}
for k in resultsetj.keys():
    answer_item = {"head": {"vars": []}, "results": {"bindings": [ ]} }
if type(resultsetj[k]) is str:
    resultj = resultsetj[k]
    if resultj in ['True', 'False']:
       answer_item = {"head": {},"boolean": str(resultj).lower(), "results": {} } 
    else:
       answer_item = {"head": {},"literal":resultj , "results": {} }  
else:
    resultj = resultsetj[k]['sparql']
    head_vars_list = [head_var  for head_var in resultj['head']['variable'].values() ]
    if 'result' in resultj['results'].keys():
        bindings_list = resultj['results']['result']
        bindings = []
        if type(bindings_list) is list :
            for binding in bindings_list:
                if ( type(binding) is dict ):
                    #answer_item = {"head": {"vars": []}, "results": {"bindings": [ ]} }
                    bind_head0 = binding['binding']['@name']
                    for k in binding['binding'].keys():
                        bind_head01_type = ''                            
                        if k != '@name':
                            bind_head01_type = k;
                        if k == 'literal':
                            bind_head0 = 'c' 
                            bind_head02_value = binding['binding']['literal']['#text']
                        else:
                            bind_head02_value = binding['binding'][k];
                        answer_item["head"]["vars"].append(bind_head0) 
                        binding_item = { bind_head0:{'type':bind_head01_type, 'value':bind_head02_value}}
                        answer_item["results"]["bindings"].append( binding_item);
answers[k] = answer_item ;
                            

# There is the continual processing in the next demo04.py