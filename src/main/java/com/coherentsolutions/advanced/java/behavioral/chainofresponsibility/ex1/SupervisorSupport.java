package com.coherentsolutions.advanced.java.behavioral.chainofresponsibility.ex1;

public class SupervisorSupport extends SupportHandler {

    @Override
    public void handleRequest(String issue) {
        if (issue.equals("Intermediate Issue")) {
            System.out.println("Supervisor Support: Handling the issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        } else {
            System.out.println("Supervisor Support: Cannot handle the issue. Escalating...");
        }
    }
}