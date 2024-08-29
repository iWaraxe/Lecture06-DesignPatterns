package com.coherentsolutions.advanced.java.behavioral.chainofresponsibility.ex1;

public class DirectorSupport extends SupportHandler {

    @Override
    public void handleRequest(String issue) {
        if (issue.equals("Complex Issue")) {
            System.out.println("Director Support: Handling the issue.");
        } else {
            System.out.println("Director Support: Cannot handle the issue. No further escalation possible.");
        }
    }
}
