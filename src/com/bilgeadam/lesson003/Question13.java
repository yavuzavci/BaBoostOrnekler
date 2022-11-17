package com.bilgeadam.lesson003;

import java.util.Scanner;

/**
 * Dışarıdan bir taban bir üs değeri alacağız
 * (2 üzeri 5 gibi) bu işlemin sonucunu bulan algoritma yazacağız.
 * @author Yavuz
 *
 */
public class Question13 {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen taban girin: ");
		int taban = scanner.nextInt();
		System.out.print("Lütfen üs girin: ");
		int us = scanner.nextInt();
		scanner.close();
		int i = 1, sonuc = 1;
		//boolean kontrol = taban == 0 && us == 0;		
		
		while (i <= us) {
			sonuc *= taban;
			i++;
		}
		
		System.out.println("Sonuç..: " + sonuc);

	}

}
