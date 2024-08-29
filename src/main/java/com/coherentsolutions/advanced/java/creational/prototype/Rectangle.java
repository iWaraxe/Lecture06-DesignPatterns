package com.coherentsolutions.advanced.java.creational.prototype;

public class Rectangle implements Shape {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with width " + width + " and height " + height);
    }
}