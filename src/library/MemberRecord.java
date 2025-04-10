package library;

import java.time.LocalDate;

public class MemberRecord {
    private String memberId;
    private String type; // "Student" veya "Faculty"
    private LocalDate dateOfMembership;
    private int noBooksIssued;
    private final int maxBookLimit;
    private String name;
    private String address;
    private String phoneNo;

    public MemberRecord(String memberId, String type, String name, String address, String phoneNo) {
        this.memberId = memberId;
        this.type = type;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dateOfMembership = LocalDate.now();
        this.noBooksIssued = 0;
        this.maxBookLimit = (type.equals("Student")) ? 5 : 10; // Öğrenciler 5, Fakülte 10 kitap alabilir
    }

    // Kitap işlemleri
    public void incBooksIssued() {
        if (noBooksIssued < maxBookLimit) {
            noBooksIssued++;
        }
    }

    public void decBooksIssued() {
        if (noBooksIssued > 0) {
            noBooksIssued--;
        }
    }

    // Fatura ödeme
    public void payBill(double amount) {
        System.out.println(name + " üyesi $" + amount + " tutarında ödeme yaptı.");
    }

    // Getter'lar
    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public int getNoBooksIssued() { return noBooksIssued; }
    public int getMaxBookLimit() { return maxBookLimit; }
}