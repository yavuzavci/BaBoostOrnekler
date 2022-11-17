package com.bilgeadam.lesson005;

import java.util.Scanner;

// Klavyeden 0 ile 100 arasında girilen 100 dahil
// 5 adet sayıdan en büyük ve en küçük olanı bulup ekrana yazan kod
// parçacığı
public class Question24 {

	public static void main(String[] args) {
		int kacSayiGirildi = 0, max = Integer.MIN_VALUE,min = Integer.MAX_VALUE, sayi;
		Scanner scanner = new Scanner(System.in);		
		do {
			System.out.print("Lütfen bir sayı girin..: ");
			sayi = scanner.nextInt();
			
			if(sayi< 0 || sayi > 100) {
				System.out.println("Girdiğiniz sayı 0 ile 100 arasında değil");
			}
			
			else {				
				kacSayiGirildi++;
				if(kacSayiGirildi == 1) {
					max = sayi;
					min = sayi;
				}
				
				else {
					if(sayi > max) {
						max = sayi;
					}
					else if(sayi < min) {
						min = sayi;
					}
				}
				System.out.println(kacSayiGirildi + ". sayınız..: " + sayi);
			}			
		} while(kacSayiGirildi != 5);
		
		
		/**
		 * ALTERNATİF ÇÖZÜM
		 * 
		 */
		
		scanner.close();	
		System.out.println("En küçük sayı: " + min);
		System.out.println("En büyük sayı: " + max);

	}

}
