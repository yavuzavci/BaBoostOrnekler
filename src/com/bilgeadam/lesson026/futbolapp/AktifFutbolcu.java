package com.bilgeadam.lesson026.futbolapp;

public abstract class AktifFutbolcu extends Futbolcu{

	public AktifFutbolcu(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
	}
	
	public abstract int pasSkoruHesapla();
	
	public boolean pasVer() {
		int skor = this.pasSkoruHesapla();
		if(skor > 65) {
			System.out.println("Başarılı Pas");
			return true;
		}
		else{
			System.out.println("Başarılı Pas");
			return true;
		}
	}

}
