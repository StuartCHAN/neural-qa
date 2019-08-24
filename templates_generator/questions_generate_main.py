# -*- coding: utf-8 -*-
"""
 
"""

import pandas as pd
from vec_utils import sentence_encoder
import wiki_extract
import ntriples_extract
from semantic_parser import get_all_instances
import argparse
parser = argparse.ArgumentParser(description='manual to this script')
parser.add_argument('--dbo_class', type=str, default = None)
args = parser.parse_args()




if __name__ == "__main__":
    
    dbo_class = args.dbo_class 
    instances = get_all_instances(dbo_class)
    if (instances is not None) and ( len(instances)>=1 ):
        print("\n Begin to get the instances: ")
        for instance in instances[:3]:
        #for instance in instances:
            try:
               savepath = wiki_extract.extract_page(instance, dbo_class)
               print("\nThe Wiki page for entity of %(instance)s in the class %(class)s is saved. "%{"instance":instance, "class":dbo_class })   
            except:
                print("\nThe Wiki page for entity of %(instance)s in the class %(class)s does not exist"%{"instance":instance, "class":dbo_class }) 
                pass;
            try:
                ntriples_extract.downloadFile(instance, savepath)
                print("\nThe ntriples file for entity of %(instance)s in the class %(class)s is saved."%{"instance":instance, "class":dbo_class })
            except:
                print("\nThe ntriples file for entity of %(instance)s in the class %(class)s does not exist"%{"instance":instance, "class":dbo_class })   
                pass;
        print("\n The instances are saved.")
    else:
       print("\n The instances fetched is: ", instances)
       print("\n with type: ", type(instances) )
       print("\n with length: ", len(instances) )
    
    