package com.bilgeadam.lesson017.otobusuygulamasi;

public class Otobus {
	
	public int yolcuKapasitesi;
	public String sofor;
	public double beygir;
	public int hatNo;
	public int koltukSayisi;
	public String marka;
	public double yakitMiktari;
	public boolean klimaVarMi;
	public int vites;
	public String renk;
	public Guzergah guzergah;
	
	public int yolcuSayisi;
	public int kapiSayisi;
	
	public void yolcuAl(int yolcular) {
		yolcuSayisi += yolcular;
	}	
	
}
