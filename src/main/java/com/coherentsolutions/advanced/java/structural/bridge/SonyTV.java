package com.coherentsolutions.advanced.java.structural.bridge;

public class SonyTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Sony TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV is turned off.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sony TV volume set to " + volume);
    }
}
