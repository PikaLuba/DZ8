package org.example.editor.surfase;

public class Quad extends Shape {
    private static final String NAME = "Quad";
    private static final String COLOR = "Green";
    private static final String PAINT = "Orange";

    //quad(20, 10, 30, 40, 90, 25, 20, 90);
    //quad(x1,y1,x2,y2,x3,y3,x4,у4) - рисует четырехугольник
    private double X1;
    private double Y1;
    private double X2;
    private double Y2;
    private double X3;
    private double Y3;
    private double X4;
    private double Y4;

    public Quad(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        X1 = x1;
        Y1 = y1;
        X2 = x2;
        Y2 = y2;
        X3 = x3;
        Y3 = y3;
        X4 = x4;
        Y4 = y4;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getColor() {
        return COLOR;
    }

    @Override
    public String getPaint() {
        return PAINT;
    }

}

