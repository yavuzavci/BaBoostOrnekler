package com.bilgeadam.lesson025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
 * 1 tane tek sayılar 1 tane çift sayılar için bir liste oluşturalım
 * 
 * sonra 35 tane random sayıyı çift ise çiftlere tek ise teklere atayalım
 * 
 * en sonunda tekler ve çiftler listesini yazdıralım
 */
public class ArrayListOrnek2 {
	
	public static void main(String[] args) {
		List<Integer> tekSayilar = new ArrayList<Integer>();
		List<Integer> ciftSayilar = new ArrayList<Integer>();
		
		sayilariAl(tekSayilar, ciftSayilar);
		tekSayilariYazdir(tekSayilar);
		ciftSayilariYazdir(ciftSayilar);
	}
	
	private static void sayilariAl(List<Integer> tekSayilar, List<Integer> ciftSayilar) {
		for (int i = 0; i < 35; i++) {
			Integer sayi = new Random().nextInt(0,500);
			if(sayi % 2 == 0) ciftSayilar.add(sayi);
			else tekSayilar.add(sayi);
		}
	}
	
	private static void tekSayilariYazdir(List<Integer> list) {
		System.out.println("Tek Sayılar");
		for (Integer sayi : list) {
			System.out.println(sayi);
		}
		
	}
	private static void ciftSayilariYazdir(List<Integer> list) {
		System.out.println("Çift Sayılar");
		for (Integer sayi : list) {
			System.out.println(sayi);
		}
	}
	
}
