#!/usr/bin/env python
"""

Neural SPARQL Machines - Interpreter module

'SPARQL as a Foreign Language' by Tommaso Soru and Edgard Marx et al., SEMANTiCS 2017
https://w3id.org/neural-sparql-machines/soru-marx-semantics2017.html
https://arxiv.org/abs/1708.07624

Version 0.1.0-akaha

"""
import sys
import re

from generator_utils import decode,fix_URI

if __name__ == '__main__':
    fp = "F:/portfolio/GSoC/DBpedia/Transformer_Attention/models-master/models-master/official/transformer/data/QALD7/test/test.eva.decoded.sparql"#'F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7/data.sparql' #"F:\\portfolio\\GSoC\\DBpedia\\QALD7_task\\201906232157\\output.qald7.eva.txt"#"F:/portfolio/GSoC/DBpedia/neural-qa/data/qald7templateSet/output.201907092034.txt"#"F:/portfolio/GSoC/DBpedia/neural-qa/data/DBNQA/output.20190720.txt" #"F:/portfolio/GSoC/DBpedia/QALD7_task/output.20190709.txt" #"F:/portfolio/GSoC/DBpedia/QALD7_task/Task4/output.qald-7-train-en-wikidata.json.txt" #'F:/portfolio/GSoC/DBpedia/QALD7_task/qald7templateSet.output.bin' #'F:/portfolio/GSoC/DBpedia/QALD7_task/qoutput.txt'
    encoded_sparqls = open(fp, 'r');
    fd = "F:/portfolio/GSoC/DBpedia/Transformer_Attention/models-master/models-master/official/transformer/data/QALD7/test/test.eva.decoded_query.sparql" #'F:/portfolio/GSoC/DBpedia/neural-qa/data/QALD7/data.decoded.sparql' #"F:\\portfolio\\GSoC\\DBpedia\\QALD7_task\\201906232157\\output.qald7.eva.decoded.sparql"#"F:/portfolio/GSoC/DBpedia/neural-qa/data/qald7templateSet/output.201907092034.decoded.txt"#"F:/portfolio/GSoC/DBpedia/neural-qa/data/DBNQA/output.20190720.decoded.txt" #"F:/portfolio/GSoC/DBpedia/QALD7_task/output.20190709.decoded.txt" #"F:/portfolio/GSoC/DBpedia/QALD7_task/Task4/output.qald-7-train-en-wikidata.json.decoded.txt" # 'F:/portfolio/GSoC/DBpedia/QALD7_task/qald7templateSet.output.sparql' #'F:/portfolio/GSoC/DBpedia/QALD7_task/decoded_sparql.txt'
    with open(fd, 'w') as file: 
        for encoded_sparql in encoded_sparqls.readlines():
            decoded_sparql = decode(encoded_sparql)
            decoded_sparql = fix_URI(decoded_sparql)
            #print (decoded_sparql)
            file.write(str(decoded_sparql));












#'''
#    reload(sys)
#    sys.setdefaultencoding("utf-8")
#    encoded_sparql = sys.argv[1]
#    decoded_sparql = decode(encoded_sparql)
#    decoded_sparql = fix_URI(decoded_sparql)
#    print decoded_sparql
#'''
