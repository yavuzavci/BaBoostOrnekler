package com.bilgeadam.lesson022.oys;

public class Calisan extends Kisi {
	
	private String sicilNo;
	private int calismaSaati;
	private double maas;
	
	
	public Calisan(String isim, String soyisim) {
		super(isim, soyisim);
	}
	
	public Calisan(String isim, String soyisim, int calismaSaati, double maas) {
		super(isim, soyisim);
		this.calismaSaati = calismaSaati;
		this.maas = maas;
	}
	
	public String getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}
	public int getCalismaSaati() {
		return calismaSaati;
	}
	public void setCalismaSaati(int calismaSaati) {
		this.calismaSaati = calismaSaati;
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	
}
