package com.sennu.spark.analytics;

import com.sennu.spark.util.SparkFileReader;
import com.sennu.spark.util.SparkHelper;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SparkWindowsExample {
    public static void main(String[] args) {
        SparkSession sparkSession = SparkHelper.getSparkSession();
        Dataset<Row> sourceData = SparkFileReader.readCSVFile(sparkSession, "./Spark/src/main/resources/SaprkData/WindowSampleData.csv", true);
        sourceData.show();

        sourceData.createOrReplaceTempView("accountData");

        sparkSession.sql(" select AccountNo, usageData, sum(usageData) OVER (partition by AccountNo order by AccountNo range between current row and 3 following) as sumAccountNo from accountData").show();

    }
}
