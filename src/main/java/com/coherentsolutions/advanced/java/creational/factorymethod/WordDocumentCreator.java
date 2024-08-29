package com.coherentsolutions.advanced.java.creational.factorymethod;

public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

