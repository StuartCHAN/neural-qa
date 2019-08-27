# Neural SPARQL Machines: Attention-based Transformer with Automatic Templates Generation

<br>
An Attention-based Transformer for Neural Question-Answering on Knowledge Graph, via Machine Translation Approach, with Automatic Templates Generator from Long Text.

The project is Stuart Chen's research in [Google 2019 GSoC](https://summerofcode.withgoogle.com/) in collaboration with DBpedia and AKSW Research Group. 

Here is the [website](https://stuartjchan.online/) for blogging the research development.

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

We need abundant natural language textual materials to get more questions with RDFs of DBpedia, to transform them into templates.

For example, if you want to get the articles about [Brack Obama](https://en.wikipedia.org/wiki/Barack_Obama)([dbr:Barack_Obama](http://dbpedia.org/page/Barack_Obama)), we set `DBR_NAME=Barack_Obama`, then 

```bash
python questions_generate_main.py --dbo_class=$DBR_NAME
```

the scripts will automatically make a `Bank` directory in the `neural-qa/data/` folder to save the articles.
<br>

### 1.2. Filtering of the sentences in articles to match the DBpedia triple RDFs

The script [sentences_filter.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/sentences_filter.py) is for filtering out those sentences pertinent to the RDFs that we need.
<br>

### 1.3. Convert sentences containing DBpedia entities to questions with placeholders

The [question_convertor.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/question_convertor.py) is the part responsible for converting the caught sentences to template-questions with entity placeholders.

```txt
    e.g. She was born in France? --> where <A> was born in ?
```
<br>

### 1.4. Matching these questions towards the template questions in exiting templates-sets with Universal Sentence Encoder

This [sentence_encoder.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/vec_utils/sentence_encoder.py) is from the implementation of [Universal Sentence Encoder](https://tfhub.dev/google/universal-sentence-encoder/2)[1] which shows efficiency in semantic sentences matching, it helps to match whether there is an existing correspondent template for the new question that we have.
<br>

### 1.5. If the matching similarity score can not pass the threshold, the questions go to the query composing part 

To use the pipeline, please run the [templates_generate_main.py](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/templates_generator/templates_generate_main.py) after the step 1 above,

```bash
python templates_generate_main.py --dbo_class=$DBO_CLASS  --temps_fpath=$EXISTING_TEMPLATES_FILE_PATH  --text_fpath=$TEXT_FILE_PATH  --ntriple_fpath=$NTRIPLES_FILE_PATH  --train_vec=$WHETHER_TO_TRAIN_THE_VECTOR  --vecpath=$FILE_PATH_THAT_SAVES_VECTORS   --temp_save_path=$FILE_PATH_SAVING_RESULTS 
```

which will automatically initiate the pipeline.

* one result of our works can be seen [here](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/data/Bank.zip), which facilitates to clarify the structure of Templates Bank directory with the output results inside `Bank\DBresourses\Person\Barack_Obama`.

<br>

## 2. Transformer

The implementation of this neural transformer part gets inspiration from the paper [Attention Is All You Need](https://arxiv.org/abs/1706.03762)[2] and its [official model by TensorFlow](https://github.com/tensorflow/models/tree/master/official)[3].

![Attention Is All You Need. Figure 1](http://nlp.seas.harvard.edu/images/the-annotated-transformer_14_0.png "Attention Is All You Need.Figure 1(by Ashish Vaswani et al.)")


### 2.1. Data Preparation

#### 2.1.1. to generate the data  

We use the [templates](https://github.com/AKSW/NSpM/tree/master/data) in CSV format provided by [SPARQL as a Foreign Language](https://arxiv.org/abs/1708.07624)[4] to generate the training data for the experiments.

The generated data consists of two parts, namely, `data.en` the source data, and `data.sparql` the target data.

In the `data.en` are the natural language questions with RDF entities annotated to be translated into RDF structured query language SPARQL, like in this example,

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

after which this script will convert the data into a training set and validation set with building the vocabulary:

```bash
python data_preprocess.py --data_dir=./data/QALD7
```

Then, we need to pre-peocess the data and build the vocabulary file and split the data into tarining set and validation set:

```bash
python transformer_main.py --data_dir=./data/QALD7/DATA_DIR --model_dir=./data/QALD7/model_QALD7   --vocab_file=./data/QALD7/vocab.en_sparql   --param_set=big 

```

*  Please make sure the folders and paths that have been set in the commands already exist. 
*  one previously generated dataset can be found [here](https://github.com/StuartCHAN/neural-qa/blob/gsoc-stuart/transformer_atten/transformer/data.zip).

<br>

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

* Training Time

![Training Time.](https://res.cloudinary.com/stuarteec/image/upload/v1566822800/training_time_xxuzuj.png "Training Time")


* Loss

    This shows the cross-entropy loss while training:

![loss.](https://res.cloudinary.com/stuarteec/image/upload/v1566787028/loss_sngtwq.png "loss")


* GERBIL Evaluation

    The table shows the evaluation result for the QALD-7 benchmark:

    The [GERBIL](http://gerbil-qa.aksw.org/gerbil/) is an online platform to do the question-answering F1-score evaluation with confusion matrix, and this table shows the answering accuracy of the model's output.

![Evaluation.](https://res.cloudinary.com/stuarteec/image/upload/v1566787028/transf_good.gerbil.qald7_jtqxfx.png "Evaluation")

    For better comparison, we have a blog about the [results](https://stuartjchan.online/2019/07/19/Week-7&8/) of QALD evaluation of original NSpM model.

<br>

## Summary

I am so glad to have this experience this summer with my excellent mentors. I now get more knowledge during our research in natural language processing, knowledge graph, and deep learning. It's profounding my mind in scientific research, which ignites the flame of unquenchable curiosity in artificial intelligence.

So here, I want to talk about our project. We are using long natural language text to generate the templates because we know how important the templates are in the training the neural SPARQL machine on the knowledge graph.

Also, we tried to employ the state-of-the-art model, Transformer of attention mechanism, to play the role of the learner from natural language questions into the SPARQL queries.

What's more, we want to make the system a never-ending-learner, like the [Never-Ending Learning for Open-Domain Question Answering over Knowledge Bases](https://dl.acm.org/citation.cfm?id=3186004)[5], to keep the long loop of accumulating knowledge. I believe this is a crucial key to artificial general intelligence.

### Evolution of the Project

In the beginning, I mean in the [initial proposal](https://docs.google.com/document/d/1JWrwAzzu2bXXkCpcHH49qy0g-23AciguQzDdfgcnteo/edit?usp=sharing), we wanted to use DBpedia embedding to do the SQuAD machine reading comprehension tasks with reinforcement learning, but gradually we realize the performance of the neural SPARQL machine is highly dependent on the training data which indicate the crucial necessity of automating the templates generation from long contextual passages. The Wikipedia is a wonderful source of plenty of such articles relevant to DBpedia RDF triples, so we decided to evolve an intelligent neural SPARQL machine with automated templates generation, comparison, and accumulation to try to approach a never-ending-learning intelligent agent. 

Of course, during the coding, we have countered so many difficulties, like doing the benchmark evaluations and some tough impediments, but as now I think about these problems, I think they gave me a totally thorough growth. I got to learn more and more about the newest products in the industry and get more adequate with the international coding standards which open my door to a bigger world. For example, in the part of calculating the vector similarity to match existing templates, we first used word mover distance with GLoVe vectors via gensim, but we found that was too heavy and too slow, then we used spaCy and found it much speedier. And soon after this, we found the Universal Sentence Encoder is even better in this task, which is a huge evolution in our development. 

Another thing that I still remember is the paraphrasing of the predicates, we used to think load all the phrases in RAM and do the matching. I still remember that file was so huge even more than 17.6 GB. Then I found the wordnet from nltk can accomplish this paraphrasing task without such a huge cost, which is a smart solution.

### Future Works

We hope to keep on the work on making the question generation even better and including ASK queries, queries that require filter (how many, how much, etc.) and complex queries as well. Because we believe this can make the neural SPARQL machines get even better and better performance.

<br>

## References

[1] Daniel Cer et al. (2018) Universal Sentence Encoder

[2] Ashish Vaswani et al. (2017) Attention Is All You Need 

[3] TensorFlow - Official Models: https://github.com/tensorflow/models 

[4] Tommaso Soru et al. (2017) SPARQL as a Foreign Language

[5] Abdalghani Abujabal et al. (2018) Never-Ending Learning for Open-Domain Question Answering over Knowledge Bases

[6] Rajarshi Das et al. (2017) Question Answering on Knowledge Bases and Text using Universal Schema and Memory Networks  

[7] Haitian Sun et al. (2018) Open Domain Question Answering Using Early Fusion of Knowledge Bases and Text

[8] Svetlana Stenchikova et al. (2018) QASR: Spoken Question Answering Using Semantic Role Labeling



<br>
