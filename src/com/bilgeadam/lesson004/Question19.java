package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * Dışarıdan girilen bir sayının asal sayı olup olmadığını kontrol eden kod
 */
public class Question19 {

	public static void main(String[] args) {
		System.out.print("Lütfen bir sayı giriniz..: ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		scanner.close();
		
		if (sayi < 2) System.err.println("Hatalı giriş yaptınız.");		
		
		else {
			int maxBolenSayisi = 0;	
			
			for (int i = 1;i <= sayi;i++) {
				if(sayi % i == 0)
					maxBolenSayisi++;
			}
			
			if(maxBolenSayisi == 2) System.out.println("Sayınız asal sayıdır.");
			else System.out.println("Sayınız asal sayı değildir.");
		}
		
		/*
		 * Hoca çözümü
		 * 
		 * Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		scanner.close();
		boolean asalSayimidir = true;
		
		if (sayi < 2) asalSayimidir = false;		
		
		else {
			for (int i = 2;i < sayi;i++) {
				if(sayi % i == 0){
					asalSayimidir = false;
					break;
				}
			}
			
			if(asalSayimidir) System.out.println("Sayınız asal sayıdır.");
			else System.out.println("Sayınız asal sayı değildir.");
		}
		 * 
		 */

	}

}
