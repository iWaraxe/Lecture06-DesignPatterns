package com.coherentsolutions.advanced.java.structural.bridge;

public class SamsungTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Samsung TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV is turned off.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Samsung TV volume set to " + volume);
    }
}