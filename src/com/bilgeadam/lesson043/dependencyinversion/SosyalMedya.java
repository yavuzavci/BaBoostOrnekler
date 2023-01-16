package com.bilgeadam.lesson043.dependencyinversion;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

public abstract class SosyalMedya {
	
	private double kucultmeKatSayisi;

	public double getKucultmeKatSayisi() {
		return kucultmeKatSayisi;
	}

	public void setKucultmeKatSayisi(double kucultmeKatSayisi) {
		this.kucultmeKatSayisi = kucultmeKatSayisi;
	}
	
//	public void smsGonder(Kullanici kullanici) {		
//		if(kullanici.getPhone() != null)
//			Bildirim.smsGonder(kullanici.getPhone());
//	}
//	
//	public void emailGonder(Kullanici kullanici) {
//		if(kullanici.getEmail() != null)
//			Bildirim.emailGonder(kullanici.getEmail());
//	}
	
	public abstract void boyutlandir(String type);
	
}
