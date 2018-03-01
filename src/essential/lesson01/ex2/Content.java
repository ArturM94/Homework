package essential.lesson01.ex2;

public class Content {

    // Поле класса
    private String contentName;

    // Конструктор
    public Content() {
    }

    // Методы доступа
    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    // Метод класса
    void show () {
        System.out.println("Содержание книги: " + contentName);
    }
}
