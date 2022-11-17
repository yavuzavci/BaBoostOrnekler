package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 * 
 * Kullanıcıdan alınan bir sayının çarpım tablosunu yazalım
 * 
 * 1x1=1
 * 1x2=2
 *
 */

public class Question9 {

	public static void main(String[] args) {
		System.out.print("Çarpım tablosunı almak istediğiniz sayıyı girin: ");
		Scanner scanner = new Scanner(System.in);
		int maxDeger = scanner.nextInt();
		scanner.close();
		
		for(int i = 1;i <= 10;i++) {
			System.out.println(maxDeger + "x" + i + " = " + i * maxDeger);
			
		}
	}

}
