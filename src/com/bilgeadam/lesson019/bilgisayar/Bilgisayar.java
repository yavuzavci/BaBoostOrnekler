package com.bilgeadam.lesson019.bilgisayar;

public class Bilgisayar {
	// bilgisayar bir donanıma sahiptir bu kompozisyon
	
	// anakart bir donanımdır bu da kalıtım
	Anakart anakart;
	HariciDonanim[] hariciDonanimlar;
	Kasa kasa;
	
	public Bilgisayar() {
		
	}
	public Bilgisayar(Anakart anakartim, HariciDonanim[] hariciDonanimlarim, Kasa kasam) {
		anakart = anakartim;
		hariciDonanimlar = hariciDonanimlarim;
		kasa = kasam;	
	}
	
}
