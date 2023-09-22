package shapes;

import java.util.ArrayList;
import java.util.List;

public class CreatingShapes {
    public static void main(String[] args) {

        List<Shapes> allShapes = new ArrayList<>();
        Circle c1 = new Circle("Blue", true, 3);
        Rectangle r1 = new Rectangle("Red", false, 5, 6);
        Square s1 = new Square("Yellow", true, 4);
        allShapes.add(c1);
        allShapes.add(r1);
        allShapes.add(s1);
        r1.setIsFilled(true);


        for (Shapes shape : allShapes) {
            shape.showOff();
        }
    }
}
