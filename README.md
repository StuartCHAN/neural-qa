# Neural SPARQL Machines: Attention-based Transformer with Automatic Templates Generation

An Attention-based Transformer for Neural Question-Answering on Knowledge Graph, via Machine Translation Approach, with Automatic Templates Generator from Long Text.

The project is Stuart Chen's research in [Google 2019 GSoC project](https://stuartjchan.online/) in collaboartion with DBpeida and AKSW Research Group.

![Natural Language](http://www.liberai.org/img/flag-uk-160px.png "English Language")
![DBpedia.](https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/DBpediaLogo.svg/200px-DBpediaLogo.svg.png "DBpedia")
![Semantic triple flag.](http://www.liberai.org/img/flag-sparql-160px.png "SPARQL")

<br>

## Dependencies

- Python 3.6
- [TensorFlow 1.14.0](https://pypi.org/project/tensorflow/)
- [TensorFlow Hub](https://github.com/tensorflow/hub)
- [NumPy](http://www.numpy.org/)
- [NLTK](https://www.nltk.org/)
- [spaCy](https://spacy.io/)
- [Unidecode](https://pypi.org/project/Unidecode/)
- [xmldict](https://pypi.org/project/xmldict/)

<br>

## 1. Automatic Templates Generator

The component aims at automating the templates generation from the long text, with the help of Universal Sentence Encoder, DBpedia-Spotlight, DBpedia-Lookup, NLTK, and Spacy. Before running the scripts, please mind that this repository folder should have been exported to the system path '$PYTHONPATH'.

### 1.1. Extraction Of Wiki pages and article pre-processing

We need abundant natural language textual materials to get more questions with RDFs of DBpedia, in order to transform them into templates.

For example, if you want to get the articles about [Brack Obama](https://en.wikipedia.org/wiki/Barack_Obama)([dbr:Barack_Obama](http://dbpedia.org/page/Barack_Obama)), we set `DBR_NAME=Barack_Obama`, then 

```bash
python questions_generate_main.py --dbo_class=$DBR_NAME
```

the scripts will automatically make a `Bank` directory in the `neural-qa/data/` folder to save the articles.
<br>

### 1.2. Filtering of the sentences in articles to match the DBpedia ntriple RDFs

The script [sentences_filter.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/sentences_filter.py) is for filtering out those sentences pertinent to the RDFs that we need.
<br>

### 1.3. Convert sentences containing DBpedia entities to questions with placeholders

The [question_convertor.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/question_convertor.py) is the part responsible for converting the catched sentences to template-questions with entity placeholders.

```txt
    e.g. She was born in France? --> where <A> was born in ?
```
<br>

### 1.4. Matching these questions towards the template questions in exiting templates-sets with Universal Sentence Encoder

This [sentence_encoder.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/vec_utils/sentence_encoder.py) is from the implementation of [Universal Sentence Encoder](https://tfhub.dev/google/universal-sentence-encoder/2)[1] which shows efficiency in semantic sentences matching, it helps to match whether there is an existing correspondent template for the new question that we have.
<br>

### 1.5. If the matching similarity score can not pass the treshold, the questions go to the query composing part 

To use the pipeline, please run the [templates_generate_main.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/templates_generate_main.py) after the step 1 above,

```bash
python templates_generate_main.py --dbo_class=$DBO_CLASS  --temps_fpath=$EXISTING_TEMPLATES_FILE_PATH  --text_fpath=$TEXT_FILE_PATH  --ntriple_fpath=$NTRIPLES_FILE_PATH  --train_vec=$WHETHER_TO_TRAIN_THE_VECTOR  --vecpath=$FILE_PATH_THAT_SAVES_VECTORS   --temp_save_path=$FILE_PATH_SAVING_RESULTS 
```

which will automaticall initiate the pipeline.

<br>

## 2. Transformer

The implementation of this neural transformer part gets inspiration from the paper [Attention Is All You Need](https://arxiv.org/abs/1706.03762)[2] and its [official model by TensorFlow](https://github.com/tensorflow/models/tree/master/official)[3].

![Attention Is All You Need.Figure 1](http://nlp.seas.harvard.edu/images/the-annotated-transformer_14_0.png "Attention Is All You Need.Figure 1(by Ashish Vaswani et al.)")


### 2.1. Data Preparation

#### 2.1.1. to generate the data  

We use the [templates](https://github.com/AKSW/NSpM/tree/master/data) in csv format provided by [SPARQL as a Foreign Language](https://arxiv.org/abs/1708.07624)[4] to generate the training data for the experiments.

The generated data consists of two parts, namely, `data.en` the source data, and `data.sparql` the target data.

In the `data.en` are the natural language questions with RDF entities annotated to be translated into RDF structured query language in SPARQL, like in this example,

```text
    "who is the spouse of dbr_Barack_Obama ?"
    "who is the partner of dbr_Audrey_Hepburn ?"
    ...
```

To begin with, please run the data generation:

```bash
cd  neural-qa/transformer_atten/transformer
mkdir data/QALD7
python generator.py  --transformer=True  --templates data/QALD-7.csv  --output data/QALD7
```

Then, we need to pre-peocess the data and build the vocabulary file and split the data into tarining set and validation set:

```bash
python transformer_main.py --data_dir=./data/QALD7 --model_dir=./data/QALD7/model_QALD7   --vocab_file=./data/QALD7/vocab.en_sparql  --param_set=base

```

### 2.2. Model Training 

To conduct the training, please notice the parameters to set:

```bash
   PARAM_SET=big
   DATA_DIR=$path/to/the/data
   MODEL_DIR=$path/to/your/model
   VOCAB_FILE=$DATA_DIR/vocab.en_sparql
```

* just a side note, please make sure the generated date for training are put in a folder that only contains the data without any file else, otherwise it might raise the [tf.errors.DataLossError](https://www.tensorflow.org/api_docs/python/tf/errors/DataLossError). 

In our experiment, we use the command below:

```bash
python transformer_main.py --data_dir=./data/QALD7/DATA_DIR --model_dir=./data/QALD7/model_QALD7   --vocab_file=./data/QALD7/vocab.en_sparql   --param_set=big 
```

* To see more instructions, this refers to the [official model](https://github.com/tensorflow/models/tree/master/official/transformer#detailed-instructions).

### 2.3. Model Results

* Loss

![loss.](https://res.cloudinary.com/stuarteec/image/upload/v1566787028/loss_sngtwq.png "loss")

* GERBIL Evaluation

![Evaluation.](https://res.cloudinary.com/stuarteec/image/upload/v1566787028/transf_good.gerbil.qald7_jtqxfx.png "Evaluation")



## References

[1] Daniel Cer et al. (2018) Universal Sentence Encoder

[2] Ashish Vaswani et al. (2017) Attention Is All You Need 

[3] TensorFlow - Official Models: https://github.com/tensorflow/models 

[4] Tommaso Soru et al. (2017) SPARQL as a Foreign Language
