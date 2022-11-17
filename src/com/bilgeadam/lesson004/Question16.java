package com.bilgeadam.lesson004;

public class Question16 {
/*
 * 1 den 100 e kadar olan çift sayıların toplamının
 * tek sayıların toplamına oranı
 * 
 */
	public static void main(String[] args) {
		double oran = 0, toplamCift = 0,toplamTek = 0;
		for(double i = 0;i <100;i++) {
			if (i % 2 == 0) toplamCift += i;
			else toplamTek += i;
		}
		
		oran = toplamCift / toplamTek;
		
		System.out.println("1 den 100 e kadar çift sayıların toplamı: " + toplamCift);
		System.out.println("1 den 100 e kadar tek sayıların toplamı: " + toplamTek);
		System.out.println("Çift sayılar toplamının tek sayılar toplamına oranı: " + oran);

		toplamCift = 0;
		toplamTek = 0;
		oran = 0;
		System.out.println();
		//if else yok
		for(double i = 1;i <100;i++) {
			toplamCift += i - 1;
			toplamTek += i;
		}		
		oran = toplamCift / toplamTek;
		
		System.out.println("Çift sayılar toplamının tek sayılar toplamına oranı: " + oran);
	}// Main sonu

}// Class sonu
