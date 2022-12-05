package com.bilgeadam.lesson021;

public class Muhendis extends Calisan{
	
	public Muhendis(String isim, String soyisim) {
		super(isim, soyisim);
		setMaas(10000);
		unvanBelirle();
	}

	public Muhendis(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
		unvanBelirle();
	}
	
	@Override
	public void unvanBelirle() {
		if(getMaas() < 10000)
			setIsUnvani("Stajyer Mühendis");
		else if(getMaas() < 12000)
			setIsUnvani("Mühendis");
		else if(getMaas() < 17000)
			setIsUnvani("Kıdemli Mühendis");
		else
			setIsUnvani("Uzman Mühendis");
	}
	
	@Override
	public double zamYap(double zamYuzdesi) {
		setMaas(super.zamYap(zamYuzdesi) + 250);
		unvanBelirle();
		return getMaas();
	}
	
}
