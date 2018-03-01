package essential.lesson01.ex2;

public class Title {

    // Поле класса
    private String titleName;

    // Конструктор
    public Title() {
    }

    // Методы доступа
    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    // Метод класса
    void show () {
        System.out.println("Название книги: " + titleName);
    }
}