package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 * Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz
 * 0 girildiğinde sayıların toplamını
 * 
 * @author Yavuz
 *
 */
public class Question15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0, i = 1;		
		int sayi;
		double ortalama = 0,j = 1;
		
		do {
			System.out.println("Lütfen sayı girin..: ");
			sayi = scanner.nextInt();
			toplam += sayi;
			ortalama = toplam / j;
			i++;
			j = i - 1;			
		} while (sayi != 0);		
		
		scanner.close();
		
		System.out.println("toplam....: " + toplam);		
		System.out.println("ortalama..: " + ortalama);		
		
	}

}
