package com.bilgeadam.lesson043.openclosed;

public class Test {

	public static void main(String[] args) {
		ResimBoyutlandirma resimBoyutlandirma = new ResimBoyutlandirma();
		Instagram instagram = new Instagram();
		Facebook facebook = new Facebook();
		
		resimBoyutlandirma.boyutlandir2(instagram, "jpg");
		resimBoyutlandirma.boyutlandir2(facebook, "png");
		System.out.println(instagram.getKucultmeKatSayisi());
		System.out.println(facebook.getKucultmeKatSayisi());
		
		////////////// open - closed yapısı sağlandıktan sonra test
		System.out.println("///////////////////////////////////////////////////");
		// polymorphism
		SosyalMedya sosyalMedya1 = new Instagram();
		SosyalMedya sosyalMedya2 = new Facebook();
		SosyalMedya sosyalMedya3 = new WhatsApp();
		
		resimBoyutlandirma.boyutlandir3(sosyalMedya1, "png");
		resimBoyutlandirma.boyutlandir3(sosyalMedya2, "png");
		resimBoyutlandirma.boyutlandir3(sosyalMedya3, "png");
		
		System.out.println("instagram ==> " + sosyalMedya1.getKucultmeKatSayisi());
		System.out.println("facebook ==> " + sosyalMedya2.getKucultmeKatSayisi());
		System.out.println("whatsapp ==> " + sosyalMedya3.getKucultmeKatSayisi());
	}

}
