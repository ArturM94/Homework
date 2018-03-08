package essential.lesson02.ex2;

public class Car {

    // Поля класса
    private int year;
    private double speed;
    private int weight;
    private String color;

    // Перегруженные конструкторы
    // Конструктор по умолчанию
    public Car() {
        this.year = 1997;
        this.speed = 214;
        this.weight = 1680;
        this.color = "white";
    }

    // Конструктор с одним параметром
    public Car(int year) {
        this.year = year;
        this.speed = 205;
        this.weight = 1766;
        this.color = "yellow";
    }

    // Конструктор с двумя параметрами
    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1852;
        this.color = "green";
    }

    // Конструктор с тремя параметрами
    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "silver";
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
