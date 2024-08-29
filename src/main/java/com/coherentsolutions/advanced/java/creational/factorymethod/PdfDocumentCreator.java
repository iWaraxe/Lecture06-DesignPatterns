package com.coherentsolutions.advanced.java.creational.factorymethod;

public class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
