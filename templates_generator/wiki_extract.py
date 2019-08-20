# -*- coding: utf-8 -*-
"""
"""
import os
import wikipediaapi



DATASET = "../data/Bank/DBresourses"


def extract_page(dbr, clas):
    # For example, a 'dbr' should be like: 'Audrey_Hepburn', which is the identifier of both the DBPeida entity and the Wiki page.
    #wiki_wiki = wikipediaapi.Wikipedia( language='en', extract_format=wikipediaapi.ExtractFormat.WIKI )    
    wiki_wiki = wikipediaapi.Wikipedia('en')
    page_wiki = wiki_wiki.page(dbr)
    #page_wiki = wiki_wiki.page('Audrey_Hepburn')    
    print(" Page - Exists: %s" % page_wiki.exists())
    # Page - Exists: True
    assert(page_wiki.exists())
    fulltext = page_wiki.text
    savepath = save_page(dbr, fulltext, clas)
    return savepath


def save_page(dbr, fulltext, clas):
    savepath = prepare_dir(dbr, clas)
    fname = savepath+"/"+dbr+".txt"
    if os.path.isfile(fname) is False:
        with open(fname, 'w', encoding='UTF-8' ) as text:
            text.write(fulltext)
            text.close()
            return savepath; 
  

def prepare_dir(dbr, clas):    
    files= os.listdir(DATASET)
    templates_pool = []
    for file in files: #iterate to get the folders
         if os.path.isdir(DATASET+"/"+file): # whether a folder 
              templates_pool.append(file)
    savepath = DATASET+"/"+clas+"/"+dbr
    if (dbr not in templates_pool) or not( os.path.exists(savepath)) :
        try:
            os.makedirs(savepath)
        except:
            os.makedir(savepath)
    return savepath