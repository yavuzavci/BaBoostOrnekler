package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Ogrenci extends Kisi{
	
	private String okulNo;
	private double notOrt;
	private ArrayList<Ders> dersListesi;
	
	
	public Ogrenci(String isim, String soyisim, String adres) {
		super(isim, soyisim, adres);
		this.dersListesi = new ArrayList<Ders>();
	}

	public Ogrenci(String isim, String soyisim) {
		super(isim, soyisim);
		this.dersListesi = new ArrayList<Ders>();
	}	
	
	public String getOkulNo() {
		return okulNo;
	}

	public void setOkulNo(String okulNo) {
		this.okulNo = okulNo;
	}

	public double getNotOrt() {
		return notOrt;
	}

	public void setNotOrt(double notOrt) {
		this.notOrt = notOrt;
	}

	public ArrayList<Ders> getDersListesi() {
		return dersListesi;
	}	
	
}
