package com.bilgeadam.lesson024.database;

import com.bilgeadam.lesson024.enumornek.Utility;

/**
 * Mysql database bir sınıf oluşturun
 * bu sınıfa bir interface yazacağız
 * ekleme silme getirme ve güncelleme
 * metodları olsun
 * 
 * bir manager sınıfı olsun yazalım burada menümüz olsun
 * 1- veri ekle
 * 2- veri sil
 * 3- veri güncelle
 * 4- verileri getir
 *
 */

public class Test {
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		Manager manager;
		Database db;
		int secim = 0;
		do {
			System.out.println("1- Mysql");
			System.out.println("2- Oracle");
			secim = Utility.intDegerAlma("Lütfen hangi veri tabanını kullanacağınızı seçiniz");
			switch(secim) {
				case 1:
					db = new Mysql();
					manager = new Manager(db);
					manager.calistir();
					break;
				case 2:
					db = new Oracle();
					manager = new Manager(db);
					manager.calistir();
					break;
				default:
					break;
			}
		} while (secim != 0);
		Utility.scanner.close();
	}
		
}
