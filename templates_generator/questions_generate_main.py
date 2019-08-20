# -*- coding: utf-8 -*-
"""
 
"""
import os
import pandas as pd
import vec_utils
from vec_utils import sentence_encoder
import wiki_extract
import ntriples_extract
import templates_allocator
import semantic_parser
from semantic_parser import get_all_instances





if __name__ == "__main__":
    
    data = pd.read_csv("../data/QALD-7.csv")    
    rows = [str(list(row[-1])[0]) for row in data.iterrows()]
    rows = [str(row).strip(';').strip() for row in rows ]
    classes = list(set([str(row).split(';')[0] for row in rows if row.startswith('dbo:')] )) 
    classes = [str(clas).replace('dbo:','').strip() for clas in classes ];
    
    for clas in classes:
        instances = get_all_instances(clas)
        if (instances is not None) and ( len(instances)>=1 ):
            for instance in instances:
                try:
                   savepath = wiki_extract.extract_page(instance, clas)   
                except:
                    print("\nThe Wiki page for entity of %(instance)s in the class %(class)s does not exist"%{"instance":instance, "class":clas }) 
                    pass;
                try:
                    ntriples_extract.downloadFile(instance, savepath)
                except:
                    print("\nThe ntriples file for entity of %(instance)s in the class %(class)s does not exist"%{"instance":instance, "class":clas })   
                    pass;
    
    