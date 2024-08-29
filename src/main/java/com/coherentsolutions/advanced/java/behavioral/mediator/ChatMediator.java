package com.coherentsolutions.advanced.java.behavioral.mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
