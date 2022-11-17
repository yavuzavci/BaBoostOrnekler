package com.bilgeadam.lesson008;

public class Question36 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		// dizi deki tüm sayıların toplamı ve
		// bu sayı çifttir ve bu sayı tektir şeklinde çıktı alalım.
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] % 2 == 0)
				System.out.println(sayilar[i] + " sayısı çifttir.");
			else
				System.out.println(sayilar[i] + " sayısı tektir.");
			
			toplam += sayilar[i];
		}
		System.out.println("Dizideki sayıların toplamı..: " + toplam);
	}
	
}
