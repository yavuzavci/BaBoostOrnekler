package com.bilgeadam.lesson022.oys;
/*
 * memur
 * 1- öğrenci kaydı yap
 * 2- öğrenci kaydı sil
 * 3- bilgilendirme yap
 * 4- ders kaydı onayla
 * 5- öğretmenler listesi
 * 6- öğrenciler listesi
 * 
 * öğrenci
 * 1- ders kaydı
 * 2- not ort görüntüle
 * 3- aldığım dersleri listele
 * 
 * öğretmen
 * 1- girdiğim dersleri listele
 * 2- nöbetçilik durumunu sorgula
 */
public class Manager {
	
	Okul okul;
	
	public Manager() {
		
	}
	
	public void menu(Kisi kisi) {				
		System.out.println();			
	}
	
	public void memurMenusu() {
		System.out.println("1- Öğrenci kaydı yap");
		System.out.println("2- Öğrenci kaydı sil");
		System.out.println("3- Bilgilendirme yap");
		System.out.println("4- Ders kaydı onayla");
		System.out.println("5- Öğretmenler listesi");
		System.out.println("6- Öğretciler listesi");
	}
	public void ogrenciMenusu() {
		System.out.println("1- Ders Kaydı Yap");
		System.out.println("2- Not ortalaması görüntüle");
		System.out.println("3- Aldığım dersleri listele");
	}
	public void ogretmenMenusu() {
		System.out.println("1- Girdiğim dersleri listele");
		System.out.println("2- Nöbetçilik durumu sorgula");
	}
	
	public void menu2(Kisi kisi) {
		kisi.menu();
	}

}
