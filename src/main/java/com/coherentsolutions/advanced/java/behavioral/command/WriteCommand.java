package com.coherentsolutions.advanced.java.behavioral.command;

public class WriteCommand implements Command {
    private TextEditor textEditor;
    private String textToWrite;

    public WriteCommand(TextEditor textEditor, String textToWrite) {
        this.textEditor = textEditor;
        this.textToWrite = textToWrite;
    }

    @Override
    public void execute() {
        textEditor.write(textToWrite);
    }

    @Override
    public void undo() {
        textEditor.eraseLast(textToWrite.length());
    }
}
