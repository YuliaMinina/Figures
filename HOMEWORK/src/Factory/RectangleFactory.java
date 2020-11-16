package Factory;

import Figures.Figures;
import Figures.Rectangle;
import Figures.Points;
import java.util.List;

public class RectangleFactory {

    public Rectangle createShape(List<Points> points) {

        return new Rectangle(points);
    }
}
