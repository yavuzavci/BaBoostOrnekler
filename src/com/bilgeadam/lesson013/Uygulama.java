package com.bilgeadam.lesson013;

import java.util.Scanner;

/*
 * 
 * 
  		System.out.println("1-Kayıt Ol");
  		System.out.println("2-Giriş Yap");
  		System.out.println("3-Kullanıcıları göster");
  		System.out.println("4-Çıkış");
 *		
 *		
 * 1- menümüzü oluşturacağız
 * 2- seçim yapacağız
 * 3- seçime göre metot yazacağız
 * 3-1 Kayıt ol metodunu yazalım () bizden bilgilerimizi alacak gidecek
 * database sınıfındaki listeye kullanıcıyı ekleyecek
 * 
 */
public class Uygulama {

	public static void main(String[] args) {
		Database.veriTabaniBaslangicDegerleri();
		uygulamayiBaslat();	
	}
	
	public static void uygulamayiBaslat() {
		Scanner scanner;
		int secim = 0;
		int girisHakki = 3;
		do {
			menuBaslik();	  		
	  		scanner = new Scanner(System.in);	  		
	  		System.out.print("Seçim yapın -> ");
	  		secim = scanner.nextInt();
	  		scanner.nextLine();
	  		
	  		switch (secim) {
				case 1:
					Database.kayitOl();
					break;
				case 2:
					Database.girisYap();									
					break;
				case 3:
					Database.kullanicilariGoster();
					break;
				case 4:
					System.out.println("Çıkış yapıldı.");
					break;
				default:
					System.err.println("Hatalı seçim yaptınız.");
					break;
			}	  		
	  		
		} while (secim != 4);
		scanner.close();
		
	}	
	
	public static void menuBaslik() {
		System.out.println("*****************************");
		System.out.println("*** VERİ TABANI UYGULAMASI **");
		System.out.println("*****************************");
		System.out.println("1-Kayıt Ol");
  		System.out.println("2-Giriş Yap");
  		System.out.println("3-Kullanıcıları göster");
  		System.out.println("4-Çıkış");
	}

}
