package com.bilgeadam.lesson002;

import java.util.Scanner;
/*
 * 
 * D��ar�dan girilen bir say�n�n fakt�riyelini hesaplayal�m
 */
public class Question8 {

	public static void main(String[] args) {
		int sonuc = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("L�tfen fakt�riyelini almak istedi�iniz say�y� girin: ");
		int faktoriyel = scanner.nextInt();
		scanner.close();
		
		for(int i = 1;i <= faktoriyel;i++) {
			sonuc *= i;
		}
		
		System.out.println(faktoriyel + " fakt�riyel = " + sonuc);

	}

}
