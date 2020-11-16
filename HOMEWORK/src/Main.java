import Figures.Figures;

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Stream;
import Figures.Points;
import Utils.Utils;
import java.util.ArrayList;
public class Main {

    private static final String FILE_NAME = "template.txt";

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static File f = new File("C:/StudyJava/figures.txt");
    public static String name;
    public static  Scanner scanIn;
    // private static Scanner readM = new Scanner(System.in);
    public final TreeMap<String, Figures<Points>> shapes;
    private final String fileName;



    public Main(TreeMap<String, Figures<Points>> shapes, String fileName) {
        this.shapes = shapes;
        this.fileName = fileName;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Выберете действие из предложенных:\n" +
                "s - показать все фигуры \n" +
                "n - выбрать одну фигуру для действия над ней \n" +
                "r - сохранить \n" +
                "d - удалить фигуру \n" +
                "x - выход");
        name = br.readLine();
        if (name.equals("n")) {
            System.out.println("Доступно фигур: 2" + ".\nВведите порядковый номер 1,2 для выбора фигуры");
            name = br.readLine();



            Scanner sc = new Scanner(f);
            sc.useDelimiter(" ");
            System.out.println("Вы выбрали:" + sc.next());
            // actionWithFigure();

        }
        if (name.equals("s")) {
            BufferedReader fin = new BufferedReader(new FileReader(f));
            String line;
            while ((line = fin.readLine()) != null) System.out.println(line);

        }
        if (name.equals("x")) {
        exitPr();
        }
    }
    private static void actionWithFigure() throws IOException {
        System.out.println("Выберете действие над фигурой из предложенных:\\n\" +\n" +
                "                \"s1 - переместить \\n\" +\n" +
                "                \"s2 - увеличить \\n\" +\n" +
                "                \"s3 - расчитать площадь \\n\" +\n" +
                "                \"s4 - удалить\"");
        name = br.readLine();

        if (name.equals("s1")) {
            System.out.println("Введите число на которое передвинуть по горизонтале");
            name = br.readLine();

        }
        if (name.equals("s2")) {
            System.out.println("Введите число на которое увеличить");
            name = br.readLine();
        }
        if (name.equals("s3")) {
          //  System.out.println(points.calculateArea());

        }
        if (!(name.equals("s3") || name.equals("s2") || name.equals("s1"))) {
            System.out.println("Такого значения нет в списке");
            actionWithFigure();
        }

    }
    private static  void exitPr() throws IOException {
        System.out.println("Хотите выйти: Y/N ?)");
        name = br.readLine();
        if (name.equals("Y")) {
            System.exit(0);
        } else if (name.equals("N"))
        {
            System.out.flush();
        } else if (!(name.equals("Y") || name.equals("N")))
        {
            System.out.println("Такого значения нет в списке");
            exitPr();
        }
    }
    public static void saveToFile() {

            Stream<String> stream = br.lines();
           // readFile = stream.collect(Collectors.toList());
            String path = "C:/StudyJava/figures.txt";
           // br.writeToNewFile(figuresInString, new File(path));
            System.out.println("Сохранение завершено");
    }

}



