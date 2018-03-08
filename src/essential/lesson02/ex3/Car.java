package essential.lesson02.ex3;

public class Car {

    // Поля класса
    private int year;
    private double speed;
    private int weight;
    private String color;

    // Перегрузка конструктора через вызов конструктора из конструктора
    // Конструктор по умолчанию
    public Car() {
        this(1997, 214, 1680, "white");
    }

    // Конструктор с одним параметром
    public Car(int year) {
        this(year, 205, 1766, "yellow");
    }

    // Конструктор с двумя параметрами
    public Car(int year, double speed) {
        this(year, speed, 1852, "green");
    }

    // Конструктор с тремя параметрами
    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "silver");
    }

    // Конструктор с четырьмя параметрами
    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
