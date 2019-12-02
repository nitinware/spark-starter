#!/bin/bash

if [ "$#" -ne 1 ]; then
   echo "Usage:   ./run_on_cluster.sh spark_master_url"
   echo "Example: ./run_on_cluster.sh spark://C02XV03DJGH8MBP:7077"
   exit
fi
source ~/.bash_profile

SPARK_MASTER=$1

$SPARK_HOME/bin/spark-submit --master $SPARK_MASTER --class com.datascience.tutorial.spark.SparkAppMain target/spark-starter-1.0-SNAPSHOT.jar

