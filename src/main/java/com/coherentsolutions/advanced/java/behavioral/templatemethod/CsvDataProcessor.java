package com.coherentsolutions.advanced.java.behavioral.templatemethod;

public class CsvDataProcessor extends DataProcessor {

    @Override
    protected void readData() {
        System.out.println("Reading data from CSV file...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV data...");
    }
}

