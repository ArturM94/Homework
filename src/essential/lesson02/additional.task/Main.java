package essential.lesson02.additional.task;

public class Main {

    public static void main(String[] args) {

        // Экземпляр класса
        MyArea myArea = new MyArea();

        // Поле экземпляра класса
        myArea.setR(5);

        // Вывод радиуса
        System.out.println(MyArea.areaOfCircle(myArea.getR()));
    }
}
