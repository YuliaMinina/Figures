package Factory;

import Figures.Figures;
import Figures.Triangle;
import Figures.Points;
import java.util.List;

public class TriangleFactory {

    public Triangle createShape(List<Points> points) {

        return new Triangle(points);
    }
}