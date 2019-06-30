#!/usr/bin/env python
# -*- coding: utf-8 -*-

'''
Here are the experiments about utilizing the collections instead of NLTK.Tree to represent the tree structure.
'''

########################################

import collections

Node = collections.namedtuple('Node', ['left', 'right', 'value'])

def contains(root, value):
   def contains(root, value):
    re = []
    if isinstance(root, Node):
        v = root.value
        l = root.left
        r = root.right
        if v == value:
            re.append(True)
        else:
            for n in [l, r]:
                contains(n, value);    
    else:
        re.append(False)
    return (True in re)
     
            

        
n1 = Node(value=1, left=None, right=None)
n3 = Node(value=3, left=None, right=None)
n2 = Node(value=2, left=n1, right=n3)
n2r = n2.right

       
print( contains(n2, 3)  )

##################################################################

from collections import Counter
from collections import OrderedDict

class EntsTable:
    def __init__(self, entity):
        self.entity = entity
        self.standings = OrderedDict([(ent, Counter()) for ent in entity])
       
    def record_result(self, ent, score):
        self.standings[ent]['frequency'] += 1
        self.standings[ent]['score'] += score
      
    def ent_rank(self, rank):
        scores = [self.standings[ent]['score'] for ent in self.entity]        
        scores = list(set(scores))
        scores.sort(reverse=True)
        pool = []
        i = 1
        for s in scores:
            for ent in self.entity:
                if s == self.standings[ent]['score']:
                    pool.append(ent)
        p = pool[rank-1]   
        return p
      
table = EntsTable(['dbr1', 'dbr2', 'dbr3'])
table.record_result('dbr1', 2)
table.record_result('dbr1', 3)
table.record_result('dbr2', 5)
table.record_result('dbr3', 5)
print(table.ent_rank(1))
#########################################

import json
json_string='[{"name":"dbr1","frequent":1},{"name":"dbr2","frequent":9.99},{"name":"dbr3","frequent":4.04}]'

def sort_by_frequent_ascending(json_string):
    js = json.loads(json_string)
    frequents= [float(j['frequent']) for j in list(js)]
    frequents.sort()
    pool = []
    for p in frequents:
        for item in js:
            if item['frequent']==p:
                pool.append(item);
    pool = json.dumps(pool)        
    return str(pool)
