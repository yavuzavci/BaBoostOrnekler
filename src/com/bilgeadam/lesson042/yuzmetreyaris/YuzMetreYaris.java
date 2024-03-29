package com.bilgeadam.lesson042.yuzmetreyaris;

import java.util.Comparator;
import java.util.List;

public class YuzMetreYaris {
	
	public static void main(String[] args) {
		long baslangicZamani = System.currentTimeMillis();
		
		Kosucu kosucu1 = new Kosucu("Ahmet", baslangicZamani);
		Kosucu kosucu2 = new Kosucu("Berk", baslangicZamani);
		Kosucu kosucu3 = new Kosucu("Cem", baslangicZamani);
		Kosucu kosucu4 = new Kosucu("Deniz", baslangicZamani);
		Kosucu kosucu5 = new Kosucu("Emre", baslangicZamani);
		List<Kosucu> kosucular = List.of(kosucu1,kosucu2,kosucu3,kosucu4,kosucu5);
		
		Thread thread1 = new Thread(kosucu1);
		Thread thread2 = new Thread(kosucu2);
		Thread thread3 = new Thread(kosucu3);
		Thread thread4 = new Thread(kosucu4);
		Thread thread5 = new Thread(kosucu5);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("============= Yüz Metre Koşu Sonuçları ================");
		//kosucular.forEach(System.out::println);
		//Map<Long, List<Kosucu>> map = kosucular.stream().collect(Collectors.groupingBy(Kosucu::getSure,TreeMap::new,Collectors.toList()));
		
		//map.forEach((k,v) -> System.out.println(k + " ---> " + v));
		
		kosucular.stream().sorted(Comparator.comparingLong(x -> x.getSure())).forEach(System.out::println);
	}
	
}
