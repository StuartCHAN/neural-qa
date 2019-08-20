# -*- coding: utf-8 -*-
"""

"""
import requests

def downloadFile(dbr_name, savepath):
    #e.g. url = "http://dbpedia.org/data/Barack_Obama.ntriples"
    url = "http://dbpedia.org/data/"+dbr_name+".ntriples"
    r = requests.get(url)
    f = open(savepath+'/'+dbr_name+'.ntriple', 'wb')
    for chunk in r.iter_content(chunk_size=512 * 1024): 
        if chunk: # filter out keep-alive new chunks
            f.write(chunk)
    f.close()
    return 
