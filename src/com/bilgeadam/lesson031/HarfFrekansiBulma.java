package com.bilgeadam.lesson031;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * dışarıdan bir string değeri gireceğiz
 * 
 * bir map içine atacağız merhaba
 * 
 * m=1
 * e=1
 * r=1
 * h=1
 * a=2
 * b=1
 */
public class HarfFrekansiBulma {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		uygulama();
	}
	
	public static void uygulama() {
		String ifade = degerAl();
		scanner.close();		
		Map<Character,Integer> frekans = new LinkedHashMap<>();
		ifadeninFrekansiniBul(ifade, frekans);
		yazdir(frekans);
		
	}
	
	public static String degerAl() {
		System.out.println("Lütfen ifadenizi girin");
		return scanner.nextLine();
	}
	
	public static void ifadeninFrekansiniBul(String ifade, Map<Character,Integer> map) {
		if(ifade == null) return;
		
		for(Character harf : ifade.toCharArray()) {
			if(!map.containsKey(harf))
				map.put(harf, 1);
			else
				map.put(harf, map.get(harf) + 1);
		}		
	}
	
	public static void yazdir(Map<Character,Integer> map) {
		if(map.isEmpty())
			System.out.println("Boş ifade girdiniz.");
		else
			map.forEach((k,v) -> System.out.println(k + "=" + v));
	}
	
	
	
}
