package com.coherentsolutions.advanced.java.creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        // private constructor
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
