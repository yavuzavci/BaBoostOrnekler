package com.bilgeadam.lesson019.pokemon;

public class Test {
	
	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		pokemon.ad = "charizard";
		pokemon.derece = 3;
		pokemon.id = 1;
		pokemon.can = 120;
		pokemon.guc = 220;
		pokemon.tur = "Ates";
		pokemon.pokedex();
		
		AtesPokemonu atesPokemonu = new AtesPokemonu();
		atesPokemonu.ad = "charmander";
		atesPokemonu.derece = 2;
		atesPokemonu.id = 2;
		atesPokemonu.can = 80;
		atesPokemonu.guc = 120;
		atesPokemonu.tur = "Ates";
		atesPokemonu.yakicilikGucu = 50;
		atesPokemonu.handikap = new String[2];
		atesPokemonu.handikap[0] = "Su";
		atesPokemonu.handikap[1] = "Hava";
		atesPokemonu.pokedex();
	}
	
}
