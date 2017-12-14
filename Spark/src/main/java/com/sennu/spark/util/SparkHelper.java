package com.sennu.spark.util;

import org.apache.spark.sql.SparkSession;

public class SparkHelper {

    private SparkHelper(){}
    public static SparkSession getSparkSession(){
        SparkSession sparkSession = SparkSession.builder().master("local[*]").getOrCreate();
        return sparkSession;
    }
}

