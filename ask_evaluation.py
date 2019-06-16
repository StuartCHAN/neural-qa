#!/usr/bin/env python

 
import sys
import re
import os
#from generator_utils import decode,fix_URI
import csv


class QAsystem:
    def __init__(self,model, quest_path):
        self.model = model 
        self.quest_path = quest_path
        self.quest = self.ask(self.model, self.quest_path)
        print(self.quest);
    '''    
    def create_csv(self,path):
        with open(path,'wb') as f:
            csv_write = csv.writer(f)
            csv_head = ["question", "decoded_sparql","evaluation"]
            csv_write.writerow(csv_head)'''
    
    def interprete(self, encoded ):
        '''
        encoded_sparql = encoded
        decoded_sparql = decode(encoded_sparql)
        decoded_sparql = fix_URI(decoded_sparql)
        return decoded_sparql ;'''
        return open(encoded).readlines()

    def ask(self, model, quest_path):
        os.system("cd nmt")
        cmd = "python -m nmt.nmt  --vocab_prefix=../{temp}/vocab --model_dir=../{temp}_model  --inference_input_file=./to_ask.txt  --inference_output_file=./output.txt --out_dir=../{temp}_model --src=en --tgt=sparql | tail -n4".format(temp=model)  
        os.system(cmd)
        quest = []
        decoded_sparql = self.interprete(q)
        quests = open(quest_path).readlines()
        for q in range(0, len(quests) ):    
            quest.append([q,decoded_sparql]);
        return quest;

if __name__ == '__main__':
    model, quest_path = "evaluation", "../evaluation/evaluation_questions.txt"
    qasystem = QAsystem(model, quest_path);
