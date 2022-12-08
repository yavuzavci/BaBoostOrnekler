package com.bilgeadam.lesson024.enumornek;

public class PizzaSiparis {
	/*
	 * pizzamızın hamur tipini, boyutunu ve türünü seçip bize bir pizza olarak
	 * dönen metodu yazalım ve bu pizzayı yazdıralım
	 */
	public static void main(String[] args) {
		System.out.println(hamurTipiSec());
		// Dışarıdan girilen string değere göre bize enum değerini dönüyor
		// System.out.println(EHamurTipi.valueOf("INCE"));
		
		// System.out.println(hamurTipiSec2("INCE"));
		
//		System.out.println(EHamurTipi.KALIN.name());
//		System.out.println(EHamurTipi.KALIN.ordinal());
//		System.out.println(EHamurTipi.KALIN.toString());
	}
	
	public void menu() {
		System.out.println("Pizza Sipariş Menüsü");		
	}
	
	public static EHamurTipi hamurTipiSec2(String tip) {
		return EHamurTipi.valueOf(tip);
	}
	public static EHamurTipi hamurTipiSec() {
		for (EHamurTipi tip : EHamurTipi.values()) {
			System.out.println((tip.ordinal() + 1)+ "-" + tip);
		}
		int secim = Utility.intDegerAlma("Lütfen Hamur Tipi Seçin");
		switch(secim) {
			case 1: return EHamurTipi.INCE;
			case 2: return EHamurTipi.NORMAL;
			case 3: return EHamurTipi.KALIN;
			default: return null;
		}
	}
}
