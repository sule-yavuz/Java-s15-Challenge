package library;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<Book> books = new ArrayList<>();

    public Author(String name) {
        super(name);
    }

    public void newBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        books.forEach(book -> System.out.println(book.getTitle()));
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am an author: " + getName());
    }
}