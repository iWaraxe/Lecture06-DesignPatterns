package com.coherentsolutions.advanced.java.behavioral.visitor;

public class VisitorPatternExample {
    public static void main(String[] args) {
        ShapeStructure structure = new ShapeStructure();

        structure.addShape(new Circle(5));
        structure.addShape(new Rectangle(4, 6));

        ShapeVisitor areaVisitor = new AreaVisitor();
        ShapeVisitor renderVisitor = new RenderVisitor();

        System.out.println("Calculating areas:");
        structure.applyVisitor(areaVisitor);

        System.out.println("\nRendering shapes:");
        structure.applyVisitor(renderVisitor);
    }
}
