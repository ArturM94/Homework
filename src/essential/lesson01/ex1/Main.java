package essential.lesson01.ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Экземпляр класса
        Rectangle rectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);

        // Поля экземпляра класса
        System.out.println("Введите сторону a: ");
        rectangle.setSide1(scanner.nextDouble());
        rectangle.getSide1();

        System.out.println("Введите сторону b: ");
        rectangle.setSide2(scanner.nextDouble());
        rectangle.getSide2();

        double area = rectangle.areaCalculator();
        double perimeter = rectangle.perimeterCalculator();

        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }

}
