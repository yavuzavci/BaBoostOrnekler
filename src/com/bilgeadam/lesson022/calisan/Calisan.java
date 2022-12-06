package com.bilgeadam.lesson022.calisan;

public class Calisan implements ICalisan {
	private String isim;
	private String soyisim;
	private String isUnvani;
	private double maas;
	
	public Calisan(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;		
		this.maas = 8000;
	}
	public Calisan(String isim, String soyisim, double maas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
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
	
	
	@Override
	public void maasAl() {
		
	}
	@Override
	public void izinAl() {
		
	}
	@Override
	public void fazlaMesaiYap() {
		
	}
	
}
