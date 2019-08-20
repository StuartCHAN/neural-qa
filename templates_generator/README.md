# Templates Generator – Neural SPARQL Machines

This the templates generation component for the Neural SPARQL Machines in the 2019 GSoC project, which aims to automatically generate templates from the article extracted from the Wikipedia pages.

<br>

## Dependencies

- Python 3
- [NumPy](http://www.numpy.org/)
- [NLTK](https://www.nltk.org/)
- [spaCy](https://spacy.io/)
- [Unidecode](https://pypi.org/project/Unidecode/)
- [xmldict](https://pypi.org/project/xmldict/)


## The Pipeline for Running 

### 1. Extraction Of Wiki pages and article pre-processing

We need abundant natural language textual materials to get more questions with RDFs of DBpedia, in order to transform them into templates.
For example, if you want to get the articles about [Brack Obama](https://en.wikipedia.org/wiki/Barack_Obama)([dbr:Barack_Obama](http://dbpedia.org/page/Barack_Obama)), we set `DBR_NAME=Barack_Obama`, then 

```bash
python questions_generate_main.py --dbo_class=$DBR_NAME
```

the scripts will automatically make a `Bank` directory in the `neural-qa/data/` folder to save the articles.

### 2. Filtering of the sentences in articles to match the DBpedia ntriple RDFs

The script [sentences_filter.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/sentences_filter.py) is for filtering out those sentences pertinent to the RDFs that we need.

### 3. Convert sentences containing DBpedia entities to questions with placeholders

The [question_convertor.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/question_convertor.py) is the part responsible for converting the catched sentences to template-questions with entity placeholders.

```txt
    e.g. She was born in France? --> where <A> was born in ?
```

### 4. Matching these questions towards the template questions in exiting templates-sets with Universal Sentence Encoder

This is the implementation of Universal Sentence Encoder which show efficiency in semantic sentences matching

### 5. If the matching similarity score can not pass the treshold, the questions go to the query composing part 
 