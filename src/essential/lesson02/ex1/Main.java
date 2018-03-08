package essential.lesson02.ex1;

public class Main {

    public static void main(String[] args) {

        // Экземпляры класса
        // для вызова разных конструкторов
        Car carDefault = new Car();
        Car carOneParam = new Car(2004);
        Car carTwoParam = new Car(2002, "red");

        System.out.println("Year: " + carDefault.getYear() + "; Color: " + carDefault.getColor());
        System.out.println("Year: " + carOneParam.getYear() + "; Color: " + carOneParam.getColor());
        System.out.println("Year: " + carTwoParam.getYear() + "; Color: " + carTwoParam.getColor());
    }
}
