package com.bilgeadam.lesson017.otobusuygulamasi;

public class Test {
	
	public static void main(String[] args) {
		Otobus otobus = new Otobus();
		otobus.hatNo = 413;
		otobus.kapiSayisi = 3;
		otobus.yolcuKapasitesi = 100;
		otobus.klimaVarMi = true;
		otobus.renk = "kırmızı";
		System.out.println(otobus.yolcuSayisi);
		otobus.yolcuAl(5);
		System.out.println(otobus.yolcuSayisi);
		
		Durak durak1 = new Durak();	
		durak1.durakIsmi = "Güvenpark";
		durak1.durakNo = 12206;
		durak1.konum = "Kızılay";
		durak1.otobusListesi = new Otobus[2];
		durak1.otobusListesi[0] = otobus;
		
		Durak durak2 = new Durak();	
		durak2.durakIsmi = "Meclis";
		durak2.durakNo = 12217;
		durak2.konum = "Kızılay";
		durak1.otobusListesi = new Otobus[1];
		durak1.otobusListesi[0] = otobus;
		
		Guzergah guzergah1 = new Guzergah();
		guzergah1.hatNo = otobus.hatNo;
		guzergah1.duraklar = new Durak[2];
		guzergah1.duraklar[0] = durak1;
		guzergah1.duraklar[1] = durak2;
		
		otobus.guzergah = guzergah1;		
		
		Otobus otobus2 = new Otobus();
		otobus.hatNo = 112;
		otobus.kapiSayisi = 3;
		otobus.yolcuKapasitesi = 100;
		otobus.klimaVarMi = true;
		otobus.renk = "kırmızı";
		otobus.yolcuAl(12);
		
		Durak durak3 = new Durak();
		durak3 = durak1;
		durak3.otobusListesi[0] = otobus2;
		
		Durak durak4 = new Durak();
		durak4.durakIsmi = "Karayolları Genel Müdürlüğü";
		durak4.durakNo = 12102;
		durak4.konum = "Yücetepe";
		durak4.otobusListesi = new Otobus[1];
		durak4.otobusListesi[0] = otobus2;
		
		Guzergah guzergah2 = new Guzergah();
		guzergah2.hatNo = otobus2.hatNo;
		guzergah2.duraklar = new Durak[2];
		guzergah2.duraklar[0] = durak3;
		guzergah2.duraklar[1] = durak4;
		
		otobus2.guzergah = guzergah2;
		
		System.out.println("Otobüs 1 e ait durak listesi");
		for (int i = 0; i < otobus.guzergah.duraklar.length; i++) {
			System.out.println(otobus.guzergah.duraklar[i].durakNo + " - " + otobus.guzergah.duraklar[i].durakIsmi);
		}
		System.out.println();
		System.out.println("Otobüs 2 e ait durak listesi");
		for (int i = 0; i < otobus2.guzergah.duraklar.length; i++) {
			System.out.println(otobus2.guzergah.duraklar[i].durakNo + " - " + otobus2.guzergah.duraklar[i].durakIsmi);
		}
		
	}
	
}
