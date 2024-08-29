package com.coherentsolutions.advanced.java.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported operating system.");
        }

        Application app = new Application(factory);
        app.paint();
    }
}
