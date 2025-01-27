package ClassWork24.test_archive.model;
//Задача 1. Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
// Уникальный номер документа содержит 10 цифр.

import java.util.Objects;

public class Dokument {
    private String uniqueNumber;
    private String title;
    private String author;

    // Конструктор
    public Dokument(String uniqueNumber, String title, String author) {
        if (uniqueNumber.length() != 10 || !uniqueNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Уникальный номер документа должен содержать ровно 10 цифр.");
        }
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Заголовок не может быть пустым.");
        }
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Автор не может быть пустым.");
        }
        this.uniqueNumber = uniqueNumber;
        this.title = title;
        this.author = author;
    }

    // Геттеры
    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Сеттеры
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Заголовок не может быть пустым.");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Автор не может быть пустым.");
        }
        this.author = author;
    }

    @Override
    public String toString() {
        return "Документ: " + title + ", Автор: " + author + ", Номер: " + uniqueNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dokument dokument = (Dokument) obj;
        return uniqueNumber.equals(dokument.uniqueNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueNumber);
    }
}

