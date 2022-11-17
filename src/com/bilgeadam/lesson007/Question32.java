package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question32 {
	
	/*
	 * Dışarıdan girilen bir ülkenin dizimizde olup olmadığını bulan algoritma
	 */

	public static void main(String[] args) {		
		String[] dizi = { "Türkiye", "Japonya", "Moğolistan", "Fransa", "Danimarka"};
		// çözüme göre kodu düzelttim. @yavuz
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen aramak istediğiniz ülkeyi girin..: ");
		String ulke = scanner.nextLine();
		scanner.close();
		String kontrol2 = "Girdiğiniz ülke bulunamadı.";
		for(int i = 0;i < dizi.length;i++) {
			if(dizi[i].equals(ulke)) {
				kontrol2 = "Girdiğiniz ülke bulundu.";
				break;
			}
		}
		
		System.out.println(kontrol2);
	}

}
