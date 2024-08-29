package com.coherentsolutions.advanced.java.structural.bridge;

public class BridgePatternExample {
    public static void main(String[] args) {
        Device sonyTV = new SonyTV();
        RemoteControl sonyRemote = new BasicRemoteControl(sonyTV);

        sonyRemote.turnOn();
        sonyRemote.setVolume(10);
        sonyRemote.turnOff();

        System.out.println();

        Device samsungTV = new SamsungTV();
        AdvancedRemoteControl samsungRemote = new AdvancedRemoteControl(samsungTV);

        samsungRemote.turnOn();
        samsungRemote.setVolume(20);
        samsungRemote.mute();
        samsungRemote.turnOff();
    }
}

