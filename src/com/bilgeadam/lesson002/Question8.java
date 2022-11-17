package com.bilgeadam.lesson002;

import java.util.Scanner;
/*
 * 
 * Dýþarýdan girilen bir sayýnýn faktöriyelini hesaplayalým
 */
public class Question8 {

	public static void main(String[] args) {
		int sonuc = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen faktöriyelini almak istediðiniz sayýyý girin: ");
		int faktoriyel = scanner.nextInt();
		scanner.close();
		
		for(int i = 1;i <= faktoriyel;i++) {
			sonuc *= i;
		}
		
		System.out.println(faktoriyel + " faktöriyel = " + sonuc);

	}

}
