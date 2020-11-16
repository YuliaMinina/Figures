package Utils;

import Figures.Figures;
import Figures.Points;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public final class Utils {
    public static File f = new File("C:/StudyJava/figures.txt");
    private static String line;
    //получаем из файла данные
    public static ArrayList<Figures> readFiguresFromFile() {
        ArrayList<Figures> figures = new ArrayList<>();
        try (BufferedReader fin = new BufferedReader(new FileReader(f))) {
            while (fin != null) {
                String firstparam = fin.readLine();
                 ArrayList<Points> points;
                points = receivePoints(firstparam.split(";"));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return figures;
    }

    private static ArrayList<Points> receivePoints(String[] firstparam) {
        ArrayList<Points> points = new ArrayList<>();
        for (String param : firstparam) {
            try (Scanner scanner = new Scanner(param)) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                points.add(new Points(x, y));
            }

            return points;
    }
        return points;
}
    public static double getDistanceBetweenTwoPoints(Points p1, Points p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx*dx +dy*dy);
    }

}

