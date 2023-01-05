package com.bilgeadam.lesson037;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

/*
 * String olarak aldığımız tarihi
 * localdate olarak bize dönen bir
 * metod yazalım
 * 
 * doğru değer girene kadar tarih değeri alalım
 */

public class Utility {

	static Scanner scanner = new Scanner(System.in);

	public static String stringDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}

	public static int intDegerAlma() {		
		boolean kontrol = false;
		Integer sayi = Integer.MIN_VALUE;
		do {
			try {
				sayi = Integer.parseInt(
						stringDegerAlma("Lütfen bir tam sayı giriniz"));
				kontrol = false;
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				System.out.println("Tam sayı girmediniz veya "
						+ Integer.MIN_VALUE + " ile " + Integer.MAX_VALUE
						+ " sınırlarını aşan tam sayı değeri girdiniz.\n"
						+ "Lütfen küsüratsız tam sayı giriniz.");
				kontrol = true;
			}
		} while (kontrol);
		
		return sayi;
	}

	public static int randomSayiUret(int baslangic, int bitis) {
		Random random = new Random();
		return random.nextInt(baslangic, bitis);
	}
	
	public static LocalDate tarihAl() {
		boolean kontrol = false;
		LocalDate date = null;
		do {
			try {
				date = LocalDate.parse(
						stringDegerAlma("Lütfen bir tarih değeri giriniz (yıl-ay-gün)"));
				kontrol = false;
			} catch (DateTimeParseException e) {
				System.out.println(e.toString());
				System.out.println("Girdiğiniz tarih değeri hatalıdır. Lütfen örnekteki gibi giriniz (2023-01-20)");
				kontrol = true;
			}
		} while (kontrol);
		
		return date;
	}

}
