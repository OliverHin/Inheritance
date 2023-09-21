package shapes;

public class Rectangle extends Shapes {

    private double width;
    private double length;

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {

        //double area = 0;
        return width * length;
        //return area;

    }
    @Override
    public double getPerimeter() {

        // double perimeter = 0;
        return  (width * 2) + (length * 2);
        //return  perimeter;
    }

    @Override
    public void showOff() {
        getArea();
        getPerimeter();
        System.out.println();
        System.out.println("Information of the rectangle:");
        System.out.println();
        System.out.println("The color is: " + getColor());
        System.out.println("Is the rectangle filled: " + getFilled());
        System.out.println("The area of the rectangle is: " + getArea());
        System.out.println("The perimeter of the rectangle is: " + getPerimeter());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width or length can't be null or negative");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Width or length can't be null or negative");
        }
        this.length = length;
    }


}
