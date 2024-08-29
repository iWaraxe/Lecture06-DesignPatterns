package com.coherentsolutions.advanced.java.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShapeStructure {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void applyVisitor(ShapeVisitor visitor) {
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}