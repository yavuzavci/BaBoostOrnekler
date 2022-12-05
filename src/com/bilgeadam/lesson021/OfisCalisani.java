package com.bilgeadam.lesson021;

public class OfisCalisani extends Calisan{

	public OfisCalisani(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(8000);
		unvanBelirle();
	}

	public OfisCalisani(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		unvanBelirle();
	}
	
	@Override
	public double zamYap(double zamYuzdesi) {
		setMaas(super.zamYap(zamYuzdesi));
		unvanBelirle();
		return getMaas();
	}
	
}
