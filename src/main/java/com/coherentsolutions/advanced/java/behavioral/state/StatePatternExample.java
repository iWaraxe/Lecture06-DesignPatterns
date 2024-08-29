package com.coherentsolutions.advanced.java.behavioral.state;

public class StatePatternExample {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();

        connection.connect();
        connection.sendData("Hello, World!"); // Should fail as the connection is not yet established
        connection.disconnect();

        connection.sendData("Hello again!");  // Should fail as the connection is closed
        connection.connect();
        connection.sendData("Hello, World!"); // Should fail as the connection is not yet established
        connection.sendData("Hello, World!");
    }
}
