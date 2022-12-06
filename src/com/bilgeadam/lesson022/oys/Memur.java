package com.bilgeadam.lesson022.oys;

public class Memur extends Calisan implements IOgrenciIsleri{

	public Memur(String isim, String soyisim, int calismaSaati, double maas) {
		super(isim, soyisim, calismaSaati, maas);
	}

	public Memur(String isim, String soyisim) {
		super(isim, soyisim);
	}

	@Override
	public Ogrenci ogrenciKaydi() {
		
		return null;
	}

	@Override
	public boolean ogrenciKaydiSil(String ogrenciNo) {
		
		return false;
	}

	@Override
	public void bilgilendirmeYap(Ogrenci ogrenci) {
		
	}

	@Override
	public boolean dersKaydiOnayla(Ders ders, Ogrenci ogrenci) {
		
		return false;
	}
	
}
