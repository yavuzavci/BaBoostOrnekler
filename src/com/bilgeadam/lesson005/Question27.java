package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question27 {
/*
 * Dışarıdan bir değer alacağız
 * 
 * içinde kaç tane a var bize değerini döndürsün
 * 	
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kelime = scanner.nextLine();		
		scanner.close();
		
		int charCount = 0;
		
		for (int i = 0;i < kelime.length();i++) {
			if(kelime.charAt(i) == 'a')
				charCount++;
		}
		
		System.out.println(charCount + " tane 'a' harfi var.");
	}	
	
}
