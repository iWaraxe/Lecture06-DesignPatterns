package com.coherentsolutions.advanced.java.creational.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicSingleton {
    private static final AtomicReference<AtomicSingleton> INSTANCE = new AtomicReference<>();

    private AtomicSingleton() {
        // private constructor
    }

    public static AtomicSingleton getInstance() {
        if (INSTANCE.get() == null) {
            INSTANCE.compareAndSet(null, new AtomicSingleton());
        }
        return INSTANCE.get();
    }
}

