package com.bilgeadam.lesson041;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ogretmen sınıfını thread yapalım
 * 
 * run metodu yazalım
 * run metodunda 10 kere dönsün çıktı olarakta 
 * 
 * ogretmenismi --> 1. öğrencinin notlarını okudu
 * ogretmenismi --> 2. öğrencinin notlarını okudu
 * 
 * OgretmenTest oluşturalım
 * burda test edeceğiz 2 tane ogretmen oluşturalım
 * 
 * ogretmenler aynı dosya üzerinde okuma yapıp okudukları verileri
 * kendi sınıfları içerisinde tuttukları öğrenci listesine ekleyecekler
 * bunu bir thread yapısı üzerinden kuracağız
 * 
 * OgretmenTest sınıfında 2 tane ogretmen olacak bu threadleri çalıştıracağız
 * en sonunda kaç tane öğrencinin notunu okumuşlar onu göstereceğiz.
 */
public class Ogretmen extends Thread {

	private String isim;
	private List<Ogrenci> ogrenciListesi;
	private BufferedReader bufferedReader;
	
	public Ogretmen(String isim, BufferedReader bufferedReader) {
		this.isim = isim;
		this.bufferedReader = bufferedReader;
		ogrenciListesi = new ArrayList<>();
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public List<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}
	
	public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}
	
	@Override
	public void run() {
		try {
			String line;
			while((line = bufferedReader.readLine()) != null) {
				String[] array = line.split(",");
				double ort = Manager.notOrtalamasiniBul(Arrays.asList(array));
				Ogrenci ogrenci = new Ogrenci(array[0],ort);
				ogrenciListesi.add(ogrenci);
				System.out.println(isim + " ====> " + ogrenci.getIsim() + " adlı öğrenciyi ekledi");
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	
}
