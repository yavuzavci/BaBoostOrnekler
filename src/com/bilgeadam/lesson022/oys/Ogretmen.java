package com.bilgeadam.lesson022.oys;

import java.util.ArrayList;

public class Ogretmen extends Calisan {
	
	private ArrayList<Ders> dersListesi;
	private boolean nobetciMi;
	
	public Ogretmen(String isim, String soyisim) {
		super(isim, soyisim);
		this.dersListesi = new ArrayList<Ders>();
	}

	public Ogretmen(String isim, String soyisim, int calismaSaati, double maas) {
		super(isim, soyisim, calismaSaati, maas);
		this.dersListesi = new ArrayList<Ders>();
	}

	public ArrayList<Ders> getDersListesi() {		
		return dersListesi;
	}

	public boolean isNobetciMi() {
		return nobetciMi;
	}

	public void setNobetciMi(boolean nobetciMi) {
		this.nobetciMi = nobetciMi;
	}
	
	@Override
	public void menu() {
		super.menu();
		System.out.println("1- Girdiğim dersleri listele");
		System.out.println("2- Nöbetçilik durumu sorgula");
	}
	
}
