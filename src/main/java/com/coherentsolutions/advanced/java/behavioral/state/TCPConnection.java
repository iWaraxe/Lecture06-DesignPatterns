package com.coherentsolutions.advanced.java.behavioral.state;

public class TCPConnection {
    private State currentState;

    public TCPConnection() {
        currentState = new ClosedState();  // Initial state
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void connect() {
        currentState.connect(this);
    }

    public void disconnect() {
        currentState.disconnect(this);
    }

    public void sendData(String data) {
        currentState.sendData(this, data);
    }
}