package library;

import java.util.Objects;

public class Book implements LibraryItem {
    private String id;
    private String title;
    private String author;
    private double price;
    private String status; // "AVAILABLE" veya "BORROWED"

    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.status = "AVAILABLE";
    }

    // Interface Metotları
    @Override
    public String getTitle() { return title; }
    @Override
    public String getAuthor() { return author; }
    @Override
    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(status, book.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, price, status);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }

    // Getter & Setter
    public String getId() { return id; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}