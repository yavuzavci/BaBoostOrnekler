package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * D��ar�dan 2 tane say�sal de�er alal�m iki say�n�n toplam�
 * �ift ise true yazd�ral�m de�ilse false yazd�ral�m
 * en sonuna toplam�n yar�s�n� da ekrana yazd�ral�m
 */
public class Question7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen ilk say�y� girin:");
		float sayi1 = scanner.nextFloat();
		System.out.println("L�tfen ikinci say�y� girin:");
		float sayi2 = scanner.nextFloat();
		scanner.close();
		
		boolean sonuc = (sayi1 + sayi2) % 2 == 0;
		System.out.println("Say�lar�n toplam� �ift mi: " + sonuc);
		System.out.println("Say�lar�n toplam�n�n yar�s�: " + (sayi1 + sayi2) / 2);
	}

}
