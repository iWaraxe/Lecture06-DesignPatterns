package com.coherentsolutions.advanced.java.creational.prototype;

public class Circle implements Shape {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
}
