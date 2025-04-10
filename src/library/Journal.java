package library;

public class Journal extends Book {
    private String issueDate;

    public Journal(String id, String title, String author, double price, String issueDate) {
        super(id, title, author, price);
        this.issueDate = issueDate;
    }
}