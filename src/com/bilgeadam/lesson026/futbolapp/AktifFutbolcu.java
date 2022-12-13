package com.bilgeadam.lesson026.futbolapp;

public abstract class AktifFutbolcu extends Futbolcu{

	public AktifFutbolcu(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
	}
	
	public abstract int pasSkoruHesapla();
	public abstract int golSkoruHesapla(int kurtaris);
	
	public boolean pasVer() {
		int skor = this.pasSkoruHesapla();
		if(skor > 68)
			return true;		
		else
			return false;
		
	}
	public boolean golVurusu(int kurtaris) {
		int skor = this.golSkoruHesapla(kurtaris);
		if(skor > 68) 
			return true;
		else
			return false;		
	}

}
