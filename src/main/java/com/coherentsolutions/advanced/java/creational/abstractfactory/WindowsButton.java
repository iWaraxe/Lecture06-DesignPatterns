package com.coherentsolutions.advanced.java.creational.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}
