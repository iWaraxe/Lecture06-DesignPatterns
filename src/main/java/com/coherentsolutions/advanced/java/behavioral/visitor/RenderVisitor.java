package com.coherentsolutions.advanced.java.behavioral.visitor;

public class RenderVisitor implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("Rendering a circle with radius: " + circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rendering a rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());
    }
}
