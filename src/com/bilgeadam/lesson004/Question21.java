package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * Dışarıdan 1 ile 7 arası bir sayı alalım.
 * bu sayıya karşılık gelen günün ismini yazdıralım 
 */
public class Question21 {

	public static void main(String[] args) {
		System.out.print("Lütfen bir sayı giriniz..: ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		scanner.close();

		switch (sayi) {
		case 1: {
			System.out.println("Pazartesi");
			break;
		}
		case 2: {
			System.out.println("Salı");
			break;
		}
		case 3: {
			System.out.println("Çarşamba");
			break;
		}
		case 4: {
			System.out.println("Perşembe");
			break;
		}
		case 5: {
			System.out.println("Cuma");
			break;
		}
		case 6: {
			System.out.println("Cumartesi");
			break;
		}
		case 7: {
			System.out.println("Pazar");
			break;
		}
		default:
			System.out.println("Yanlış sayı girdiniz.");
			break;
		}

		switch (sayi) {
		case 1, 2, 3, 4, 5:
			System.out.println("Hafta içi");
			break;
		case 6,7:
			System.out.println("Hafta sonu");
		break;
		default:
			System.out.println("Yanlış sayı girdiniz.");
		break;
		}

	}

}
