package com.bilgeadam.etut.lesson031;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Kitaplik {
	private List<Kitap> kitaplar;
	private Map<Yazar, List<Kitap>> yazarIsmineGoreKitaplar;
	private Map<String, List<Kitap>> ismeGoreKitaplar;
//	private Set<Yazar> yazarlar;
	private Map<String, Yazar> ismeGoreYazarlar;
	
	public Kitaplik() {
        this.kitaplar = new ArrayList<>();
        this.yazarIsmineGoreKitaplar = new LinkedHashMap<>();
        this.ismeGoreKitaplar = new LinkedHashMap<>();
        this.ismeGoreYazarlar = new LinkedHashMap<>();
    }
	public List<Kitap> getKitaplar() {
		return kitaplar;
	}
	public void setKitaplar(List<Kitap> kitaplar) {
		this.kitaplar = kitaplar;
	}
	public Map<Yazar, List<Kitap>> getYazaraGoreKitaplar() {
		return yazarIsmineGoreKitaplar;
	}
	public void setYazarIsmineGoreKitaplar(Map<Yazar, List<Kitap>> yazarIsmineGoreKitaplar) {
		this.yazarIsmineGoreKitaplar = yazarIsmineGoreKitaplar;
	}
	public Map<String, List<Kitap>> getIsmeGoreKitaplar() {
		return ismeGoreKitaplar;
	}
	public void setIsmeGoreKitaplar(Map<String, List<Kitap>> ismeGoreKitaplar) {
		this.ismeGoreKitaplar = ismeGoreKitaplar;
	}
	public Map<String, Yazar> getIsmeGoreYazarlar() {
		return ismeGoreYazarlar;
	}
	public void setIsmeGoreYazarlar(Map<String, Yazar> ismeGoreYazarlar) {
		this.ismeGoreYazarlar = ismeGoreYazarlar;
	} 
}
