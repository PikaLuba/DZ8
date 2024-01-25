package org.example.editor.surfase;

public class Triangle extends Shape {
    private static final String NAME = "Triangle";
    private static final String COLOR = "Black";
    private static final String PAINT = "Red";
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

 /*   public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

  */
}

