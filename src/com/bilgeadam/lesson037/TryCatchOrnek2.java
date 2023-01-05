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
	
	public static void main(String[] args) {
		String[] array = { "a", "10", "bc", null, "20" };
		try {
			//dizindekiDeger(array);
			//topla(array);
			//System.out.println("Tarih -> " + Utility.tarihAl());
			System.out.println("Sayı -> " + Utility.intDegerAlma());
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
	
}
