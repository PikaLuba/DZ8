package org.example.editor.input;

public class StringRead implements StringReadable {
    private String line;
    public StringRead(String line) {
        this.line = line;
    }

    @Override
    public String read() {

        return line;
    }
}
