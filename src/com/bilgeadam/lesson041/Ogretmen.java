package com.bilgeadam.lesson041;
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

	String isim;
	
	public Ogretmen(String isim) {
		this.isim = isim;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + " -----> " + (i + 1) + ". öğrencinin notlarını okudu");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
