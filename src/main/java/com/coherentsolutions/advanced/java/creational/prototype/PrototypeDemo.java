package com.coherentsolutions.advanced.java.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        // Original objects
        Circle circle1 = new Circle(5, "Red");
        Rectangle rectangle1 = new Rectangle(10, 20, "Blue");

        // Clone objects
        Circle circle2 = (Circle) circle1.clone();
        Rectangle rectangle2 = (Rectangle) rectangle1.clone();

        // Modify cloned objects
        circle2.draw();
        rectangle2.draw();
    }
}
