package essential.lesson01.ex2;

public class Author {

    // Поле класса
    private String authorName;

    // Конструктор
    public Author() {
    }

    // Методы доступа
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // Метод класса
    void show () {
        System.out.println("Имя автора: " + authorName);
    }
}
