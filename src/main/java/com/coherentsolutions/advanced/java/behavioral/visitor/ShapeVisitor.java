package com.coherentsolutions.advanced.java.behavioral.visitor;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
