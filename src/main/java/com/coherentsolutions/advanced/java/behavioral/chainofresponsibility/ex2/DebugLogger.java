package com.coherentsolutions.advanced.java.behavioral.chainofresponsibility.ex2;

public class DebugLogger extends Logger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debug: " + message);
    }
}