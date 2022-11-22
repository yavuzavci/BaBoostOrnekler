package com.bilgeadam.lesson013;

import java.util.Scanner;

/*
 * 
 * bir isimleri bir de numaraları
 * 
 * öğrenci numaraları 1 den başlasın yeni öğrenci kaydı
 * oldukça numaralar artsın.
 * 
 */
public class Student {
	
	static int ogrenciNo = 1;
	String ad;
	
	public void ogrenciKaydet() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaydetmek istediğiniz öğrencinin adını girin..: ");
		ad = scanner.nextLine();		
		System.out.println("Öğrenci kaydedildi. No: " + ogrenciNo + " Ad: " + ad);
		ogrenciNo++;
	}
	
}
