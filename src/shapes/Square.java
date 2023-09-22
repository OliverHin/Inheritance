package shapes;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, double length) {
        super(color, isFilled, length, length);
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


    @Override
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Width or length can't be null or negative");
        }
        this.setLength(length);
        this.setWidth(length);
    }
    @Override
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width or length can't be null or negative");
        }
        this.setLength(width);
        this.setWidth(width);
    }


}
