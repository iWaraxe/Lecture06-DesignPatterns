package com.coherentsolutions.advanced.java.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
        // private constructor
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
