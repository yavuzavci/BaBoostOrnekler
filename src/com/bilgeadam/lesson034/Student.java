package com.bilgeadam.lesson034;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	private int id;
	private String isim;
	private String bolum;
	private String durum;
	private List<Double> notlar = new ArrayList<>();
	
	public Student(String isim, String bolum) {
		this.isim = isim;
		this.bolum = bolum;
		this.notlar = new ArrayList<>();
	}
	
	public Student(int id,String isim, String bolum) {
		this(isim,bolum);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public List<Double> getNotlar() {
		return notlar;
	}

	public void setNotlar(List<Double> notlar) {
		this.notlar = notlar;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", isim=" + isim + ", bolum=" + bolum + ", durum=" + durum + ", notlar=" + notlar
				+ "]";
	}
	
	public Double notOrtHesapla() {
		return notlar.stream().collect(Collectors.averagingDouble(n -> n));
	}
	
	
}
