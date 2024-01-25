package org.example.editor.surfase;

public class Circle extends Shape {
    private static final String NAME = "Circle";
    private static final String COLOR = "Blue";
    private static final String PAINT = "Green";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
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

/*    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
*/
}

