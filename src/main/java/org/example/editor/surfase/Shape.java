package org.example.editor.surfase;

public abstract class Shape implements Drawable, Colorable, Painable {
//  private String name;

    public abstract String getName();
    public abstract String getColor();
    public abstract String getPaint();

    public void draw() {
        System.out.println(getName() + " drawn");
    }
    public void colorLine() {
        System.out.println("the " + getName() + " has a " + getColor() + " outline");
    }
    public void painFigure() {
        System.out.println("the " + getName() + " is painted " + getPaint());
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shap = (Shape) o;
        return Objects.equals(name, shap.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
*/
}

