package com.coherentsolutions.advanced.java.behavioral.visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}