package com.bilgeadam.lesson024.database;

public interface IDatabase {
	boolean ekle(Veri veri);    
	boolean sil(String icerik); 
	boolean guncelle(String icerik);
	void listele();
	void login();
}
