package com.coherentsolutions.advanced.java.creational.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final SerializedSingleton INSTANCE = new SerializedSingleton();

    private SerializedSingleton() {
        // private constructor
    }

    public static SerializedSingleton getInstance() {
        return INSTANCE;
    }

    // Ensure that serialization does not create a new instance
    protected Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
