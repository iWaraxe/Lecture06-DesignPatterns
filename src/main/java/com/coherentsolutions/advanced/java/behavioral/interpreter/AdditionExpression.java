package com.coherentsolutions.advanced.java.behavioral.interpreter;

public class AdditionExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public AdditionExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}