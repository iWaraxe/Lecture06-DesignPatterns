package com.coherentsolutions.advanced.java.structural.facade.subsystems;

public class Lights {
    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%.");
    }

    public void on() {
        System.out.println("Lights are on.");
    }
}