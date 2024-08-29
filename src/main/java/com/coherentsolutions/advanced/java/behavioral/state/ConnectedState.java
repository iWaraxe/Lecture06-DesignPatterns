package com.coherentsolutions.advanced.java.behavioral.state;

public class ConnectedState implements State {

    @Override
    public void connect(TCPConnection context) {
        System.out.println("Already connected.");
    }

    @Override
    public void disconnect(TCPConnection context) {
        System.out.println("Disconnecting...");
        context.setState(new ClosedState());
    }

    @Override
    public void sendData(TCPConnection context, String data) {
        System.out.println("Sending data: " + data);
    }
}