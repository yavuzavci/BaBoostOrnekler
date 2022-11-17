package com.bilgeadam.lesson003;
/*
 * 1 den başlayarak sayıları toplayalım
 * toplamımız 50 den büyük olana kadar programımız çalışsın;
 *  sonunda toplamı ve kaç kere çalıştığını yazalım
 */
public class Question11 {
	
	public static void main(String[] args) {
		int i = 0, sayac = 0, toplam = 0;
		
		while(toplam <= 50) {
			toplam += sayac;
			sayac = i;
			i++;
		}
		System.out.println("Toplam..:" + toplam);
		System.out.println("Döngü kaç kere çalıştı..:" + sayac);
		
	}
}
