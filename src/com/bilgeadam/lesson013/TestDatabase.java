package com.bilgeadam.lesson013;

public class TestDatabase {

	public static void main(String[] args) {
		
		Database db = new Database();
		do {
			db.kullaniciEkle();
		} while (Database.kullaniciIndex != 3);
	
	}

}
