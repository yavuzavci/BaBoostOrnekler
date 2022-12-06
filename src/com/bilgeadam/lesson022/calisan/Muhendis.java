package com.bilgeadam.lesson022.calisan;

public class Muhendis extends Calisan implements IHarcOdeme {
	
	public Muhendis(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(10000);
	}

	public Muhendis(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
	}
	
	
	
	@Override
	public void harcOde() {
		
	}
	
}
