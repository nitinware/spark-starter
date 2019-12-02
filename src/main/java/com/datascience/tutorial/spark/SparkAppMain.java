package com.datascience.tutorial.spark;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkAppMain {

    public static void main(String[] args) {
        Logger.getLogger("org").setLevel(Level.OFF);
        Logger.getLogger("akka").setLevel(Level.OFF);

        SparkConf sparkConf = new SparkConf()
                    .setAppName("Example Spark App");
                    //.setMaster("local[*]"); // Delete this line when submitting to a cluster

        JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);
        JavaRDD<String> stringJavaRDD = sparkContext.textFile("src/main/resources/nationalparks.csv");
        System.out.println("Number of lines in file = " + stringJavaRDD.count());
    }

}
