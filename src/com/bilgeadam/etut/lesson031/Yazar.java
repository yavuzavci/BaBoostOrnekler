package com.bilgeadam.etut.lesson031;

import java.util.ArrayList;
import java.util.List;

public class Yazar {
	private int id;
	private String isimSoyisim;
	private int yas;
	private List<Kitap> kitaplar;
	public Yazar(String isimSoyisim, int yas) {
		super();
		this.id = ++Utility.yazarId;
		this.isimSoyisim = isimSoyisim;
		this.yas = yas;
		this.kitaplar = new ArrayList<>();
	}
	public String getIsimSoyisim() {
		return isimSoyisim;
	}
	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public List<Kitap> getKitaplar() {
		return kitaplar;
	}
	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Yazar [id=" + id + ", isimSoyisim=" + isimSoyisim + ", yas=" + yas + "]";
	}	
}
