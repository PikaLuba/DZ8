package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import org.example.editor.surfase.Shape;
import org.example.editor.surfase.Circle;
import org.example.editor.surfase.Rectangle;
import org.example.editor.surfase.Triangle;
import org.example.editor.surfase.Ellipse;
import org.example.editor.surfase.Quad;

import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {
        // 1.
        Shape[] shape = {new Rectangle(8.2, 12),
                new Triangle(5, 8.1, 5),
                new Circle(10.1),
                new Ellipse(24.3, 22.1),
                new Quad(20.5, 10, 30, 40, 90, 25, 20, 90)
        };
        for(Shape shap : shape) {
            System.out.println(shap.getName());
            System.out.println(shap.getColor() + " " + shap.getPaint());
            shap.draw();
            shap.colorLine();
            shap.painFigure();
            System.out.println(" ");
        }
/*
    // 2.
        //   StringReader stringReader = new StringRead("10,5.3,8");
        StringReader stringReader = new KeyboardStringRead();
        String str = stringReader.read();
        String[] strArray = str.split(",");
        double[] number = new double[8];
        for (int i = 0; i < 7; i++) {
            number[i] = 0.0;
        }
        for (int i = 0; i < strArray.length-1; i++) {
            number[i] = Double.valueOf(strArray[i]);
        }

        Shape[] shape = {new Rectangle(number[0], number[1]),
                new Triangle(number[0], number[1], number[2]),
                new Circle(number[0]),
                new Ellipse(number[0], number[1]),
                new Quad(number[0], number[1], number[2], number[3], number[4], number[5], number[6], number[7])
        };
        for(Shape shap : shape)
            System.out.println(shap.getName());
*/
    }
}