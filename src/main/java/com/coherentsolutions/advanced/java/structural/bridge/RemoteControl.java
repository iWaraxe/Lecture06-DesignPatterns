package com.coherentsolutions.advanced.java.structural.bridge;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);
}

