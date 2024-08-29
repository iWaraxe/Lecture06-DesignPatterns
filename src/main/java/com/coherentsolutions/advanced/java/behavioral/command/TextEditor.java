package com.coherentsolutions.advanced.java.behavioral.command;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String str) {
        text.append(str);
    }

    public void eraseLast(int length) {
        int start = text.length() - length;
        if (start >= 0) {
            text.delete(start, text.length());
        }
    }

    public String getText() {
        return text.toString();
    }
}
