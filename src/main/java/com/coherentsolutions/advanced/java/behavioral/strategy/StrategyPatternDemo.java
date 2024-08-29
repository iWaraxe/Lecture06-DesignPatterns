package com.coherentsolutions.advanced.java.behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay by Credit Card
        cart.setPaymentStrategy(new CreditCardStrategy("1234567890123456", "John Doe"));
        cart.checkout(100);

        // Pay by PayPal
        cart.setPaymentStrategy(new PayPalStrategy("john.doe@example.com"));
        cart.checkout(200);

        // Pay by Bitcoin
        cart.setPaymentStrategy(new BitcoinStrategy("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout(300);
    }
}
