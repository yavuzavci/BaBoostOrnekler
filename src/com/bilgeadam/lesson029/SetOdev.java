package com.bilgeadam.lesson029;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* Dışarıdan bir string deger alacağız 
* 
*bu string degerdeki her harfi kontrol edeceğiz tekrar edenleri bir sete 
*tekrar etmeyenleri başka bir sete atacagız 
* 
* daha sonra bu iki seti yazdıracagız
* 
* araba
* 
* tekrar edenler
* a
* tekrar etmeyenler
* r
* b
* 
*/
public class SetOdev {
	
	public static final Set<Character> tekrarEdenHarfler = new HashSet<Character>();
	public static final Set<Character> tekrarEtmeyenHarfler = new HashSet<Character>();
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		uygulama();
	}
	
	public static void uygulama() {
		yazdir(degerAl());
	}
	
	public static String degerAl() {
		System.out.println("Lütfen bir ifade giriniz");
		String ifade = scanner.nextLine();
		scanner.close();
		return ifade;
	}
	
	public static void yazdir(String ifade) {
		if(ifade.isEmpty())
			System.err.println("HATA: Boş ifadede tekrar eden ifade olmaz.");
		else {			
			if(ifade.length() == 1)
				System.out.println("İfadeniz " + ifade + " tek harf içerir.");
			else {
				harfleriBul(ifade);
				tekrarlariSil(tekrarEtmeyenHarfler);
				tekrarEdenleriYazdir(tekrarEdenHarfler);
				tekrarEtmeyenleriYazdir(tekrarEtmeyenHarfler);
			}
		}		
	}
	
	public static void harfleriBul(String ifade) {
		char[] harfler = ifade.toCharArray();
		for(char harf : harfler) {
			if(tekrarEtmeyenHarfler.add(harf))
				continue;
			tekrarEdenHarfler.add(harf);
		}		
	}
	
	public static void tekrarlariSil(Set<Character> tekrarEtmeyenHarfler) {
		for(Character harf : tekrarEdenHarfler) {
			tekrarEtmeyenHarfler.remove(harf);
		}		
	}
	
	public static void tekrarEdenleriYazdir(Set<Character> tekrarEdenHarfler) {
		if(tekrarEdenHarfler.isEmpty())
			System.out.println("Tekrar eden harf yoktur.");
		else {
			System.out.println("########## Tekrar Eden Harfler ##########");
			tekrarEdenHarfler.forEach(System.out::println);
		}		
	}
	
	public static void tekrarEtmeyenleriYazdir(Set<Character> tekrarEtmeyenHarfler) {
		if(tekrarEtmeyenHarfler.isEmpty())
			System.out.println("Tekrar etmeyen harf yoktur.");
		else {
			System.out.println("######### Tekrar Etmeyen Harfler #########");
			tekrarEtmeyenHarfler.forEach(System.out::println);
		}
		
	}
	
}
