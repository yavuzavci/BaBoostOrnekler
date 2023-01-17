package com.bilgeadam.lesson044.factory2;

public class PizzaFactory {
	
	public static Pizza pizzaOlustur(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		switch(tur) {
			case AKDENIZ:
				return new VejeteryanPizza(tur,boyut,hamurTipi);
			default:
				return new EtliPizza(tur,boyut,hamurTipi);
		}
	}

}
