import library.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian("Admin", "1234");
        Scanner scanner = new Scanner(System.in);

        // Örnek veriler
        library.addBook(new Book("B001", "Clean Code", "Robert Martin", 29.99));
        MemberRecord member = new MemberRecord("M001", "Student", "Ahmet", "İstanbul", "5551234567");
        System.out.println(member.getName());
        // Konsol menüsü
        while (true) {
            System.out.println("\n1. Kitap Ödünç Al\n2. Kitap İade Et\n3. Çıkış");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme

            switch (choice) {
                case 1:
                    System.out.print("Kitap ID: ");
                    String bookId = scanner.nextLine();
                    librarian.issueBook(library, bookId, member);
                    break;
                case 2:
                    System.out.print("Kitap ID: ");
                    bookId = scanner.nextLine();
                    librarian.returnBook(library, bookId, member);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}