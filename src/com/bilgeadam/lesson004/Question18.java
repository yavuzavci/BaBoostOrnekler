package com.bilgeadam.lesson004;
/*
 * telefon kod mail kod başlangıç değerlerini biz kendimiz atayacağız (int)
 * 
 * daha sonra dışarıdan bir tane telefon kodu bir tane mail kodu alacağız
 * 
 * ikisi de uyuyorsa sisteme kaydolunuz
 * telefon doğru email yanlış -> emaili yanlış girdiniz
 * email doğru telefon yanlış -> telefonu yanlış girdiniz
 * ikisini de yanlış girmiş olabilir -> telefonu ve maili yanlış girdiniz
 */
import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		int telKodu = 111, mailKodu = 222;	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen bir telefon kodu girin..: ");
		int kullaniciTelefonKodu = scanner.nextInt();
		System.out.print("Lütfen bir telefon kodu girin..: ");
		int kullaniciMailKodu = scanner.nextInt();
		
		if(telKodu == kullaniciTelefonKodu && mailKodu == kullaniciMailKodu) System.out.println("Sisteme başarıyla kayıt olundu. ");
		else if(telKodu != kullaniciTelefonKodu && mailKodu == kullaniciMailKodu) System.out.println("Telefon kodu hatalı. ");
		else if(telKodu == kullaniciTelefonKodu && mailKodu != kullaniciMailKodu) System.out.println("Mail kodu hatalı. ");
		else System.out.println("Telefon ve mail kodu hatalı. ");		
		scanner.close();

	}

}
