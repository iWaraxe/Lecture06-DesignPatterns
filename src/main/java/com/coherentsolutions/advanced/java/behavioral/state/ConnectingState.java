package com.coherentsolutions.advanced.java.behavioral.state;

public class ConnectingState implements State {

    @Override
    public void connect(TCPConnection context) {
        System.out.println("Already connecting...");
    }

    @Override
    public void disconnect(TCPConnection context) {
        System.out.println("Disconnecting...");
        context.setState(new ClosedState());
    }

    @Override
    public void sendData(TCPConnection context, String data) {
        System.out.println("Cannot send data. Still connecting...");
        System.out.println("Connection established.");
        context.setState(new ConnectedState());
        System.out.println("You can finally send the data");
    }
}