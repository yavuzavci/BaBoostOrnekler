package com.bilgeadam.lesson003;
/**
 * Girilen sayının basamaklarının toplamını ekrana yazdıralım
 * 
 * @author Yavuz
 */
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		System.out.print("Lütfen bir sayı girin..: ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		scanner.close();
		
		int asilSayi = sayi;
		int toplam = 0;
		int basamakSayisi = 0;
		do {
			toplam += sayi % 10;
			sayi /= 10;
			basamakSayisi++;
		}while(sayi != 0);		
		
		System.out.println(asilSayi + " sayısının basamakları toplamı..: " + toplam);
		System.out.println(asilSayi + " sayısı "  + basamakSayisi + " basamaklı");
		
	}

}
