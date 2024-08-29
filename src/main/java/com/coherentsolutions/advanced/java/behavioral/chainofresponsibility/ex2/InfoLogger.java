package com.coherentsolutions.advanced.java.behavioral.chainofresponsibility.ex2;

public class InfoLogger extends Logger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info: " + message);
    }
}