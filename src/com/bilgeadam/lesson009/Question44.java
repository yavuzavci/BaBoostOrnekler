package com.bilgeadam.lesson009;

import java.util.Scanner;

public class Question44 {
	/*
	 * bir metot olsun
	 * metodun içine 2 tane sayı alalım
	 * bu sayıları çarpıp çarpım değerini döndürelim
	 * 
	 * main metotta birde bir sayı değeri = 15 olsun
	 * 
	 * bir de sonuc değerimiz olsun = 0;
	 * sonuca = metottan dönen değer / sayı
	 * 
	 * sonrada sonucu yazdıralım
	 * 
	 */
	
	// istenen çözüm bu değil, kodu modifiye ediyorum.
	
	public static void main(String[] args) {
		int sonuc = 0, sayi = 15;		
//		sonuc = carpim2() / sayi;
//		System.out.println("Sonuç...: " + sonuc);
		
//		int dizi[] = sayilariAl();
//		int sonuc2 = carpim3(dizi);
//		System.out.println(sonuc2);
		
		System.out.println(carpim3(sayilariAl()));
		
	}
	// eski hal, benim kodum
	public static int carpim(int s1,int s2) {
		return s1 * s2;
	}
	// yeni hal.
	public static int carpim2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayıyı girin..: ");
		int sayi1 = scanner.nextInt();
		System.out.print("2. sayıyı girin..: ");
		int sayi2 = scanner.nextInt();
		scanner.close();
		return sayi1 * sayi2;
	}
	
	public static int carpim3(int[] dizi) {
		int carpim = dizi[0] * dizi[1];
		return carpim;
	}
	
	public static int[] sayilariAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayıyı girin..: ");
		int deger1 = scanner.nextInt();
		System.out.print("2. sayıyı girin..: ");
		int deger2 = scanner.nextInt();
		scanner.close();
		int[] dizi = new int[2];
		dizi[0] = deger1;
		dizi[1] = deger2;
		return dizi;
	}
	
}
