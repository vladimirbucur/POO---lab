package task4;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        // Morometii, written by Marin Preda, published in 1955
        return title + ", written by " + author + ", published in " + year;
    }
}
