package com.bilgeadam.lesson035.sepet;

public class TestSepet {
	
	public static void main(String[] args) {
		Sepet sepet = new Sepet();
		sepet.urunOlustur();
		sepet.urunFiyatMapOlustur();
		sepet.getUrunFiyatMap().forEach((k,v) -> System.out.println(k + " - " + v));
	}
	
}
