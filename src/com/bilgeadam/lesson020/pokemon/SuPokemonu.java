package com.bilgeadam.lesson020.pokemon;

public class SuPokemonu extends Pokemon {
	int suBasincGucu;
	int yuzmeHizi;
	public SuPokemonu(long id, String ad, String tur, int can, int guc, int derece,
			int subasinc, int hiz, String... handikap) {
		super(id, ad, tur, can, guc, derece, handikap);
		this.suBasincGucu = subasinc;
		this.yuzmeHizi = hiz;
	}
	
	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("su basinc gucu= " + this.suBasincGucu);		
		System.out.println("yuzme hizi= " + this.yuzmeHizi);		
		System.out.println("==================");	
	}
	
	
}
