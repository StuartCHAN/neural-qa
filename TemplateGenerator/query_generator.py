#!/usr/bin/env python
# coding: utf-8

import sys
import time
import random
import datetime
#import quepy

from SPARQLWrapper import SPARQLWrapper, JSON, XML, N3, RDF, CSV, TSV

#import json

sparql = SPARQLWrapper("http://dbpedia.org/sparql")
#dbpedia = quepy.install("dbpedia")


def print_define(results, target, metadata=None):
    for result in results["results"]["bindings"]:
        if result[target]["xml:lang"] == "en":
            print (result[target]["value"])
            print()


def print_enum(results, target, metadata=None):
    used_labels = []

    for result in results["results"]["bindings"]:
        if result[target]["type"] == u"literal":
            if result[target]["xml:lang"] == "en":
                label = result[target]["value"]
                if label not in used_labels:
                    used_labels.append(label)
                    print (label)


def print_literal(results, target, metadata=None):
    for result in results["results"]["bindings"]:
        literal = result[target]["value"]
        if metadata:
            print(metadata.format(literal)) 
        else:
            print (literal)


def print_time(results, target, metadata=None):
    gmt = time.mktime(time.gmtime())
    gmt = datetime.datetime.fromtimestamp(gmt)

    for result in results["results"]["bindings"]:
        offset = result[target]["value"].replace(u"−", u"-")

        if ("to" in offset) or ("and" in offset):
            if "to" in offset:
                connector = "and"
                from_offset, to_offset = offset.split("to")
            else:
                connector = "or"
                from_offset, to_offset = offset.split("and")

            from_offset, to_offset = int(from_offset), int(to_offset)

            if from_offset > to_offset:
                from_offset, to_offset = to_offset, from_offset

            from_delta = datetime.timedelta(hours=from_offset)
            to_delta = datetime.timedelta(hours=to_offset)

            from_time = gmt + from_delta
            to_time = gmt + to_delta

            location_string = random.choice(["where you are",
                                             "your location"])

            print ("Between %s %s %s, depending on %s" % \
                  (from_time.strftime("%H:%M"),
                   connector,
                   to_time.strftime("%H:%M on %A"),
                   location_string) )

        else:
            offset = int(offset)

            delta = datetime.timedelta(hours=offset)
            the_time = gmt + delta

            print (the_time.strftime("%H:%M on %A"))


def print_age(results, target, metadata=None):
    assert len(results["results"]["bindings"]) == 1

    birth_date = results["results"]["bindings"][0][target]["value"]
    year, month, days = birth_date.split("-")

    birth_date = datetime.date(int(year), int(month), int(days))

    now = datetime.datetime.utcnow()
    now = now.date()

    age = now - birth_date
    print( "{} years old".format(age.days / 365))


def wikipedia2dbpedia(wikipedia_url):
    """
    Given a wikipedia URL returns the dbpedia resource
    of that page.
    """

    query = """
    PREFIX foaf: <http://xmlns.com/foaf/0.1/>
    SELECT * WHERE {
        ?url foaf:isPrimaryTopicOf <%s>.
    }
    """ % wikipedia_url

    sparql.setQuery(query)
    sparql.setReturnFormat(JSON)
    results = sparql.query().convert()

    if not results["results"]["bindings"]:
        print ("Snorql URL not found")
        sys.exit(1)
    else:
        return results["results"]["bindings"][0]["url"]["value"]


def get_query():
    pass


def query_generate(text): 
    if (type(text) is list) and (len(text)>0) :
        q = []
        questions = text
        for question in questions:
            print (question)
            print ("-" * len(question))

            target, query, metadata = dbpedia.get_query(question)

            if isinstance(metadata, tuple):
                query_type = metadata[0]
                metadata = metadata[1]
            else:
                query_type = metadata
                metadata = None

            if query is None:
                print ("Query not generated :  \n")
                continue
            else:
                q.append(query);
    elif type(text) is str:
        question = text
        target, query, metadata = dbpedia.get_query(question)
        if isinstance(metadata, tuple):
            query_type = metadata[0]
            metadata = metadata[1]
        else:
            query_type = metadata
            metadata = None

        if query is None:
            print ("Query not generated :  \n")
            
        else:
            q = query ;
    else:
        print ("The input is not correct." );
    return q ;

 