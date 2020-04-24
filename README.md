# Spark Starter Project

#### Command to start a Spark Cluster and single worker locally.
```shell script
source ~/.bash_profile
## Start Spark Cluster locally
$SPARK_HOME/sbin/start-master.sh --host 127.0.0.1 

## Start Spark worker for the Spark Cluster locally
$SPARK_HOME/sbin/start-slave.sh spark://127.0.0.1:7077 --host 127.0.0.1
```
#### Command to submit Spark Job to Spark Cluster.
```shell script
source ~/.bash_profile

SPARK_MASTER=$1

$SPARK_HOME/bin/spark-submit --master $SPARK_MASTER --class com.datascience.tutorial.spark.SparkAppMain target/spark-starter-1.0-SNAPSHOT.jar
```
