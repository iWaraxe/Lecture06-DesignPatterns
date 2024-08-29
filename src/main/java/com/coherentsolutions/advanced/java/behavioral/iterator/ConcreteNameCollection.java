package com.coherentsolutions.advanced.java.behavioral.iterator;

public class ConcreteNameCollection implements NameCollection {
    private String[] names;

    public ConcreteNameCollection(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator createIterator() {
        return new NameIterator(names);
    }
}
