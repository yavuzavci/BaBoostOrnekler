package com.bilgeadam.lesson008;

public class Question40 {

	public static void main(String[] args) {
		// Şehirleri plaka kodlarıyla birlikte bir diziye atayalım daha sonra
		// "Adana'nın plaka kodu 01" örnek çıktısı gibi 
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		
		String[] sehirDizisi = sehirler.split(";");
		
		for (int i = 0; i < sehirDizisi.length; i++) {
			int index = sehirDizisi[i].indexOf('-');
			System.out.println(sehirDizisi[i].substring(index + 1) + "'nın plaka kodu " + sehirDizisi[i].substring(0,index));
		}

	}

}
