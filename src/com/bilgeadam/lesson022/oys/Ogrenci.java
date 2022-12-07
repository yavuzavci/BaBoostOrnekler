package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Ogrenci extends Kisi{
	
	private String okulNo;
	private static int index;
	private double notOrt;
	private ArrayList<Ders> dersListesi;
	
	
	public Ogrenci(String isim, String soyisim, String adres) {
		super(isim, soyisim, adres);
		this.dersListesi = new ArrayList<Ders>();
		okulNoAta();
	}

	public Ogrenci(String isim, String soyisim) {
		super(isim, soyisim);
		this.dersListesi = new ArrayList<Ders>();
		okulNoAta();
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
	
	@Override
	public void menu() {
		super.menu();
		System.out.println("1- Ders Kaydı Yap");
		System.out.println("2- Not ortalaması görüntüle");
		System.out.println("3- Aldığım dersleri listele");
	}

	@Override
	public String toString() {
		return "Ogrenci [okulNo=" + okulNo + ", notOrt=" + notOrt + ", getIsim()=" + getIsim() + ", getSoyisim()="
				+ getSoyisim() + ", getAdres()=" + getAdres() + "]";
	}
	
	public void okulNoAta() {
		
	}
	
}
