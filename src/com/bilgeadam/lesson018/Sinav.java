package com.bilgeadam.lesson018;

import java.util.Scanner;

public class Sinav {
	String ders;
	String konu;
	int sinavNo;
	int soruSayisi;
	long sure;
	String tarih;
	Soru[] sorular;
	String[] cevaplar;
	String[] cevapSecenekleri = { "A", "B", "C", "D" };
	
	public void sinavOlustur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dersin adını girin");
		ders = scanner.nextLine();
		System.out.println("Lütfen sınavın konusunu girin");
		konu = scanner.nextLine();
		System.out.println("Lütfen sınav numarasını girin");
		sinavNo = Integer.parseInt(scanner.nextLine());		
		System.out.println("Lütfen sınavda kaç soru olacağını belirtin");
		soruSayisi = Integer.parseInt(scanner.nextLine());
		sorular = new Soru[soruSayisi];		
		for (int i = 0; i < sorular.length; i++) {
			Soru soru = new Soru();
			soru.soruOlustur(cevapSecenekleri);
			sorular[i] = soru;
		}
		System.out.println("Lütfen sınav süresini girin");
		sure = Long.parseLong(scanner.nextLine());
		System.out.println("Lütfen sınav tarihini girin");
		tarih = scanner.nextLine();
	}
	
	public void sorulariCevapla() {
		cevaplar = new String[sorular.length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cevaplar.length; i++) {
			System.out.println("Soru " + i + "-> " + sorular[i].icerik);
			for (int j = 0; j < sorular[i].cevapIcerikleri.length; j++) {
				System.out.print(cevapSecenekleri[j]+"-"+sorular[i].cevapIcerikleri[j] + " ");
			}
			System.out.println("\nCevabınızı girin");
			cevaplar[i] = scanner.nextLine().toUpperCase();
		}
	}
	
	public void sonucuYazdir() {
		int puan = 0;
		int	dogruCevapSayisi = 0;
		int yanlisCevapSayisi = 0;
		for (int i = 0; i < sorular.length; i++) {
			if(cevaplar[i].equals(sorular[i].dogruCevap)) {
				puan += sorular[i].puan;
				dogruCevapSayisi++;
			}
			else {
				yanlisCevapSayisi++;
			}
		}
		System.out.println("Doğru cevap sayınız: " + dogruCevapSayisi);
		System.out.println("Yanlış cevap sayınız: " + yanlisCevapSayisi);
		System.out.println("Aldığınız puan: " + puan);
	}
}
