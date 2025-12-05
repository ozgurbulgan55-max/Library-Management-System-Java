package Classes;

public class book {

	private String KitapAdi;
	private String yazarAdi;
	private double fiyat;
	private int SayfaSayisi;
	public book(String kitapAdi, String yazarAdi, double fiyat, int sayfaSayisi) {
		this.KitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.fiyat = fiyat;
		this.SayfaSayisi = sayfaSayisi;
	}
	
	public String toString() {
		return "Kitap Adı : " + KitapAdi +
				"\nYazar : " + yazarAdi +
				"\nFiyat : " + fiyat +
				"\nSayfa Sayısı : " + SayfaSayisi;
	}

	public String KitapAdi() {
		return KitapAdi;
	}

	public boolean isBorrowed() {
		return false;
	}

	public void setBorrowed(boolean b) {
		
	}
}
