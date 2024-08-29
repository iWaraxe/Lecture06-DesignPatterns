package com.coherentsolutions.advanced.java.creational.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // private constructor
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
