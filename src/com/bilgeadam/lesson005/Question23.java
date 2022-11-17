package com.bilgeadam.lesson005;

import java.util.Scanner;

// Mükemmel sayı = kendisi hariç pozitif tam sayı bölenlerinin toplamına eşit
// olan sayı
// 6 = 1 + 2 + 3
public class Question23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı girin..: ");
		int sayi = scanner.nextInt();	
		scanner.close();
		
		if(sayi < 0) sayi = Math.abs(sayi);
		
		int toplam = 0;
		
		for(int i = 1; i <= sayi / 2;i++) {
			if(sayi % i == 0)
				toplam+=i;
		}
		
		if(toplam == sayi){
			System.out.print("Sayınız mükemmel sayıdır. ");
		}
		else {
			System.out.print("Sayınız mükemmel sayı değildir.");
		}
		

	}

}
