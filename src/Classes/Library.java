package Classes;
import java.util.ArrayList;
public class Library {
    private ArrayList<book> books;
    private ArrayList<Member> members;
    private ArrayList<Loan> loans;
    public Library() {
        books = new ArrayList();
        members = new ArrayList();
        loans = new ArrayList();
    }
    public void addBook(book b) {
        books.add(b);
        System.out.println("Kitap eklendi: " + b.KitapAdi());
    }
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Kütüphanede hiç kitap yok.");
            return;
        }
        System.out.println("\n--- Kitap Listesi ---");
        for (book b : books) {
            System.out.println(b);
        }
    }
    public void addMember(Member m) {
        members.add(m);
        System.out.println("Üye eklendi: " + m.getname());
    }
    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("Kayıtlı üye yok.");
            return;
        }
        System.out.println("\n--- Üye Listesi ---");
        for (Member m : members) {
            System.out.println(m);
        }
    }
    public void borrowBook(Member member, book kitap) {

        if (kitap == null || member == null) {
            System.out.println("Geçersiz işlem!");
            return;
        }

        if (kitap.isBorrowed()) {
            System.out.println("Kitap zaten ödünç alınmış!");
            return;
        }
        Loan loan = new Loan(kitap, member);
        loans.add(loan);
        kitap.setBorrowed(true);

        System.out.println("Kitap ödünç verildi → " + kitap.KitapAdi() +
                           ", Alan üye → " + member.getname());
    }
    public void returnBook(book kitap) {

        if (!kitap.isBorrowed()) {
            System.out.println("Bu kitap zaten kütüphanede.");
            return;
        }
        kitap.setBorrowed(false);
        loans.removeIf(loan -> loan.getBook().equals(kitap));
        System.out.println("Kitap iade edildi: " + kitap.KitapAdi());
    }
}
