package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Okul {
	
	private String isim;
	private String adres;
	public static final ArrayList<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();  
	public static final ArrayList<Ogretmen> ogretmenListesi = new ArrayList<Ogretmen>();
	public static final ArrayList<Memur> memurListesi = new ArrayList<Memur>();      
	
		
	public Okul(String isim, String adres) {
		super();
		this.isim = isim;
		this.adres = adres;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}	
	
}
