package com.bilgeadam.lesson033;
/*
 * ürün sınıfı -> isim fiyat ve int son kullanma tarihi 1970,2022
 * daha sonra 
 * urunManager ==> sınıfı oluşturalım
 * eğer ürün ismi yoksa ve fiyatı 0 ve 0 dan küçükse null dönecek
 * bu koşulların aksinde ürün oluşturp onu döneceğiz
 */
public class Urun {
	private String ad;
	private double fiyat;
	private int sonKullanmaTarihi;
	
	public Urun() {
		
	}
	
	public Urun(String isim, double fiyat) {
		this.ad = isim;
		this.fiyat = fiyat;
	}
	
	public Urun(String ad, double fiyat, int sonKullanmaTarihi) {
		this.ad = ad;
		this.fiyat = fiyat;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	public int getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}
	
	public void setSonKullanmaTarihi(int sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}
	
	@Override
	public String toString() {
		return "Urun [ad=" + ad + ", fiyat=" + fiyat + ", sonKullanmaTarihi=" + sonKullanmaTarihi + "]";
	}
		
}
