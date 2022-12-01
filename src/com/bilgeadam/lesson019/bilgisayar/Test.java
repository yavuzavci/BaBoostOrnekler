package com.bilgeadam.lesson019.bilgisayar;

public class Test {
	
	public static void main(String[] args) {
		Islemci islemci = new Islemci();
		islemci.hiz = 200;
		Ram ram = new Ram();
		Anakart anakart = new Anakart(islemci,ram);
		Klavye klavye = new Klavye();
		Mouse mouse = new Mouse();
		Monitor monitor = new Monitor();
		Kasa kasa = new Kasa();
		HariciDonanim[] hariciDonanimlar = new HariciDonanim[15];
		hariciDonanimlar[0] = mouse;
		hariciDonanimlar[1] = monitor;
		hariciDonanimlar[2] = klavye;
		
		Bilgisayar bilgisayar = new Bilgisayar(anakart, hariciDonanimlar, kasa);
		
		System.out.println(bilgisayar.anakart);
		System.out.println(bilgisayar.kasa);
		System.out.println(bilgisayar.hariciDonanimlar[0]);
		System.out.println(bilgisayar.hariciDonanimlar[1]);
		System.out.println(bilgisayar.hariciDonanimlar[2]);
		System.out.println(bilgisayar.anakart.islemci.hiz);
	}
	
}
