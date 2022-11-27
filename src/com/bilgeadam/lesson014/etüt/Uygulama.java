package com.bilgeadam.lesson014.etüt;

import java.util.Scanner;

public class Uygulama {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		uygulamayiBaslat();
	}
	
	public static void kitapEkle(Kutuphane kutuphane) {
		Kitap kitap = new Kitap();
		Yazar yazar = new Yazar();
		System.out.println("Lütfen kitap ismi giriniz");
		kitap.isim = scanner.nextLine();
		System.out.println("Lütfen Yazar ismi giriniz");
		String yazarIsim = scanner.nextLine();
		kitap.yazar = kutuphane.yazarKontrol(yazarIsim);
		System.out.println("Lütfen sayfa sayısını giriniz");
		kitap.sayfaSayisi = scanner.nextInt();
		kutuphane.kitapListesi[Kutuphane.index] = kitap;
		kutuphane.index++;
	}
	
	public static void menu() {
		System.out.println("1-Kitap Ekle");
		System.out.println("2-Kitap Sil");
		System.out.println("3-Kitap ismine göre ara");
		System.out.println("4-Yazar ismine göre ara");
		System.out.println("5-Kitapları listele");
		System.out.println("6-Yazarları listele");
		System.out.println("0-Çıkış");
	}
	
	public static int secimYap() {
		System.out.println("Lütfen işlem seçiniz");
		return scanner.nextInt();
	}
	
	public static void uygulamayiBaslat() {
		Kutuphane kutuphane = new Kutuphane();
		kutuphane.boyut = 5;
		kutuphane.kitapListesi = new Kitap[kutuphane.boyut];
		
		int kontrol = 0;
		
		do {
			menu();
			kontrol = secimYap();
			scanner.nextLine();
			
			switch (kontrol) {
			case 1:
				kitapEkle(kutuphane);
				break;			
			case 5:
				kitaplariListele(kutuphane.kitapListesi);
				break;
			case 6:
				yazarlariListele(kutuphane.yazarListesi);
				break;
			case 0:
				System.out.println("Çıkış yapılıyor.....");
				break;
			default:
				break;
			}
			
		} while (kontrol != 0);
	}

	public static void kitaplariListele(Kitap[] kitapListesi) {
		for (int i = 0; i < kitapListesi.length; i++) {
			if(kitapListesi[i] != null)
				System.out.println(kitapListesi[i].isim + "-" +kitapListesi[i].yazar.isim);
		}
	}
	
	public static void yazarlariListele(Yazar[] yazarListesi) {
		for (int i = 0; i < yazarListesi.length; i++) {
			if(yazarListesi[i] != null)
				System.out.println(yazarListesi[i].isim);
		}
	}
	
}
