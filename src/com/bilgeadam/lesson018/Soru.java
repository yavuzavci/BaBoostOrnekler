package com.bilgeadam.lesson018;

import java.util.Scanner;

public class Soru {
	int puan;
	int siraNo;
	String icerik;
	String dogruCevap;
	String[] cevapIcerikleri;
	
	public void soruOlustur(String[] cevapSecenekleri) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sorunun içeriğini girin");
		icerik = scanner.nextLine();
		cevapIcerikleri = new String[cevapSecenekleri.length];
		
		for (int i = 0; i < cevapIcerikleri.length; i++) {
			System.out.println("Lütfen" + cevapSecenekleri[i] + " şıkkının içeriğini girin.");
			cevapIcerikleri[i] = scanner.nextLine();
		}
		System.out.println("Sorunun doğru cevabını belirtin");
		dogruCevap = scanner.nextLine().toUpperCase();
		System.out.println("Sorunun puanını belirtiniz");
		puan = Integer.parseInt(scanner.nextLine());
	}
}
