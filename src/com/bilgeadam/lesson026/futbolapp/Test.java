package com.bilgeadam.lesson026.futbolapp;

public class Test {
	
	public static void main(String[] args) {
		Takim takim = new Takim("Ev Sahibi");
		System.out.println(takim.getKaleci());		
		for(AktifFutbolcu futbolcu : takim.getFutbolcular()) {
			System.out.println(futbolcu.toString());
			System.out.println(futbolcu.pasSkoruHesapla());
			System.out.println(futbolcu.pasVer());
		}
			
	}
	
}
