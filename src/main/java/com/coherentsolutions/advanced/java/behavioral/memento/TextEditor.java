package com.coherentsolutions.advanced.java.behavioral.memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Saves the current state inside a memento
    public TextEditorMemento save() {
        return new TextEditorMemento(text);
    }

    // Restores the state from a memento
    public void restore(TextEditorMemento memento) {
        this.text = memento.getText();
    }
}

