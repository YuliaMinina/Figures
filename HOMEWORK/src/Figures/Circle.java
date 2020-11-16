package Figures;


import Interface.IIncreasable;
import Interface.IMovable;
import Interface.IRotatable;

import java.util.List;

public class Circle extends Figures implements IIncreasable, IMovable, IRotatable {
    private double radius;

    public Circle(List<Points> points, double radius) {
        super(points);
       // this.center = points.get(0);
       // this.radius = radius;
    }
    public Circle(List<Points> points) {
        super(points);
    }

    @Override
    public void increase(double size) {

    }

    @Override
    public void move(int distanX, int distanY) {

    }

    @Override
    public void rotate(double angle) {

    }
}


