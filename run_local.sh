#!/bin/bash

source ~/.bash_profile
$SPARK_HOME/bin/spark-submit --master local[*] --class com.datascience.tutorial.spark.SparkAppMain target/spark-starter-1.0-SNAPSHOT.jar

