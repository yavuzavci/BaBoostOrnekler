package com.bilgeadam.lesson022.calisan;

public class InsanKaynaklari extends Calisan implements IInsanKaynaklari {

	public InsanKaynaklari(String isim, String soyisim, double maas) {
		super(isim, soyisim, maas);
	}

	public InsanKaynaklari(String isim, String soyisim) {
		super(isim, soyisim);
	}
	
	@Override
	public void unvanBelirle(Calisan calisan) {		
		if(calisan.getClass().getSimpleName().equals("Muhendis")) {
			if(getMaas() < 10000)
				calisan.setIsUnvani("Stajyer Mühendis");
			else if(getMaas() < 12000)
				calisan.setIsUnvani("Mühendis");
			else if(getMaas() < 17000)
				calisan.setIsUnvani("Kıdemli Mühendis");
			else
				calisan.setIsUnvani("Uzman Mühendis");
		}
		else {
			if(calisan.getMaas() < 8000)
				calisan.setIsUnvani("Stajyer");
			else if(calisan.getMaas() < 12000)
				calisan.setIsUnvani("Çalışan"); 
			else
				calisan.setIsUnvani("Kıdemli Çalışan");
		}
	}
	
	@Override
	public void zamYap(Calisan calisan, double zamOrani) {
		calisan.setMaas(calisan.getMaas() * ((100 + zamOrani) / 100));
		if(calisan.getClass().getSimpleName().equals("Muhendis"))
			calisan.setMaas(calisan.getMaas() + 250);
	}
	
}
