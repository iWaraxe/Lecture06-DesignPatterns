package com.coherentsolutions.advanced.java.behavioral.state;

public interface State {
    void connect(TCPConnection context);
    void disconnect(TCPConnection context);
    void sendData(TCPConnection context, String data);
}
