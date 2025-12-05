package Main;

import Classes.*;

public class main {
    public static void main(String[] args) {

        Library lib = new Library();

        book k1 = new book("Suç ve Ceza", "Dostoyevski", 89.90, 670);
        book k2 = new book("Kürk Mantolu Madonna", "Sabahattin Ali", 55.00, 160);
        book k3 = new book("Martin Eden", "Jack London", 79.90, 420);

        lib.addBook(k1);
        lib.addBook(k2);
        lib.addBook(k3);

        Member m1 = new Member("Muhammed", "Çalış", 101);
        Member m2 = new Member("Özgür", "Bulgan", 102);

        lib.addMember(m1);
        lib.addMember(m2);

        System.out.println("\n--- Kitap Ödünç Alma İşlemi ---");
        lib.borrowBook(m1, k1);
        lib.borrowBook(m2, k1);

        System.out.println("\n--- Kitap İade İşlemi ---");
        lib.returnBook(k1);
        lib.borrowBook(m2, k1);

        System.out.println("\n--- Kütüphane Kitapları ---");
        lib.listBooks();

        System.out.println("\n--- Üye Listesi ---");
        lib.listMembers();
    }
}
