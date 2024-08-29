package com.coherentsolutions.advanced.java.behavioral.memento;

public class MementoPatternExample {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        textEditor.setText("First draft");
        caretaker.save(textEditor);

        textEditor.setText("Second draft");
        caretaker.save(textEditor);

        textEditor.setText("Final draft");

        System.out.println("Current text: " + textEditor.getText());

        caretaker.undo(textEditor);
        System.out.println("After undo: " + textEditor.getText());

        caretaker.undo(textEditor);
        System.out.println("After second undo: " + textEditor.getText());
    }
}
