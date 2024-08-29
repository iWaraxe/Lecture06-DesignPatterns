package com.coherentsolutions.advanced.java.creational.factorymethod;

public abstract class DocumentCreator {
    // Factory method
    public abstract Document createDocument();

    public void createAndSaveDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
    }
}
