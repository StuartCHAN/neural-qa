#!/usr/bin/env bash

cat ./data/$1_model/evaluation.csv

cat ./data/$1/data.en  | while read LINE  
do
        echo $LINE
        cd nmt

        echo "$LINE" > to_ask.txt
        python -m nmt.nmt  --vocab_prefix=../$1/vocab --model_dir=../$1_model  --inference_input_file=./to_ask.txt  --inference_output_file=./output.txt --out_dir=../$1_model --src=en --tgt=sparql | tail -n4
        MODEL_DIR= $1_model
        if [ $? -eq 0 ]
        then
            echo ""
            echo "the evaluation begins:"
            ENCODED="$(cat output.txt)"
            python ../evaluation.py  "${ENCODED}"   $LINE  $MODEL_DIR
            
            echo ""
        fi

        cd ..

done


