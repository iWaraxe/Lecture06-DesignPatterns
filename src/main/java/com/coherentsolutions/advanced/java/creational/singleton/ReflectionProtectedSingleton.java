package com.coherentsolutions.advanced.java.creational.singleton;

public class ReflectionProtectedSingleton {
    private static final ReflectionProtectedSingleton INSTANCE = new ReflectionProtectedSingleton();

    private static boolean instanceCreated = false;

    private ReflectionProtectedSingleton() {
        if (instanceCreated) {
            throw new RuntimeException("Use getInstance() method to create");
        }
        instanceCreated = true;
    }

    public static ReflectionProtectedSingleton getInstance() {
        return INSTANCE;
    }
}

