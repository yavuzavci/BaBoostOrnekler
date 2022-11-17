package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dýþarýdan 2 tane sayýsal deðer alalým iki sayýnýn toplamý
 * çift ise true yazdýralým deðilse false yazdýralým
 * en sonuna toplamýn yarýsýný da ekrana yazdýralým
 */
public class Question7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ilk sayýyý girin:");
		float sayi1 = scanner.nextFloat();
		System.out.println("Lütfen ikinci sayýyý girin:");
		float sayi2 = scanner.nextFloat();
		scanner.close();
		
		boolean sonuc = (sayi1 + sayi2) % 2 == 0;
		System.out.println("Sayýlarýn toplamý çift mi: " + sonuc);
		System.out.println("Sayýlarýn toplamýnýn yarýsý: " + (sayi1 + sayi2) / 2);
	}

}
