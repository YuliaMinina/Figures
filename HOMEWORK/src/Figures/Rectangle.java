package Figures;
import Figures.Points;
import java.util.List;

public class Rectangle extends Figures {
    public List<Points> points;
    public Rectangle(List<Points> points) {
        super(points);
    }



    public void increase(double scalePoints) {
        for (Points point : points) {
            point.setX(center.getX() + scalePoints * (point.getX() - center.getX()));
            point.setY(center.getY() + scalePoints * (point.getY() - center.getY()));
        }
    }

    @Override
    public void move(int distanX, int distanY) {

    }

    @Override
    public void rotate(double scalePoints) {


    }
}
