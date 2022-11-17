package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 * birden girdiğimiz sayıya kadar olan sayıların bir fazlasının toplamını yazdıralım
 * @author Yavuz
 *
 */
public class Question10 {

	public static void main(String[] args) {
		System.out.print("Lütfen bir sayı girin: ");
		Scanner scanner = new Scanner(System.in);
		int maxDeger = scanner.nextInt();
		scanner.close();
		
		int toplam = 0;
		//for döngüsü ile çözüm
		for (int i = 1;i < maxDeger;i++) {
			toplam += i + 1; 
		}
		
		System.out.println("Toplam..: " + toplam);
		
		toplam = 0;
		
		//while döngüsü ile çözüm
		int sayac = 1;
		while(sayac < maxDeger) {
			sayac++;
			toplam += sayac;
		}		
		
		System.out.println("Toplam..: " + toplam);
	}

}
