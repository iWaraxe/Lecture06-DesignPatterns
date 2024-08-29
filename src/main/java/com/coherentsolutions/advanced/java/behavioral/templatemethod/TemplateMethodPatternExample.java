package com.coherentsolutions.advanced.java.behavioral.templatemethod;

public class TemplateMethodPatternExample {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CsvDataProcessor();
        csvProcessor.process();

        System.out.println();

        DataProcessor xmlProcessor = new XmlDataProcessor();
        xmlProcessor.process();
    }
}
