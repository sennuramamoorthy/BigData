package com.sennu.spark.util;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SparkFileReader {

    public static Dataset<Row> readCSVFile(SparkSession sparkSession, String fileName, boolean havaHeader) {
        Dataset<Row> inputData = sparkSession.read().option("header", havaHeader).csv(fileName);
        return inputData;
    }
}
