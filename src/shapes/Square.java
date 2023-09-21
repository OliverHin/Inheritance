package shapes;

public class Square extends Shapes {

    private double length;

    public Square(String color, boolean isFilled, double length) {
        super(color, isFilled);
        this.length = length;
    }

    @Override
    public double getArea(){

        //double area = 0;
        return length * length;
        //return area;

    }

    @Override
    public double getPerimeter() {

        //double perimeter = 0;
        return length * 4;
        //return perimeter;

    }

    @Override
    public void showOff() {
        getArea();
        getPerimeter();
        System.out.println();
        System.out.println("Information of the square:");
        System.out.println();
        System.out.println("The color is: " + getColor());
        System.out.println("Is the square filled: " + getFilled());
        System.out.println("The area of the square is: " + getArea());
        System.out.println("The perimeter of the square is: " + getPerimeter());
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
