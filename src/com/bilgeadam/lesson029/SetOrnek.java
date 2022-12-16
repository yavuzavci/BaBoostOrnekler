package com.bilgeadam.lesson029;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Bir tane String bir setimiz olsun daha sonra dışarıdan bir kategori
 * istediğimiz metot olsun bu kategorileri sepete ekleyelim
 * 
 * eğer daha önce eklemişsek bize böyle bir kategori eklendi diye bir çıktı
 * versin
 * 
 * setimizi yazdıralım
 * 
 */
public class SetOrnek {
	
	public static final Set<String> set = new HashSet<String>();
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		kategoriEkle("Korku",set);
		kategoriEkle("Aksiyon",set);
		kategoriEkle("Komedi",set);
		kategoriEkle("Dram",set);
		kategoriEkle("Kurgu",set);
		kategoriEkle("Korku",set);
		
		setiYazdir(set);
	}
	
	public static void kategoriEkle(String kategori, Set<String> set) {		
		if(set.contains(kategori))
			System.out.println(kategori + " kategorisi daha önce eklendi");
		else {
			System.out.println(kategori + " başarıyla sete eklendi.");
			set.add(kategori);
		}
			
	}
	public static void kategoriEkle2(String kategori, Set<String> set) {		
		if(set.add(kategori))
			System.out.println(kategori + " başarıyla sete eklendi.");
		else
			System.out.println("Böyle bir kategori daha önce eklendi");
	}
	
	public static void setiYazdir(Set<String> set) {
		System.out.println("**** SET ****");
		set.forEach(x -> System.out.println(x));
		System.out.println("*************");
	}
	
}
