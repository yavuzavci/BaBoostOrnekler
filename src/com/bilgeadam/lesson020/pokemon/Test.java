package com.bilgeadam.lesson020.pokemon;

public class Test {
	
	public static void main(String[] args) {
//		Pokemon pokemon = new Pokemon();
//		pokemon.setAd("charizard");
//		pokemon.setDerece(3);
//		pokemon.setId(1);
//		pokemon.setCan(120);
//		pokemon.setGuc(220);
//		pokemon.setTur("Ates");
//		pokemon.pokedex();
//		
//		AtesPokemonu atesPokemonu = new AtesPokemonu(50);
//		atesPokemonu.setAd("charmander");
//		atesPokemonu.setDerece(2);
//		atesPokemonu.setId(2);
//		atesPokemonu.setCan(80);
//		atesPokemonu.setGuc(120);
//		atesPokemonu.setTur("Ates");
//		String[] handikap = {"Su","Hava"};
//		atesPokemonu.setHandikap(handikap);
//		atesPokemonu.pokedex();
		
		Pokemon pokemon = new Pokemon(1, "Charizard", "Ateş", 120, 220, 3, (String[])null);
		AtesPokemonu atesPokemonu = new AtesPokemonu(2, "Charmander", "Ateş", 80, 120, 2, 50, "Su","Hava");
		pokemon.pokedex();
		atesPokemonu.pokedex();
	}
	
}
