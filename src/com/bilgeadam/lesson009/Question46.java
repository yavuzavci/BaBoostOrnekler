package com.bilgeadam.lesson009;

import java.util.Scanner;

public class Question46 {
/*
 * Dışarıdan kaç sayı alacağımızı alalım 2,3
 * 
 * eğer iki gelirse topla() içinde iki değerimizi alıp toplayalım
 * 
 * eğer 3 gelirse de bu metodu overload şeklinde yazalım aldığımız 3 değeri metoda geçelim
 * 
 * main dışarıdan kaç sayı alacağımızı belirtiyoruz o sayılara göre koşullarımızı belirtip 
 * koşullarda yukarıda yazdığımız 2 metoddan birini çağıracağız	
 * 
 */	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç sayı alalım..? ");
		int sayiAdedi = scanner.nextInt();
		
		switch(sayiAdedi) {
			case 2:
//				System.out.print("1. sayıyı girin..: ");
//				int sayi_1 = scanner.nextInt();
//				System.out.print("2. sayıyı girin..: ");
//				int sayi_2 = scanner.nextInt();
//				System.out.println("Toplam..: " + topla(sayi_1,sayi_2));
				System.out.println(topla());
				break;
			case 3:
				System.out.print("1. sayıyı girin..: ");
				int birinciSayi = scanner.nextInt();
				System.out.print("2. sayıyı girin..: ");
				int ikinciSayi = scanner.nextInt();
				System.out.print("3. sayıyı girin..: ");
				int ucuncuSayi = scanner.nextInt();
				System.out.println(topla(birinciSayi,ikinciSayi,ucuncuSayi));
				
				break;
			default: break;
		}
		scanner.close();
	}
	
	//hoca çözümü
	public static int topla() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayıyı girin..: ");
		int sayi1 = scanner.nextInt();
		System.out.print("2. sayıyı girin..: ");
		int sayi2 = scanner.nextInt();
		return sayi1 + sayi2;
	}
	
	// kendi cozumlerim
	public static int topla(int s1, int s2) {
		return s1 + s2;
	}
	public static int topla(int s1, int s2, int s3) {
		return s1 + s2 + s3;
	}
	
}
