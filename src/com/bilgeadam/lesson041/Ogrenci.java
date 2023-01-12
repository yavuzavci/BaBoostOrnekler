package com.bilgeadam.lesson041;

import java.io.Serializable;

/*
 * name
 * ortalama
 */
public class Ogrenci implements Serializable {
	
	private static final long serialVersionUID = -6111727610290715090L;
	private String isim;
	private double ortalama;	
	
	public Ogrenci(String isim) {
		this.isim = isim;
		ortalama = 0;
	}

	public Ogrenci(String isim, double ortalama) {
		this.isim = isim;
		this.ortalama = ortalama;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getOrtalama() {
		return ortalama;
	}

	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ortalama=" + ortalama + "]";
	}
	
}
