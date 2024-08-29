package com.coherentsolutions.advanced.java.creational.abstractfactory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in MacOS style.");
    }
}
