package com.bilgeadam.lesson013;

import java.util.Scanner;

public class Database {
		
	static Kullanici[] kullaniciListesi = new Kullanici[3];
	static int kullaniciIndex = 0;
		
	public void kullaniciEkle() {
		Scanner scanner = new Scanner(System.in);
		if(kullaniciIndex != kullaniciListesi.length) {
			Kullanici kullanici = new Kullanici();
			System.out.print("Kullanıcının ismi -> ");
			kullanici.isim = scanner.nextLine();
			System.out.print("Kullanıcının e-maili -> ");
			kullanici.email = scanner.nextLine();
			System.out.print("Kullanıcının şifresi -> ");
			kullanici.sifre = scanner.nextLine();
			kullaniciListesi[kullaniciIndex] = kullanici;
			System.out.println("Kullanıcı başarıyla kaydedildi. Kullanıcı id-> " + Kullanici.id);
			Kullanici.id++;
			kullaniciIndex++;
		}				
		else System.err.println("HATA: Veritabanına kaydedilebilecek azami kullanıcı sayısına ulaşıldı.");
		
		scanner.close();
	}	

}
