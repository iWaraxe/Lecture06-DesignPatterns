package com.coherentsolutions.advanced.java.creational.prototype;

public interface Shape extends Cloneable {
    Shape clone();
    void draw();
}
