package com.coherentsolutions.advanced.java.creational.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DocumentCreator wordCreator = new WordDocumentCreator();
        DocumentCreator pdfCreator = new PdfDocumentCreator();

        wordCreator.createAndSaveDocument();
        pdfCreator.createAndSaveDocument();
    }
}
