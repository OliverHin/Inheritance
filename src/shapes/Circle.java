package shapes;

public class Circle extends Shapes {

    private double radius;

    public Circle(String color,
                  boolean isFilled,
                  double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    @Override
    public double getArea() {

        //double area = 0;
        return Math.PI * (radius * radius);
        //return area;

    }

    @Override
    public double getPerimeter() {

        //double perimeter;
        return 2 * radius * Math.PI;
        //return perimeter;

    }

    @Override
    public void showOff() {
        getArea();
        getPerimeter();
        System.out.println();
        System.out.println("Information of the circle:");
        System.out.println();
        System.out.println("The color is: " + getColor());
        System.out.println("Is the circle filled: " + getFilled());
        System.out.println("The area of the circle is: " + getArea());
        System.out.println("The perimeter of the circle is: " + getPerimeter());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius can't be null or negative");
        }
        this.radius = radius;
    }
}
