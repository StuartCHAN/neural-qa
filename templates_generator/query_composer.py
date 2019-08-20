# -*- coding: utf-8 -*-
"""

"""
import pandas as pd


qtemp = "SELECT ?a WHERE { <A> %(predicate)s ?a };SELECT ?a WHERE { ?a %(predicate)s [] . ?a a %(subject)s }" 


def compose_query(prediacte, subject):
    query = str(qtemp)%{"predicate":prediacte, "subject":subject }
    return query;  

questions = pd.read_csv("F:/portfolio/GSoC/neural-qa/data/Bank/Person/Barack_Obama/new/Statue_of_Liberty.filtered.theta.csv")  # Barack_Obama.quest_sent_predicate_paraphrase.csv")   

for row in questions.iterrows():
    ntriple = list(row[-1])[-1]

ntriples = [ list(row[-1])[-1] for row in questions.iterrows() ]

quests = [ list(row[-1])[0] for row in questions.iterrows() ]

templates = []
with open("F:/portfolio/GSoC/neural-qa/data/Bank/Person/Barack_Obama/new/Statue_of_Liberty.filtered.theta.new_templates.csv", "a", encoding="UTF-8") as save:
    for temp, triple in zip(quests, ntriples ):
        prediacte = triple.split()[1]
        subject = triple.split()[0]
        query = str(qtemp)%{"predicate":prediacte, "subject":subject }
        template = "dbo:Person;;;"+temp+";"+query
        templates.append(template)
        save.write(template+"\n")
      
    
    