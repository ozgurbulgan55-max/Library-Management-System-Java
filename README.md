📚 Kütüphane Yönetim Sistemi – Java

Java ile nesne yönelimli programlama prensipleri kullanılarak geliştirilmiş temel bir Kütüphane Yönetim Sistemi uygulamasıdır.
Bu proje; kitap ekleme, üye ekleme, kitap ödünç verme ve kitap iade etme işlemlerini simüle eden küçük ölçekli bir yönetim sistemi sunar.

🚀 Projenin Amacı

Bu proje, Java’da:

Sınıf yapıları (Class)

Nesne yönelimli programlama (OOP)

Encapsulation

ArrayList kullanımı

Sınıflar arası ilişki kurma (Composition)

LocalDate ile tarih işlemleri

gibi temel programlama kavramlarını uygulamalı olarak öğrenmek ve göstermek amacıyla geliştirilmiştir.

🧩 Sınıf Diyagramı

Proje aşağıdaki temel sınıflardan oluşmaktadır:

Sınıf	Açıklama
book	Kitap bilgilerini tutar (ad, yazar, fiyat, sayfa sayısı, ödünç durumu)
Member	Üye bilgilerini tutar (ad, soyad, üye numarası)
Loan	Ödünç alınan kitapların kayıtlarını tutar (ödünç tarihi, iade tarihi)
Library	Kütüphane yönetim fonksiyonlarını içerir (kitap/üye ekleme, ödünç verme, iade etme)
main	Programın çalıştırıldığı sınıf
🧮 Kullanılan Teknolojiler

Java 21

Object-Oriented Programming (OOP)

ArrayList

LocalDate

Eclipse IDE

📂 Proje Yapısı
src/
 ├── Classes/
 │    ├── book.java
 │    ├── Member.java
 │    ├── Loan.java
 │    ├── Library.java
 │
 └── Main/
      └── main.java

🔍 Temel Özellikler
✔ Kitap ekleme
✔ Üye ekleme
✔ Kitap ödünç verme

— Ödünç alma tarihi otomatik belirlenir
— İade tarihi otomatik +15 gün olarak hesaplanır

✔ Kitap iade etme
✔ Kitap & Üye listesini görüntüleme
🖥️ Konsol Çalışma Örneği
Kitap eklendi: Suç ve Ceza
Kitap eklendi: Kürk Mantolu Madonna
Üye eklendi: Muhammed
Üye eklendi: Özgür

--- Kitap Ödünç Alma İşlemi ---
Kitap ödünç verildi → Suç ve Ceza, Alan üye → Muhammed

--- Kitap İade İşlemi ---
Kitap iade edildi: Suç ve Ceza

📌 Örnek Kod (main.java)
package Main;

import Classes.*;

public class main {
    public static void main(String[] args) {

        Library library = new Library();

        book b1 = new book("Suç ve Ceza", "Dostoyevski", 89.90, 670);
        book b2 = new book("Kürk Mantolu Madonna", "Sabahattin Ali", 55.50, 160);

        library.addBook(b1);
        library.addBook(b2);

        Member m1 = new Member("Muhammed", "Çalış", 1);
        Member m2 = new Member("Özgür", "Bulgan", 2);

        library.addMember(m1);
        library.addMember(m2);

        System.out.println("\n--- Kitap Ödünç Alma İşlemi ---");
        library.borrowBook(m1, b1);

        System.out.println("\n--- Kitap İade İşlemi ---");
        library.returnBook(b1);
    }
}

🧠 Kazanımlar

Bu projeyi tamamlayarak:

Java’da sınıf tasarlama,

Sınıflar arası ilişkileri modelleme,

ArrayList yönetimi,

Tarih işlemleri (LocalDate)

Temel kütüphane yönetim mantığı

konularında beceri kazanırsınız.

📄 Lisans

MIT Lisansı ile paylaşılmıştır.

👤 Geliştirici

Özgür Bulgan
Yazılım Mühendisliği – Harran Üniversitesi
