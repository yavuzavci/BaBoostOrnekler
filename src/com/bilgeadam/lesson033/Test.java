package com.bilgeadam.lesson033;

import java.util.Optional;

public class Test {
	
	public static void main(String[] args) {
		UrunManager urunManager = new UrunManager();
		
		for(int i = 0; i < 3; i++) {
			urunManager.urunEkle(urunManager.urunOlustur2());
		}
		//eğer ürün varsa fiyatını 2 ile çarpalım
		for(Optional<Urun> urun : urunManager.yeniurunler) {
			urun.map(x -> {
				x.setFiyat(x.getFiyat() * 2);
				return x;
			}).ifPresent(System.out::println);
		}
		
		urunManager.tarihiGecmisUrunleriYazdir();
		urunManager.tarihiGecmemisUrunlereZamYapVeYazdir();
		urunManager.fiyatOrtalamasiniBulVeYazdir();
		
		Optional<String> kelime1 = Optional.ofNullable(null);
		Optional<String> kelime2 = Optional.ofNullable("yeni");
		Optional<String> kelime3 = Optional.ofNullable("merhaba dünya");
		
		kelime1.filter(x -> x.length() > 5).ifPresent(System.out::println);
		kelime2.filter(x -> x.length() > 5).ifPresent(System.out::println);
		kelime3.filter(x -> x.length() > 5).ifPresent(System.out::println);
	}
	
}
