package com.bilgeadam.lesson022.oys;

public class Test {
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		Memur memur = new Memur("Merve",null);
		Ogrenci ogrenci = new Ogrenci("Kemal",null);
		Ogretmen ogretmen = new Ogretmen("Mustafa",null);
		
		manager.menu2(memur);		
	}
	
}
