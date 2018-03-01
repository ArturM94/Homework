package essential.lesson01.additional.task;

public class Main {

    public static void main(String[] args) {

        // Экземпляр класса Address
        Address address = new Address();

        // Поля экземпляра класса Address
        address.setIndex(123456);
        address.getIndex();

        address.setCountry("Ukraine");
        address.getCountry();

        address.setCity("Dnipro");
        address.getCity();

        address.setStreet("Default street");
        address.getStreet();

        address.setHouse(3);
        address.getHouse();

        address.setApartment(77);
        address.getApartment();

        System.out.println("Index: " + address.getIndex());
        System.out.println("Country: " + address.getCountry());
        System.out.println("City: " + address.getCity());
        System.out.println("Street: " + address.getStreet());
        System.out.println("House: " + address.getHouse());
        System.out.println("Apartment: " + address.getApartment());
    }
}
