package com.bilgeadam.lesson019.muzikaletleri;

public class Test {
	
	public static void main(String[] args) {
		MuzikAleti muzikAleti = new MuzikAleti("Türkiye","2020","Zil","Vurmalı",2);
		muzikAleti.bilgileriGoster();
		
		TelliMuzikAletleri gitar = new TelliMuzikAletleri();
		gitar.ad = "Gitar";
		gitar.mensei = "Amerika";
		gitar.tur = "Telli Çalgı";
		gitar.telSayisi = 6;
		gitar.bilgileriGoster();
		System.out.println("tel sayısı= " + gitar.telSayisi);
		gitar.cal();
		gitar.telleriDegistir();
		
		Bateri bateri = new Bateri();
		bateri.ad = "Bateri";
		bateri.yuzeyGenisligi = 20;
	}
	
}
