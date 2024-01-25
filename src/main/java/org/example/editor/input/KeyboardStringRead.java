package org.example.editor.input;

import java.util.Scanner;

public class KeyboardStringRead implements StringReadable {
    @Override
    public String read() {
        System.out.println("Enter 8 values separated by commas:");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        scanner.close();
        return result;
    }

}
