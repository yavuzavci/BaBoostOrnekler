package com.bilgeadam.lesson030;

public class Ogrenci implements Comparable<Ogrenci> {
	
	int id;
	String ad;
	
	public Ogrenci(int id) {
		this.id = id;
	}
	public Ogrenci(int id, String ad) {
		this.id = id;
		this.ad = ad;
	}

	@Override
	public int compareTo(Ogrenci o) {
		if(o.id < this.id)
			return 1;
		else if(o.id == this.id)
			return 0;
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + "]";
	}
	
}
