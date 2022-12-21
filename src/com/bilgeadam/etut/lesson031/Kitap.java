package com.bilgeadam.etut.lesson031;

import java.util.UUID;

public class Kitap {
	private int id;
	private String isim;
	private Yazar yazar;
	private int sayfaSayisi;
	private String isbnKodu;
	
	public Kitap(String isim, int sayfaSayisi) {
		super();
		this.id = ++Utility.kitapId;
		this.isim = isim;
		this.sayfaSayisi = sayfaSayisi;
		this.isbnKodu = UUID.randomUUID().toString();
	}
	
	public Kitap(String isim, int sayfaSayisi, Yazar yazar) {
		super();
		this.id = Utility.kitapId++;
		this.isim = isim;
		this.sayfaSayisi = sayfaSayisi;
		this.yazar = yazar;
		this.isbnKodu = UUID.randomUUID().toString();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Yazar getYazar() {
		return yazar;
	}

	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public String getIsbnKodu() {
		return isbnKodu;
	}

	public void setIsbnKodu(String isbnKodu) {
		this.isbnKodu = isbnKodu;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", isim=" + isim + ", yazar=" + yazar + ", sayfaSayisi=" + sayfaSayisi
				+ ", isbnKodu=" + isbnKodu + "]";
	}
	
	
}
