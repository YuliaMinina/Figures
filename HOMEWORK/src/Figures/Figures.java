package Figures;

import Interface.IMovable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Figures<P> implements  IMovable {

     Points center;
     double perimetr;
     double squere;
    ArrayList <Figures> pointscoordinate;

    String getCoordinatesToString(){
        StringBuilder tempCoordinates  = new StringBuilder();
       
        for (int i = 0; i < pointscoordinate.size(); i++) {
           // tempCoordinates.append(pointscoordinate.get(i).getX()).append(" ").append(pointscoordinate.get(i).getY());
            if (i<pointscoordinate.size()-1) tempCoordinates.append(";");
        }
        return tempCoordinates.toString().replace(".", ",");
    }



    public Figures(List<Points> points){


    }


    public double getPerimetr() {
        return perimetr;
    }

    public double getSquere() {
        return squere;
    }

    public void calculateArea(){

    }

    @Override
    public void move(int distanX, int distanY) {

    }


    public void rotate(double angle) {

    }


}

