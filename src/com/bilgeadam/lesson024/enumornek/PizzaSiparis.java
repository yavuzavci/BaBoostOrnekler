package com.bilgeadam.lesson024.enumornek;

public class PizzaSiparis {
	/*
	 * pizzamızın hamur tipini, boyutunu ve türünü seçip bize bir pizza olarak
	 * dönen metodu yazalım ve bu pizzayı yazdıralım
	 */
	public static void main(String[] args) {
		Pizza pizza = pizzaSiparisiVer();
		System.out.println(pizza.toString());
	}
	
	public static Pizza pizzaSiparisiVer() {
		System.out.println("Pizza Sipariş Menüsü");
		ETur tur = turSec();
		EBoy boy = boySec();
		EHamurTipi hamurTipi = hamurTipiSec();		
		double fiyat = fiyatBelirle(boy, hamurTipi, tur);
		return new Pizza(boy, hamurTipi, tur, fiyat, null);
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
	
	public static EBoy boySec() {
		for (EHamurTipi tip : EHamurTipi.values()) {
			System.out.println((tip.ordinal() + 1)+ "-" + tip);
		}
		int secim = Utility.intDegerAlma("Lütfen Pizza Boyunu Seçin");
		switch(secim) {
			case 1: return EBoy.KUCUK;
			case 2: return EBoy.ORTA;
			case 3: return EBoy.BUYUK;
			default: return null;
		}
	}
	
	public static ETur turSec() {
		for (EHamurTipi tip : EHamurTipi.values()) {
			System.out.println((tip.ordinal() + 1)+ "-" + tip);
		}
		int secim = Utility.intDegerAlma("Lütfen Pizza Türü Seçin");
		switch(secim) {
			case 1: return ETur.TONBALIKLI;
			case 2: return ETur.KARISIK;
			case 3: return ETur.AKDENIZ;
			default: return null;
		}
	}
	
	public static double fiyatBelirle(EBoy boy, EHamurTipi hamurTipi, ETur tur) {
		double fiyat = 0;
		switch(tur) {
			case TONBALIKLI: 
				fiyat += 55;
				break;
			case KARISIK: 
				fiyat += 70;
				break;
			case AKDENIZ: 
				fiyat += 40;
				break;
			default: 
				break;
		}
		
		switch(boy) {                      
			case KUCUK:
				break;
			case ORTA: 
				fiyat += 20;
				break;
			case BUYUK: 
				fiyat += 35;
				break;
			default: 
				break;
		}
		
		switch(hamurTipi) {                      
			case INCE:
				break;
			case NORMAL: 
				fiyat += 10;
				break;
			case KALIN:
				fiyat += 15;
				break;
			default: 
				break;
		}    
		
		return fiyat; 
	}
	
	
}
