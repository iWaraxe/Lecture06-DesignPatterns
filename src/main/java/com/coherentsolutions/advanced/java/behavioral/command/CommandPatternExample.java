package com.coherentsolutions.advanced.java.behavioral.command;

public class CommandPatternExample {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CommandInvoker invoker = new CommandInvoker();

        // Execute some commands
        invoker.executeCommand(new WriteCommand(textEditor, "Hello, "));
        invoker.executeCommand(new WriteCommand(textEditor, "world!"));

        System.out.println("Text after writing: " + textEditor.getText());

        // Undo last command
        invoker.undoCommand();
        System.out.println("Text after undo: " + textEditor.getText());

        // Undo another command
        invoker.undoCommand();
        System.out.println("Text after another undo: " + textEditor.getText());
    }
}
