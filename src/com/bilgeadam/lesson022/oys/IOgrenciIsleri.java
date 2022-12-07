package com.bilgeadam.lesson022.oys;

public interface IOgrenciIsleri {
	
	Ogrenci ogrenciKaydi();
	boolean ogrenciKaydiSil(String ogrenciNo);
	void bilgilendirmeYap(Ogrenci ogrenci);
	boolean dersKaydiOnayla(Ders ders, Ogrenci ogrenci);
	void ogretmenlerListesi();
	void ogrencilerListesi();
}
