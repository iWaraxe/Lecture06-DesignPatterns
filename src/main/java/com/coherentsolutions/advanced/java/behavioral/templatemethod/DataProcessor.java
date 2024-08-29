package com.coherentsolutions.advanced.java.behavioral.templatemethod;

public abstract class DataProcessor {

    // Template method defining the algorithm structure
    public final void process() {
        readData();
        processData();
        saveData();
    }

    // Abstract method to be implemented by subclasses
    protected abstract void readData();

    // Abstract method to be implemented by subclasses
    protected abstract void processData();

    // Concrete method, can be overridden by subclasses if needed
    protected void saveData() {
        System.out.println("Saving data to database...");
    }
}
