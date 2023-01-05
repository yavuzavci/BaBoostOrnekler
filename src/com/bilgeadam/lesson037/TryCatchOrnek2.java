package com.bilgeadam.lesson037;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 
 * Bir metod ile dışarıdan bir index değeri alalım
 * sonra o indexteki değeri yazalım
 * hata varsa try catch ile yakalayalım.
 * 
 * 2- Array üzerinde gezelim sayısal değerleri integer a çevirip
 * bir toplama işlemi yapacağız yani bir toplama metodu yazacağız
 * en sonunda toplamı ve hata sayısını yazdıralım.
 * 
 */
public class TryCatchOrnek2 {
/*
 * throw // istisna fırlatmak için kullanıyoruz // kendi koşullarımızla uygulamayı özelleştirmek için
 * checked-- // bir istisna fırlatmasını zorunlu hale getiriyoruz
 * unchecked--	// bir zorunluluk yok
 * extends RunTimeException
 * 
 * 1- throw fırlatalım -> topla2 metodu yazalım sonra bir tane null kontrol eden ve 
 * NullPointerException fırlatan bir metot yazalım sonra bu kontrol metodunu toplam2
 * nin içinde kullanalım.
 */
	public static void main(String[] args) {
		String[] array = { "a", "10", "bc", null, "20" };
		try {
			//dizindekiDeger(array);
			//topla(array);
			//System.out.println("Tarih -> " + Utility.tarihAl());
			//System.out.println("Sayı -> " + Utility.intDegerAlma());
			topla2(array);
			topla2(null);
		}
		catch(InputMismatchException ime) {
			System.out.println("Hata: Sayı girmediniz");
		}
		catch(IndexOutOfBoundsException ioobe) {
			System.out.println("Hata: Dizi dışında bir yere erişim denediniz.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dizindekiDeger(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir değer giriniz");
		int index = scanner.nextInt();
		try {
			System.out.println("Indexteki değer : " + dizi[index]);
		}
		catch(InputMismatchException ime) {
			System.out.println("Hata: Sayı girmediniz");
		}
		catch(IndexOutOfBoundsException ioobe) {
			System.out.println("Hata: Dizi dışında bir yere erişim denediniz.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static void topla(String[] dizi) {
		int toplam = 0;
		int hataSayisi = 0;
		for(String eleman : dizi) {
			try {
				toplam += Integer.parseInt(eleman);
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				hataSayisi++;
			}
		}
		System.out.println("Toplama işlemi sonucu..: " + toplam);
		System.out.println("Hata sayısı..: " + hataSayisi);
	}
	
	public static void topla2(String[] dizi) {
		int toplam = 0;
		int hataSayisi = 0;
		try {
			String[] elemanlar = nullCheck(dizi);
			for(String eleman : dizi) {
				try {
					toplam += Integer.parseInt(eleman);
				} catch (NumberFormatException e) {
					System.out.println(e.toString());
					hataSayisi++;
				}
			}
			System.out.println("Toplama işlemi sonucu..: " + toplam);
			System.out.println("Hata sayısı..: " + hataSayisi);
		} catch (NullPointerException e) {
			System.out.println("Hata -> " + e.getMessage());
		}
	}
	
	public static void toplam3(String[] array) {
		int toplam = 0;
		int sayac = 0;
		String deger2 = "bos";
		for (String string : array) {
			try {
				deger2 = "bos";
				deger2 = nullCheck2(string);
				int deger = Integer.parseInt(deger2);
				toplam += deger;
			} catch (Exception e) {
				System.out.println(e.toString());
				sayac++;
			} finally {
				System.out.println("finally:" + deger2);
			}
		}
		System.out.println("toplam= " + toplam);
		System.out.println("hata sayısı= " + sayac);
	}
	
	public static String[] nullCheck(String[] dizi) {
		if(dizi == null)
			throw new NullPointerException("Dizi boş.");
		else {
			for(String eleman : dizi) {
				if(eleman == null)
					throw new NullPointerException("Dizide null eleman var.");
			}
			
			return dizi;
		}
	}
	
	public static String nullCheck2(String metin) throws Exception {
		if(metin == null)
			throw new Exception("Değer boş.");
		
		return metin;
	}
	
	public static String nullCheck3(String metin) {
		if(metin == null)
			throw new NullPointerException("Değer boş.");
		
		return metin;
	}
	
}
