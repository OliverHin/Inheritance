package shapes;

public abstract class Shapes {

    private String color;
    private boolean isFilled = true;

    public Shapes(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getFilled() {
        if (isFilled == true) {
            return "Yes";
        }
        return "No";
    }

    public abstract void showOff();
}
