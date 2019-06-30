#!/usr/bin/env python
# -*- coding: utf-8 -*-

# Here is the continual processing for the previous demo01.py

###############################################################################
    with open(saved, 'r', encoding='utf-8' ) as file:
        responses = json.load(file)
        results = [ ]
        for response in responses.items():
            r = response[-1]['result']
            if type(r) is bool:
                result = (response[0], str(r))
            else:
                try:
                    result = (response[0], xmltodict.parse(r) )                   
                except:
                    result = (response[0], str(r))
            results.append(result);
            
    resultset = OrderedDict(results)
    
    formated = 'F:/portfolio/GSoC/DBpedia/QALD7_task/201906232157/output.qald7.eva.decoded.sparql.results.formatted.json'
    with open(saved, 'w', encoding='utf-8' ) as savfile:
        json.dump(resultsetj, savfile, ensure_ascii=False, indent=4)
        
    resultsetjson = json.dumps(resultset, ensure_ascii=False, indent=4) 
    resultsetj = json.loads(resultsetjson)

# There is the continual processing in the next demo03.py
