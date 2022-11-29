package com.bilgeadam.lesson017;

public class Profile {
	// static havuzunda Profile.id
	
	//sınıfımızın özelliği 
	static int id;
	//nesne özelliklerimiz
	String profilResmi;
	String[] posts = new String[10];
	int postSayisi = posts.length;
	String username;
	String isim;
	int takipciSayisi;
	int takipSayisi;
	
	// metotlar
	
	public void postOlustur() {
		System.out.println("Post oluştu.");
	}
	public void profiliDuzenle() {
		System.out.println("Profil düzenlendi.");
	}
	
}
