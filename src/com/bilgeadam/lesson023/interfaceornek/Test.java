package com.bilgeadam.lesson023.interfaceornek;
/**
 * Polimorfizm
 * final
 * abstract // soyut sınıf
 * 
 * @author Yavuz
 *
 */

public class Test {
	
	public static void main(String[] args) {
		Arac arac = new Arac();
		hareketEt(arac);
		arac = new Araba();
		hareketEt(arac);
		arac = new Bisiklet();
		hareketEt(arac);
		arac = new Ucak();
		hareketEt(arac);
	}
	
	public static void hareketEt(Arac arac) {
		arac.ilerle();
	}
	
	public static void hareketEt2(Arac arac) {
		if(arac instanceof Bisiklet)
			System.out.println("Bisiklet hareket ediyor.");
		else if(arac instanceof Araba)
			System.out.println("Araba hareket ediyor.");
		else if(arac instanceof Ucak)
			System.out.println("Uçak hareket ediyor.");
		else
			System.out.println("Araç hareket ediyor");
	}
		
}
