package essential.lesson02.additional.task;

public class MyArea {

    // Поля класса
    private static final double PI = 3.14;
    private double r;

    // Конструктор
    public MyArea() {
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    // Метод площади круга
    static double areaOfCircle(double r) {

        double area;
        area = PI * Math.pow(r, 2);
        return area;
    }


}
