package com.bilgeadam.lesson041;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 1- ogrenci sınıfı oluşturalım bu ogrenci sınıfında 2 tane constructor oluşturun
 * birinde sadece isim olsun diğerinde hem isim hem ortalama olsun
 * 
 * 2- dosyamızı okuyup gelen verilerden bir ogrenci yaratıp bunları bir listeye atalım
 * daha sonra bu listeyi yazdıralım (ilk başta ogrenci oluştururken sadece isimlerle oluşturalım.)
 * 
 * 3- ogrenci listesinden bir serileştirme işlemi ile ogrencileri bir dosyay yazalım 
 * 4- serileştirip yazdığımız dosyadan gelen ogrenci verilerini okuyup console yazdıralım 
 */
public class Manager {
	
	private static List<Ogrenci> ogrenciListesi = new ArrayList<>();

	public static void main(String[] args) {
		//isimleOgrenciOku(FileSabitler.file);
		isimleVeNotlarlaOgrenciOku(FileSabitler.file);
	}
	
	private static void isimleOgrenciOku(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> ogrenciBilgiler;
			String strOgrenciBilgiler = "";
			while((strOgrenciBilgiler = reader.readLine()) != null) {
				ogrenciBilgiler = Arrays.asList(strOgrenciBilgiler.split(","));
				String isim = ogrenciBilgiler.get(0);
				Ogrenci ogrenci = new Ogrenci(isim);
				ogrenciListesi.add(ogrenci);
			}
			ogrenciListesi.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void isimleVeNotlarlaOgrenciOku(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> ogrenciBilgiler;
			String strOgrenciBilgiler = "";
			while((strOgrenciBilgiler = reader.readLine()) != null) {
				ogrenciBilgiler = Arrays.asList(strOgrenciBilgiler.split(","));
				String isim = ogrenciBilgiler.get(0);
				double ortalama = notOrtalamasiniBul(ogrenciBilgiler);
				Ogrenci ogrenci = new Ogrenci(isim, ortalama);
				ogrenciListesi.add(ogrenci);
			}
			ogrenciListesi.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static double notOrtalamasiniBul(List<String> list) {
		return list.subList(1, list.size())
				.stream()
				.collect(Collectors.averagingDouble(not -> Double.parseDouble(not)));
	}
}
