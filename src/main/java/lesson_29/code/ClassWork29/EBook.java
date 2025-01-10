package ClassWork29;

/**
 * Класс EBook представляет электронную книгу.
 * Наследует базовые свойства и методы класса Book и добавляет специфические для электронной книги функции.
 */
public class EBook extends Book {

    private double fileSize; // Размер файла электронной книги в мегабайтах / File size of the ebook in megabytes

    /**
     * Конструктор для создания объекта электронной книги с заданным названием, автором и размером файла.
     * @param title Название книги / Title of the book
     * @param author Автор книги / Author of the book
     * @param fileSize Размер файла электронной книги в мегабайтах / File size of the ebook in megabytes
     */
    public EBook(String title, String author, double fileSize) {
        super(title, author); // Вызов конструктора базового класса / Call the superclass constructor
        this.fileSize = fileSize;
    }

    /**
     * Переопределённый метод read из базового класса.
     * Выводит сообщение, что книга читается в электронном формате.
     */
    @Override
    public void read() {
        System.out.println("Reading " + getTitle() + " by " + getAuthor() + " in electronic format");
    }

    /**
     * Метод для загрузки электронной книги.
     * Выводит сообщение с названием книги и её размером.
     */
    public void download() {
        System.out.println("Downloading " + getTitle() + ", size: " + fileSize + " MB");
    }

    /**
     * Возвращает размер файла электронной книги.
     * @return Размер файла электронной книги / File size of the ebook
     */
    public double getFileSize() {
        return fileSize;
    }

    /**
     * Устанавливает размер файла электронной книги.
     * @param fileSize Новый размер файла в мегабайтах / New file size in megabytes
     */
    public void setFileSize(double fileSize) {
        if (fileSize > 0) {
            this.fileSize = fileSize;
        } else {
            System.out.println("File size must be positive.");
        }
    }
} // klass ended
