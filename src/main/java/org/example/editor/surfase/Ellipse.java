package org.example.editor.surfase;

public class Ellipse extends Shape {

    private static final String NAME = "Ellipse";
    private static final String COLOR = "Orange";
    private static final String PAINT = "Black";
    private double semiaxis1;
    private double semiaxis2;

    public Ellipse(double semiaxis1, double semiaxis2) {
        this.semiaxis1 = semiaxis1;
        this.semiaxis2 = semiaxis2;
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
