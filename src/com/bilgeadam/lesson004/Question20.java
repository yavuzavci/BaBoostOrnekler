package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 * 
 * Girilen sayının 5 in kuvveti olup olmadığını bulan kod
 * 
 * @author Yavuz
 *
 */
public class Question20 {

	public static void main(String[] args) {
		System.out.print("Lütfen bir sayı giriniz..: ");
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		scanner.close();
		
		boolean sayiBesinKuvveti = true;
		
		if(sayi < 1)
			sayiBesinKuvveti = false;		
		
		else {
			while(sayi > 1) {
				if(sayi % 5 != 0) {
					sayiBesinKuvveti = false;
					break;
				}
				else {
					sayi /= 5;
				}
			}
			
			 if(sayi == 1)
					sayiBesinKuvveti = true;			
		}
		
		if(sayiBesinKuvveti) 
			System.out.println("Sayı 5 in kuvvetidir.");
		else 
			System.out.println("Sayı 5 in kuvveti değildir.");
		
		// alternatif algoritma
		
		/*
		if(sayi == 1){
		 	kontrol = false;
			System.out.println("Sayı 5 in kuvvetidir.");
		}
		
		else if(sayi < 1){
			kontrol = false;
			System.out.println("Sayı 5 in kuvveti değildir."); 
		}
		
		while(kontrol) {
			if(sayi % 5 == 0) {
				sayi /= 5;
				if(sayi == 1) {
					System.out.println("Sayı 5 in kuvvetidir.");
					kontrol = false;
				}
			}
			
			else {
				System.out.println("Sayı 5 in kuvveti değildir.");
				kontrol = false;
			}
		}
		*/

	}

}
