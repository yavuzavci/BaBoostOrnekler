package com.bilgeadam.lesson012;

import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen tek bir sayı giriniz");
		int sayi = scanner.nextInt();
		System.out.println("Lütfen Sutun sayısını giriniz");
		int sutun = scanner.nextInt();
		System.out.println("Lütfen Satır sayısını giriniz");
		int satir = scanner.nextInt();
		
		printArray(sayi, sutun, satir);
	}
	
	public static void printArray(int sayi, int sutun, int satir) {
		int min = 1;
		int orta = (sayi + 1) / 2;
		int[][] dizi = new int[satir][sutun];
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if(i == j) {
					dizi[i][j] = orta;
				}
				else if (i > j) {
					dizi[i][j] = min;
				}
				else {
					dizi[i][j] = sayi;
				}
				System.out.print(dizi[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
