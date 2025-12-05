# 📚 Kütüphane Yönetim Sistemi – Java

Modern yazılım geliştirme prensiplerine uygun olarak hazırlanmış **Java tabanlı Kütüphane Yönetim Sistemi** projesidir.  
Proje; kitap, üye ve ödünç alma işlemlerini yöneten OOP yapıları içermektedir.

---

## ✨ Özellikler

- 📘 Kitap ekleme, silme, listeleme  
- 🧑‍🤝‍🧑 Üye ekleme, listeleme  
- 🔄 Kitap ödünç alma ve iade sistemi  
- ⏳ LocalDate ile otomatik teslim tarihi hesaplama  
- 🧱 Nesne yönelimli güçlü sınıf yapısı (Book, Member, Loan, Library)

---

## 🛠️ Kullanılan Teknolojiler

- **Java SE**
- **OOP (Encapsulation, Class Design)**
- **ArrayList Koleksiyon Yapıları**
- **java.time.LocalDate API**

---

## 🧩 Sınıf Diyagramı (Basitleştirilmiş)


---

## 🚀 Örnek Çalışma Çıktısı

```text
Kitap eklendi: Suç ve Ceza
Kitap eklendi: Kürk Mantolu Madonna
Üye eklendi: Muhammed
Üye eklendi: Özgür

--- Kitap Ödünç Alma İşlemi ---
Kitap ödünç verildi → Suç ve Ceza, Alan üye → Muhammed
Teslim Tarihi: 2025-12-20
src/
 ├── Classes/
 │   ├── book.java
 │   ├── Member.java
 │   ├── Loan.java
 │   └── Library.java
 └── Main/
     └── main.java
