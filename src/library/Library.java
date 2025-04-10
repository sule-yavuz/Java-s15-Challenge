package library;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Reader> readers = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book searchBookById(String id) {
        return books.get(id);
    }

    public void lendBook(String bookId, Reader reader) {
        Book book = books.get(bookId);
        if (book != null && book.getStatus().equals("AVAILABLE")) {
            if (reader.borrowBook(book)) {
                book.setStatus("BORROWED");
                System.out.println("Kitap ödünç verildi: " + book.getTitle());
            }
        }
    }

    public void takeBackBook(String bookId) {
        Book book = books.get(bookId);
        if (book != null) {
            book.setStatus("AVAILABLE");
            System.out.println("Kitap iade alındı: " + book.getTitle());
        }
    }
}