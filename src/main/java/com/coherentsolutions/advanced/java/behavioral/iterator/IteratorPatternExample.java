package com.coherentsolutions.advanced.java.behavioral.iterator;

public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jack", "Jill"};

        NameCollection nameCollection = new ConcreteNameCollection(names);
        Iterator iterator = nameCollection.createIterator();

        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
