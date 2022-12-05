package com.bilgeadam.lesson021;

public class Calisan {
	private String isim;
	private String soyisim;
	private String isUnvani;
	private double maas;
	
	public Calisan(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;		
		this.maas = 8000;
		unvanBelirle();
	}
	public Calisan(String isim, String soyisim, double maas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
		unvanBelirle();
	}
	
	public String getIsim() {
		return isim;
	}
	
	public String getSoyisim() {
		return soyisim;
	}
	
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	public String getIsUnvani() {
		return isUnvani;
	}
	
	public void setIsUnvani(String isUnvani) {
		this.isUnvani = isUnvani;
	}
	
	public double getMaas() {
		return maas;
	}
	
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	public void unvanBelirle() {
		if(maas < 8000)
			this.isUnvani = "Stajyer";
		else if(maas < 12000)
			this.isUnvani = "Çalışan";
		else
			this.isUnvani = "Kıdemli Çalışan";
	}
	
	public double zamYap(double zamYuzdesi) {
		this.maas += maas * (zamYuzdesi / 100);
		unvanBelirle();
		return this.maas;
	}
	
}
