package com.bilgeadam.lesson006;

/**
 * =Java,React,Spring
 * 
 * split kullanmadan virgülden bölüp 
 * 
 * bir for döngüsü içinde
 * 
 * Java
 * React
 * Spring
 *
 */

public class Question28 {

	public static void main(String[] args) {
		
		String ifade = "Java,React,Spring,Google";
		
		for(int i = 0;i < 3;i++) {
			System.out.println(ifade.substring(i * ifade.length() / 3, (i+1) * ifade.length() / 3)
									.replace(",", ""));
		}
		System.out.println("//////////////////////////////////////");
		// hoca çözümü - 1
		int index = 0;
		
		for(int i = 0; i < ifade.length();i++){
			if(ifade.charAt(i) == ',') {
				System.out.println(ifade.substring(index, i));
				index = i + 1;
			}
		}
		
		System.out.println(ifade.substring(index));
		System.out.println("//////////////////////////////////////");
		// hoca çözümü - 2
		for(int i = 0; i < ifade.length();i++){
			if(ifade.charAt(i) == ',') {
				System.out.println();
			}
			else {
				System.out.print(ifade.charAt(i));
			}
		}
		System.out.println("//////////////////////////////////////");
		// başka bir çözüm
		ifade = ifade.replace(",","\n");
		System.out.println(ifade);
		

	}// main sonu
}// class sonu
