package com.coherentsolutions.advanced.java.behavioral.state;

public class ClosedState implements State {

    @Override
    public void connect(TCPConnection context) {
        System.out.println("Connecting...");
        context.setState(new ConnectingState());
    }

    @Override
    public void disconnect(TCPConnection context) {
        System.out.println("Already disconnected.");
    }

    @Override
    public void sendData(TCPConnection context, String data) {
        System.out.println("Cannot send data. Connection is closed.");
    }
}