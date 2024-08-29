package com.coherentsolutions.advanced.java.structural.decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Basic notifier
        Notifier basicNotifier = new BasicNotifier();

        // Notifier with SMS functionality
        Notifier smsNotifier = new SMSNotifier(basicNotifier);

        // Notifier with SMS and Email functionality
        Notifier smsEmailNotifier = new EmailNotifier(smsNotifier);

        // Notifier with SMS, Email, and Slack functionality
        Notifier fullNotifier = new SlackNotifier(smsEmailNotifier);

        // Send a message using the full notifier
        fullNotifier.send("Hello, this is a notification!");

        // Output:
        // Sending message: Hello, this is a notification!
        // Sending SMS: Hello, this is a notification!
        // Sending Email: Hello, this is a notification!
        // Sending Slack message: Hello, this is a notification!
    }
}

