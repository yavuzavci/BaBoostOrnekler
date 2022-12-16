package com.bilgeadam.lesson028.queue;

public class Musteri implements Comparable<Musteri>{
	private String ad;
	private int yas;
	private int id;
	public Musteri() {
		ad = "";
		yas = 0;
		id = 0;
	}
	public Musteri(String ad, int yas, int id) {
		super();
		this.ad = ad;
		this.yas = yas;
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Musteri [ad=" + ad + ", yas=" + yas + "]";
	}
	
	@Override
	public int compareTo(Musteri m) {
		if(m.getYas() >= 65)
			return 1;
		
		return -1;
	}
	
}
