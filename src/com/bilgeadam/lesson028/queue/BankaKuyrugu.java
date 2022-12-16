package com.bilgeadam.lesson028.queue;

import java.util.Arrays;
import java.util.List;

public class BankaKuyrugu {
	
	public static void main(String[] args) {
		Musteri m1 = new Musteri("Ahmet",70,1);
		Musteri m2 = new Musteri("Bahri",68,2);
		Musteri m3 = new Musteri("Ceylan",35,3);
		Musteri m4 = new Musteri("Deniz",80,4);
		Musteri m5 = new Musteri("Ege",67,5);
		Musteri m6 = new Musteri("Fatma",54,6);
		Musteri m7 = new Musteri("Gülce",38,7);
		Musteri m8 = new Musteri("Hakan",47,8);
		Musteri m9 = new Musteri("İsmet",50,9);
		
		List<Musteri> musteriler = Arrays.asList(m1,m2,m3,m4,m5,m6,m7,m8,m9);
		
		Banka banka = new Banka(musteriler);
		System.out.println("********* MÜŞTERİ SIRASI *********");
		banka.musterileriYazdir();
	}
	
}
