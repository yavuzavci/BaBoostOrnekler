package com.bilgeadam.lesson019.pokemon;

public class Pokemon {
	
	long id;
	String ad;
	String tur;
	int can;
	int guc;
	int derece;
	String[] handikap;
	Kullanici kullanici;
	
	public void pokedex() {
		System.out.println("PokeDex");
		System.out.println("==================");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("tur= " + tur);
		System.out.println("can= " + can);
		System.out.println("guc= " + guc);
		System.out.println("derece= " + derece);
		System.out.println("==================");		
	}
	
}
