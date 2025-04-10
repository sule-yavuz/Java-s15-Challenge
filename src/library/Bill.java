package library;

public class Bill {
    private double amount;
    private String bookTitle;

    public Bill(double amount, String bookTitle) {
        this.amount = amount;
        this.bookTitle = bookTitle;
    }

    public void displayBill() {
        System.out.println("Fatura: " + bookTitle + " - Ücret: $" + amount);
    }
}
