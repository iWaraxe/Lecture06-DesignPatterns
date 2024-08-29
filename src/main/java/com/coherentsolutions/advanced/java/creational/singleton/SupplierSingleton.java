package com.coherentsolutions.advanced.java.creational.singleton;
import java.util.function.Supplier;

public class SupplierSingleton {

    private static volatile Supplier<SupplierSingleton> instanceSupplier = SupplierSingleton::createInstance;

    private SupplierSingleton() {
        // private constructor
    }

    private static SupplierSingleton createInstance() {
        class SingletonSupplier implements Supplier<SupplierSingleton> {
            private final SupplierSingleton instance = new SupplierSingleton();

            @Override
            public SupplierSingleton get() {
                return instance;
            }
        }
        if (instanceSupplier == null || instanceSupplier.get() == null) {
            instanceSupplier = new SingletonSupplier();
        }
        return instanceSupplier.get();
    }

    public static SupplierSingleton getInstance() {
        return instanceSupplier.get();
    }
}
