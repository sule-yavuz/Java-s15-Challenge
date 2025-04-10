package library;


import java.util.HashSet;
import java.util.Set;

public class Reader extends Person {
    private Set<Book> borrowedBooks = new HashSet<>();
    private static final int MAX_BOOK_LIMIT = 5;


    public Reader(String name) {
        super(name);
    }

    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() <= MAX_BOOK_LIMIT) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am a reader: " + getName());
    }
}
