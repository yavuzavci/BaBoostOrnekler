package com.bilgeadam.lesson032;

import java.util.Optional;

public class Test {
	
	public static void main(String[] args) {
		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.sayiOlustur();
		sansliNumaralar.listeOlustur();
		sansliNumaralar.sansliSayilariBul();
		sansliNumaralar.sansliSayilariYazdir();
		System.out.println("50'den büyük olan şanslı sayılar");
		sansliNumaralar.getSansliSayilar().stream()
						.filter(x -> x > 50)
						.forEach(System.out::println);
		System.out.println("Sayıların toplamı");
		sansliNumaralar.getSansliSayilar().stream().reduce((x,y) -> x + y)
			.ifPresent(System.out::println);
		Optional<Integer> toplam = sansliNumaralar.getSansliSayilar().stream().reduce((x,y) -> x + y);
		System.out.println(toplam.get());
		//Optional methodları
		System.out.println("50'den büyük olan şanslı sayıların toplamı");
		Integer toplam2 = sansliNumaralar.getSansliSayilar().stream().filter(x -> x > 50).reduce((x,y) -> x + y).get();
		Optional<String> kelime = Optional.empty();
		System.out.println(toplam2);
		System.out.println(kelime);
		Optional<String> kelime2 = Optional.ofNullable(null);
		System.out.println(kelime2);
		Optional<String> kelime3 = Optional.of("Merhaba Dünya");
		System.out.println(kelime3.get());
		System.out.println(kelime2.isEmpty());
		System.out.println(kelime2.isPresent());
		
	}
	
}
