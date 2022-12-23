package com.bilgeadam.lesson034;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
/*
 * 1- ortalama hesaplayan stream yapısını yazınız.
 * hepsi için ayrı ayrı hesaplayıp ortalama notlar double listemiz olacak
 * not ortalamalarını bu listede tutacağız
 * bir de sınıf ortalamamız bulunsun;
 * 
 * 2- bölüme göre mapleyelim
 * 
 * 3- not ortalaması 50 ve altı olanlar için durum güncellemesi Kaldı
 * diğerleri için geçti olsun
 */
public class StudentManager {
	List<Student> ogrenciler;
	
	public StudentManager() {
		baslangicVerisi();
	}
	
	public void baslangicVerisi() {
		ogrenciler = new ArrayList<>();
		Student student1 = new Student(1,"Mustafa","mat");
		student1.getNotlar().add(50D);
		student1.getNotlar().add(50D);
		student1.getNotlar().add(50D);
		Student student2 = new Student(2,"Ayşe","tm");
		student2.getNotlar().add(80D);
		student2.getNotlar().add(55D);
		student2.getNotlar().add(79.5);
		Student student3 = new Student(3,"Hakan","tm");
		student3.getNotlar().add(86D);
		student3.getNotlar().add(97.5);
		student3.getNotlar().add(50.5);
		Student student4 = new Student(4,"Mert","mat");
		student4.getNotlar().add(80D);
		student4.getNotlar().add(30D);
		student4.getNotlar().add(82.5);
		Student student5 = new Student(5,"Gamze","mat");
		student5.getNotlar().add(10D);
		student5.getNotlar().add(35.7);
		student5.getNotlar().add(58.3);
		Student student6 = new Student(6,"Merve","tm");
		student6.getNotlar().add(36D);
		student6.getNotlar().add(23.5);
		student6.getNotlar().add(57.5);
		ogrenciler = List.of(student1,student2,student3,student4,student5,student6);
	}
	
	public void ortalamaHesaplama() {
	    List<Double> notlar = new ArrayList<Double>();
        // 1. Çözüm -> map li çözüm
//         notlar = ogrenciler.stream().map((x) ->
//         x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)))
//         .collect(Collectors.toList());
//         notlar.forEach(System.out::println);
	    
	    // 2. Çözüm -> For Eachli Cozum
//        ogrenciler.stream().forEach((x) -> {
//            System.out.println(x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//        });
	    
//        ogrenciler.stream().forEach((x) -> {
//            notlar.add(x.getNotlar().stream().collect(Collectors.averagingDouble(z -> z)));
//        });
	    
//        notlar.forEach(System.out::println);
        // 3. Çözüm
//        ogrenciler.stream().forEach(x -> System.out.println(x.notOrtHesapla()));
	    
        Double ort = ogrenciler.stream().map(x -> x.notOrtHesapla())
        		.collect(Collectors.averagingDouble(t -> t));
        
        /*Double ort2 = ogrenciler.stream().collect(
        		Collectors.averagingDouble(x -> 
        		x.getNotlar().stream()
        		.collect(Collectors.averagingDouble(y -> y))));
        		*/
        
        System.out.println(ort);
        // System.out.println(ort2);
	}
	
	public void bolumlereGoreGrupla() {
		ogrenciler.stream()
		.collect(Collectors.groupingBy(
				Student::getBolum,
				TreeMap::new,
				Collectors.toList()))
		.forEach((k,v) -> System.out.println(k + " - " + v));
	}
	
	public void gecmeDurumunuBul() {
		ogrenciler.stream().
		forEach(x -> x.setDurum(x.notOrtHesapla() > 50 ? "Geçti" : "Kaldı"));
		//liste var ama geçenleri ve kalanları ayrı gruplar içinde göstermek istedim
		ogrenciler.stream()
			.collect(Collectors.groupingBy(
					Student::getDurum,
					TreeMap::new,
					Collectors.toList()))
			.forEach((k,v) -> System.out.println(k + " - " + v));
		// listenin çıktısı için bu da yazılabilir
		// ogrenciler.forEach(System.out::println);		
	}
	
	public void ogrenciVeNotOrtalamasiMapleme() {
		ogrenciler.stream()
			.collect(Collectors.toMap(Student::getIsim, Student::notOrtHesapla))
			.forEach((k,v) -> System.out.println(k + " - " + v));
		
		/**
		 * Alternatif Çözüm
		 */
		Map<String,Double> map = new HashMap<>();
	}
	
	public void notEkleme() {
		ogrenciler.stream().forEach(x -> x.getNotlar().add(80D));
	}
	
	public void notEkleme2() {
		ogrenciler.stream()
			.forEach(x -> x.setNotlar(
					x.getNotlar().stream().map(y -> y + 5.0)
					.collect(Collectors.toList())));
	}
}
