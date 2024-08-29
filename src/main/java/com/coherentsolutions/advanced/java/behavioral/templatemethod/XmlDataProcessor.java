package com.coherentsolutions.advanced.java.behavioral.templatemethod;

public class XmlDataProcessor extends DataProcessor {

    @Override
    protected void readData() {
        System.out.println("Reading data from XML file...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing XML data...");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving XML data to a specific XML database...");
    }
}
