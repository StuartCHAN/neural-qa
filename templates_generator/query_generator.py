#!/usr/bin/env python
# coding: utf-8
import sys
import time
import random
import datetime


qtemp = "SELECT ?a WHERE { <A> %(predicate)s ?a };SELECT ?a WHERE { ?a %(predicate)s [] . ?a a %(dbo_class)s }" 

def compose_query(dbo_class, prediacte, subject):
    query = str(qtemp)%{"dbo_class":'<http://dbpedia.org/ontology/'+dbo_class+'>', "predicate":prediacte, "subject":subject }
    return query;  


 