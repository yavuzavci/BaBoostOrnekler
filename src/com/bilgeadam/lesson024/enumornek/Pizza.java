package com.bilgeadam.lesson024.enumornek;

import java.util.Arrays;

/*
 * Boy
 * fiyat
 * malzemeleri
 * tür (ad)
 * Hamur tipi
 */
public class Pizza {
	EBoy boy;
	EHamurTipi hamurTipi;
	ETur tur;
	double fiyat;
	String[] malzemeler;
	
	public Pizza(EBoy boy,EHamurTipi hamurTipi,	ETur tur,double fiyat,String[] malzemeler) {
		this.boy = boy;
		this.hamurTipi = hamurTipi;
		this.tur = tur;
		this.fiyat = fiyat;
		this.malzemeler = malzemeler;
	}

	@Override
	public String toString() {
		return "Pizza [boy=" + boy + ", hamurTipi=" + hamurTipi + ", tur=" 
				+ tur + ", fiyat=" + fiyat + ", malzemeler="
				+ Arrays.toString(malzemeler) + "]";
	}
	
	
}
