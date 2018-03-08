package essential.lesson02.ex1;

public class Car {

    // Поля класса
    private int year;
    private String color;

    // Конструктор по умолчанию
    public Car() {
    }

    // Конструктор с одним параметром
    public Car(int year) {
        this.year = year;
    }

    // Конструктор с двумя параметрами
    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
