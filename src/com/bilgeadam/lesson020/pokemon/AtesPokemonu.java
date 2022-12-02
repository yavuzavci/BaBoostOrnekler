package com.bilgeadam.lesson020.pokemon;

public class AtesPokemonu extends Pokemon {
	private int yakicilikGucu;
	
	public AtesPokemonu(int guc) {
		yakicilikGucu = guc;
	}
	
	public AtesPokemonu(long id, String ad, String tur, int can, int guc, int derece,int yakicilik, String... handikap) {
		super(id,ad,tur,can,guc,derece,handikap);
		this.yakicilikGucu = yakicilik;
	}
	
	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yakicilik gucu= " + this.yakicilikGucu);		
		System.out.println("==================");	
	}
	
	
}
