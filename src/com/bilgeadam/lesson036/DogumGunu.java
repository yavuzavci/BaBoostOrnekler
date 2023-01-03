package com.bilgeadam.lesson036;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Dışarıdan string olarak doğum gününüzü alınız
 * 
 * Daha sonra doğduğunuz günden bugüne 
 * 
 * kaç yıl kaç gün kaç hafta kaç ay yaşamışsınız onu hesaplayıp yazdırın
 * 
 * bir sonraki doğum gününe kaç gün kaldığını hesaplayalım.
 */
public class DogumGunu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen rakam olarak yıl-gün-ay şeklinde doğum gününüzü giriniz.");
		String dogumTarihi = scanner.nextLine();
		scanner.close();
		gunHesabiYap(dogumTarihi);
	}
	
	public static void gunHesabiYap(String dogumTarihi) {
		LocalDate bugun = LocalDate.now();
		LocalDate dg = LocalDate.parse(dogumTarihi);
		long gun = dg.until(bugun, ChronoUnit.DAYS);
	    long hafta = dg.until(bugun, ChronoUnit.WEEKS);
	    long ay = dg.until(bugun, ChronoUnit.MONTHS);
	    long yil = dg.until(bugun, ChronoUnit.YEARS);
		System.out
			.println("Bugüne kadar " + yil + " yıl " + ay + " ay " + hafta + " hafta " + gun + " gün yaşanmıştır.");
		
		int sonrakiDogumGunu2 = (dg.getDayOfYear() - bugun.getDayOfYear() + 365) % 365;
		
		System.out.println("Bir sonraki doğum gününüze " + sonrakiDogumGunu2 + " gün kaldı");
	}
}
