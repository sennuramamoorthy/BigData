package com.sennu.jil;

import shaded.parquet.org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JSONProcessor {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            ClassLoader classLoader = new JSONProcessor().getClass().getClassLoader();
            File jsonFile = new File(classLoader.getResource("SampleJSON.json").getFile());

            Scanner myScanner = new Scanner(jsonFile);
            while(myScanner.hasNextLine()){
                System.out.println(myScanner.nextLine());
            }
            myScanner.close();

            AutosysBox processingJob =  mapper.readValue( jsonFile, AutosysBox.class);
            System.out.println(processingJob.toString());

            String jsonString  = mapper.writeValueAsString(processingJob);
            System.out.println("JSON:" + jsonString);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
