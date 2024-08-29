package com.coherentsolutions.advanced.java.behavioral.memento;

public class TextEditorMemento {
    private final String text;

    public TextEditorMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
