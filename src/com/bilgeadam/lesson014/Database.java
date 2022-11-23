package com.bilgeadam.lesson014;

import java.util.Scanner;

public class Database {
		
	static Kullanici[] kullaniciListesi = new Kullanici[5];
	static int limit = kullaniciListesi.length;
	static int kullaniciIndex = 0;
		
	public static void kayitOl() {
		Scanner scanner = new Scanner(System.in);
		if(kullaniciIndex == limit)
			listeBoyutunuArttir();
		
		else {
			Kullanici kullanici = new Kullanici();
			System.out.print("Kullanıcının ismi -> ");
			kullanici.isim = scanner.nextLine();
			System.out.print("Kullanıcının e-maili -> ");
			kullanici.email = scanner.nextLine();
			System.out.print("Kullanıcının şifresi -> ");
			kullanici.sifre = scanner.nextLine();
			kullanici.id = kullaniciIndex + 1;
			kullaniciListesi[kullaniciIndex] = kullanici;
			System.out.println("Kullanıcı başarıyla kaydedildi. Kullanıcı id-> " + kullanici.id);
			kullaniciIndex++;
		}				
		
	}
	
	public static void listeBoyutunuArttir() {
		Kullanici[] tmp = new Kullanici[limit + 5];
		for (int i = 0; i < limit; i++) {
			tmp[i] = kullaniciListesi[i];
		}
		kullaniciListesi = tmp;
		limit = tmp.length;
	}
	
	public static void girisYap() {
		int girisHakki = 3;
		while(girisHakki != 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("E-mail adresi -> ");
	  		String email = scanner.nextLine();
	  		System.out.print("Şifre -> ");
	  		String sifre = scanner.nextLine();
	  		if(Database.kullaniciVarMi(email, sifre)) {
	  			System.out.println("Hoşgeldin " + kullaniciIsminiAl(email));
	  			girisHakki = 3;
	  			break;
	  		}					
			else {	
				girisHakki--;
				if(girisHakki == 0) break;
				System.err.println("HATA: E-posta veya şifre yanlış. Tekrar deneyin.");				
			}				
		}
			
		if(girisHakki == 0) {
			System.err.println("Giriş hakkınız kalmadı. Lütfen daha sonra tekrar deneyin.");
			girisHakki = 3;
		}
	}
	
	public static String kullaniciIsminiAl(String email) {
		for (int i = 0; i < limit; i++) {
			if(email.equals(kullaniciListesi[i].email))
				return kullaniciListesi[i].isim;
		}
		
		return null;
	}
	
	public static void kullanicilariGoster() {
		for (int i = 0; i < limit; i++) {
			if(kullaniciListesi[i] != null)
				System.out.println("İsim: " + kullaniciListesi[i].isim 
											+ " E-mail: " + kullaniciListesi[i].email);
		}
	}
	
	public static boolean kullaniciVarMi(String email, String sifre) {	
		for (int i = 0; i < limit; i++) {
			if(kullaniciListesi[i] != null
					&& email.equals(kullaniciListesi[i].email)
					&& sifre.equals(kullaniciListesi[i].sifre)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void veriTabaniBaslangicDegerleri() {
		Kullanici kullanici = new Kullanici();
		kullanici.email = "mustafa@gmail.com";
		kullanici.isim = "Mustafa";
		kullanici.sifre = "123";
		kullaniciListesi[kullaniciIndex] = kullanici;
		kullanici.id = kullaniciIndex + 1;
		kullaniciIndex++;
		
		Kullanici kullanici2 = new Kullanici();
		kullanici2.email = "merve@gmail.com";
		kullanici2.isim = "Merve";
		kullanici2.sifre = "123";
		kullaniciListesi[kullaniciIndex] = kullanici2;
		kullanici.id = kullaniciIndex + 1;
		kullaniciIndex++;
		
		Kullanici kullanici3 = new Kullanici();
		kullanici3.email = "yasin@gmail.com";
		kullanici3.isim = "Yasin";
		kullanici3.sifre = "123";
		kullaniciListesi[kullaniciIndex] = kullanici3;
		kullanici.id = kullaniciIndex + 1;
		kullaniciIndex++;		
	}
	
}
