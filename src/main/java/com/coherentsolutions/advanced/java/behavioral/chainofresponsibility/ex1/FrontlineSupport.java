package com.coherentsolutions.advanced.java.behavioral.chainofresponsibility.ex1;

public class FrontlineSupport extends SupportHandler {

    @Override
    public void handleRequest(String issue) {
        if (issue.equals("Simple Issue")) {
            System.out.println("Frontline Support: Handling the issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("Frontline Support: Cannot handle the issue. Escalating...");
        }
    }
}