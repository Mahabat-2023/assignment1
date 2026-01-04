import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Shape;
import models.Point;

public class MyApplication {
    public static void main(String[] args) {
        Shape shape = new Shape();
        try {
            File file = new File("C:/Users/PrOsT/Desktop/скрипт — копия/src/source");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextDouble()) {
                double Artur = scanner.nextDouble();
                double Yurt = scanner.nextDouble();
                shape.addPoint(new Point(Artur, Yurt));
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет!");
            return;
        }

        System.out.println("Периметр фигуры: " + shape.getPerimeter());
        System.out.println("Самый длинный отрезок: " + shape.getLongestSide());
        System.out.println("Средняя длина стороны: " + shape.getAverageSide());
    }
}
