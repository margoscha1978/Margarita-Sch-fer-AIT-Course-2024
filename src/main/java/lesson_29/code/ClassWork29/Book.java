package ClassWork29;

/**
 * Класс Book представляет книгу с названием и автором.
 * Предоставляет базовый функционал для работы с книгами.
 */
public class Book {

    protected String title; // Название книги / Title of the book
    protected String author; // Автор книги / Author of the book

    /**
     * Конструктор для создания книги с заданным названием и автором.
     * @param title Название книги / Title of the book
     * @param author Автор книги / Author of the book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Метод для вывода информации о книге.
     * Method to print information about the book.
     */
    public void printInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    /**
     * Метод для чтения книги в бумажном формате.
     * Method for reading the book in paper format.
     */
    public void read() {
        System.out.println("Reading " + title + " by " + author + " in paper format");
    }

    /**
     * Возвращает название книги.
     * @return Название книги / Title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Устанавливает название книги.
     * @param title Новое название книги / New title of the book
     */
    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be null or empty.");
        }
    }

    /**
     * Возвращает автора книги.
     * @return Автор книги / Author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Устанавливает автора книги.
     * @param author Новый автор книги / New author of the book
     */
    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Author cannot be null or empty.");
        }
    }
} // klass ended

