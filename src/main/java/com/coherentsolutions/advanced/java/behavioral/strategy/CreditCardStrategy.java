package com.coherentsolutions.advanced.java.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardStrategy(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}
