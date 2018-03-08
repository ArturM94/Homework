package essential.lesson02.ex2;

public class Main {

    public static void main(String[] args) {

        // Экземпляры класса с разными параметрами
        Car carDefault = new Car();
        Car carOneParam = new Car(2008);
        Car carTwoParam = new Car(2009, 195);
        Car carThreeParam = new Car(2010, 223, 1800);
        Car carFourParam = new Car(2011, 240, 1750, "black");

        System.out.println("Year: " + carDefault.getYear() +
                        "; Speed: " + carDefault.getSpeed() +
                       "; Weight: " + carDefault.getWeight() +
                        "; Color: " + carDefault.getColor());

        System.out.println("Year: " + carOneParam.getYear() +
                        "; Speed: " + carOneParam.getSpeed() +
                       "; Weight: " + carOneParam.getWeight() +
                        "; Color: " + carOneParam.getColor());

        System.out.println("Year: " + carTwoParam.getYear() +
                        "; Speed: " + carTwoParam.getSpeed() +
                       "; Weight: " + carTwoParam.getWeight() +
                        "; Color: " + carTwoParam.getColor());

        System.out.println("Year: " + carThreeParam.getYear() +
                        "; Speed: " + carThreeParam.getSpeed() +
                       "; Weight: " + carThreeParam.getWeight() +
                        "; Color: " + carThreeParam.getColor());

        System.out.println("Year: " + carFourParam.getYear() +
                        "; Speed: " + carFourParam.getSpeed() +
                       "; Weight: " + carFourParam.getWeight() +
                        "; Color: " + carFourParam.getColor());
    }
}
