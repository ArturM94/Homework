package essential.lesson01.ex2;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {

        // Экземпляры класса
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        Scanner scanner = new Scanner(System.in);

        // Поля экземпляра класса
        System.out.println("Введите название книги: ");
        title.setTitleName(scanner.nextLine());
        title.getTitleName();

        System.out.println("Введите автора книги: ");
        author.setAuthorName(scanner.nextLine());
        author.getAuthorName();

        System.out.println("Введите содержание книги: ");
        content.setContentName(scanner.nextLine());
        content.getContentName();

        title.show();
        author.show();
        content.show();
    }
}
