package Factory;

import Figures.Circle;
import Figures.Figures;
import Figures.Points;
import java.util.List;

public class CircleFactory {

    public Circle createShape(List<Points> points) {

        return new Circle(points);
    }
}
