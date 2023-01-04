package com.bilgeadam.lesson037;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Bir alışveriş tarihimiz olsun
 * 
 * daha sonra bir de her ayın 15 i bizim fatura kesim tarihimiz
 * 
 * 1- alışveriş tarihi fatura tarihinden önce mi kontrol edelim
 * önce ise fatura tarihinden önce yazdıralım
 * sonra ise sonra yazdıralım
 * 
 * 2- Yeni fatura tarihi ve kalan gün sayısını yazdıralım.
 */
public class SiparisGunu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen rakam olarak yıl-gün-ay şeklinde alışveriş tarihini giriniz.");
		String tarih = scanner.nextLine();
		scanner.close();
		
		LocalDate alisverisTarihi = LocalDate.parse(tarih);
		LocalDate sonrakiFaturaGunu = LocalDate.of(
				alisverisTarihi.getYear(), 
				alisverisTarihi.getMonthValue(), 
				15);
		
		if(alisverisTarihi.getDayOfMonth() < 15) {
			System.out.println("Fatura tarihinden önce.");
		}
		else {
			sonrakiFaturaGunu = sonrakiFaturaGunu.plusMonths(1);
			long kacGunKaldi = ChronoUnit.DAYS.between(alisverisTarihi, sonrakiFaturaGunu);
			System.out.println("Bir sonraki fatura tarihi..: " + sonrakiFaturaGunu);
			System.out.println("Bir sonraki faturaya " + Math.abs(kacGunKaldi) + " gün kaldı.");
		}
		
	}
}
