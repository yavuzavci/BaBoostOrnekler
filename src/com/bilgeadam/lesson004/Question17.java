package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 * telefon kod
 * mail kod
 * başlangıç değerini biz atayacağız (int)
 * 
 * daha sonra dışarıdan bir tane telefon kodu alacağız
 * bir tane de mail için kod alacağız
 * 
 * eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim.
 * 
 * eğer mail kodu hatalı ise mail kodu hatalı çıktısını verelim. * 
 * @author Yavuz
 */
public class Question17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mailKod = 444;	 
		int telKod = 555;
		System.out.println("Lütfen mail kodunuzu giriniz");
		int mk = scanner.nextInt();
		System.out.println("Lütfen telefon kodunuzu girin..: ");
		int tk = scanner.nextInt();

		if(telKod != tk) {
			System.out.println("Telefon kodu hatalı.");
		}
		if(mailKod != mk) {
			System.out.println("Mail kodu hatalı.");
		}
		
		scanner.close();
	}
}
