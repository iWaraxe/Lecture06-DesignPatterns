package com.coherentsolutions.advanced.java.creational.singleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        //new EagerSingleton();
        System.out.println(singleton1 == singleton2);
    }
}
