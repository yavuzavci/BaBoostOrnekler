package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Ders {

	private int kontenjan;
	private String isim;
	private ArrayList<Ogrenci> ogrenciListesi;
	private ArrayList<Ogretmen> ogretmenListesi;
	
	public Ders(int kontenjan, String isim) {
		super();
		this.kontenjan = kontenjan;
		this.isim = isim;
		this.ogrenciListesi = new ArrayList<Ogrenci>();
		this.ogretmenListesi = new ArrayList<Ogretmen>();
	}

	public int getKontenjan() {
		return kontenjan;
	}

	public void setKontenjan(int kontenjan) {
		this.kontenjan = kontenjan;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public ArrayList<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}

	public void setOgrenciListesi(ArrayList<Ogrenci> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}

	public ArrayList<Ogretmen> getOgretmenListesi() {
		return ogretmenListesi;
	}

	public void setOgretmenListesi(ArrayList<Ogretmen> ogretmenListesi) {
		this.ogretmenListesi = ogretmenListesi;
	}
	
		
}
