package com.coherentsolutions.advanced.java.behavioral.interpreter;

public class InterpreterPatternExample {
    public static void main(String[] args) {
        // Represents the expression: (5 + 10) - 3
        Expression expression = new SubtractionExpression(
                new AdditionExpression(
                        new NumberExpression(5),
                        new NumberExpression(10)
                ),
                new NumberExpression(3)
        );

        int result = expression.interpret();
        System.out.println("Result: " + result);  // Output should be 12
    }
}