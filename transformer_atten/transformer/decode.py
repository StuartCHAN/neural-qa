# -*- coding: utf-8 -*-
"""
This is to decode the translation after running the translate.py
"""
import argparse
parser = argparse.ArgumentParser(description='manual to this script')
parser.add_argument('--input_file', type=str, default = None)
parser.add_argument('--output_file', type=str, default = None)
args = parser.parse_args()



def replace(line):
    line = str(line).strip().strip('_')
    line = str(line).replace("_a_", " a ")
    line = str(line).replace("_count_", " COUNT ")
    line = str(line).replace("_dbr_", " dbr_")
    line = str(line).replace("_dbo_", " dbo_")
    line = str(line).replace("_dbp_", " dbp_")
    line = str(line).replace("_attr_open_", " attr_open ")
    line = str(line).replace("_attr_close_", " attr_close ")
    line = str(line).replace("select_", "SELECT ")
    line = str(line).replace("distinct_", "DISTINCT ")
    line = str(line).replace("select_distinct_var_", "SELECT DISTINCT var_")
    line = str(line).replace("ask_where_", "ASK WHERE ")
    line = str(line).replace("_where_brack", " WHERE brack")
    line = str(line).replace("_brack_open_", " brack_open ")
    line = str(line).replace("_brack_close", " brack_close ")
    line = str(line).replace("_var_", " var_")
    line = str(line).replace("_dbc_", " dbc_")
    line = str(line).replace("_sep_dot", " sep_dot")
    line = str(line).replace("_rdf_", " rdf_")
    line = str(line).replace("_foaf_name_", " foaf_name ")
    return line ;


if __name__ == '__main__':
    
    input_file = args.input_file
    output_file = args.output_file
    translation = open(input_file, 'r', encoding="UTF-8").readlines()
    decodation = []
    for line in translation:
        decoded = replace(line)
        decodation.append(decoded);
    with open(output_file, "w", encoding="UTF-8") as save:
        for decoded in decodation:
            save.write(decoded)
        
        
    
