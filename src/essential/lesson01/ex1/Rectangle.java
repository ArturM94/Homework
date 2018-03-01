package essential.lesson01.ex1;

public class Rectangle {

    // Поля класса
    private double side1;
    private double side2;

    // Конструктор
    public Rectangle() {
    }

    // Методы доступа
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    // Методы класса
    double areaCalculator() {
        double area = getSide1() * getSide2();
        return area;
    }

    double perimeterCalculator() {
        double perimeter = getSide1() * 2 + getSide2() * 2;
        return perimeter;
    }
}
