package org.example.editor.surfase;

public class Rectangle extends Shape {
    private static final String NAME = "Rectangle";
    private static final String COLOR = "Green";
    private static final String PAINT = "Blue";

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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


/*  public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
*/
}
