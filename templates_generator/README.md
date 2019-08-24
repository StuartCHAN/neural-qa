# Templates Generator – Neural SPARQL Machines

This the templates generation component for the [Neural SPARQL Machines](https://github.com/StuartCHAN/neural-qa) in the [2019 GSoC project](https://stuartjchan.online/), which aims to automatically generate templates from the article extracted from the Wikipedia pages.

<br>

## Dependencies

- Python 3*
- [TensorFlow](https://www.tensorflow.org/beta/)
- [TensorFlow Hub](https://github.com/tensorflow/hub)
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

This [sentence_encoder.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/vec_utils/sentence_encoder.py) is the implementation of Universal Sentence Encoder which show efficiency in semantic sentences matching, it helps to match whether there is an existing correspondent template for the new question that we have.

### 5. If the matching similarity score can not pass the treshold, the questions go to the query composing part 
To use the pipeline, please run the [templates_generate_main.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/templates_generate_main.py) after the step 1 above,

```bash
python templates_generate_main.py --dbo_class=$DBO_CLASS  --temps_fpath=$EXISTING_TEMPLATES_FILE_PATH  --text_fpath=$TEXT_FILE_PATH  --ntriple_fpath=$NTRIPLES_FILE_PATH  --train_vec=$WHETHER_TO_TRAIN_THE_VECTOR  --vecpath=$FILE_PATH_THAT_SAVES_VECTORS   --temp_save_path=$FILE_PATH_SAVING_RESULTS 
```

which will automaticall initiate the pipeline.

<br>
<br>

## Instruction

### 1. for extracting the articles from the Wikipedia pages:

We use the [questions_generate_main.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/questions_generate_main.py) to work as the entry of the program, which generates the raw materials for building the questions and save them categorically in place. 

It has the parametre below:

```python
--dbo_class
```

For example,
we can set the `--dbo_class=Person` then we can run the script like:

```bash
python questions_generate_main.py --dbo_class=Person
```

then the program will automatically make a directory `Bank\DBresourses\$dbo_class`that we call the templates bank under the `neural-qa\data\` path. In the folder, eache fetched entity will get its own folder containing its article text file, the structure look like:

```bash
neural-qa\data\Bank\DBresourses\$dbo_class
    --dbr_person0
        --dbr_person0.txt
    --dbr_person1
        --dbr_person1.txt 
    --dbr_person2
        --dbr_person2.txt
    ...   
```

### 2. for extracting the articles from the Wikipedia pages:

Then to begin the generation of templates by [templates_generate_main.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/templates_generate_main.py), we need the material prepared in last step, the text file, 
also if we want to employ the universal sentence encoder to match the newly generated templates towards the existing ones, 
a templateset about the same DBpedia ontology topic, 
e.g. `annoattions_Person.csv` for the `dbr_Barack_Obama` is needed:

We can set whether to train a new universal sentence encoder verctorbase or not 
by setting the parameter `--train_vec` which has default as `False`,

then if we set it `True` and the templateset exists,
the system will save a vectorbase for it for further usage.



