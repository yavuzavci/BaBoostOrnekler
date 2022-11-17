package com.bilgeadam.lesson009;

import java.util.Scanner;

//Türkçe karakterleri İngilizce karaktere çevirme
/**
 * bir metot yazalım metot arraylarimizin 2 sinide alsın
 * daha sonra metodun içinde bir string değer alalım
 * 
 * sonra türkçe karakterleri ing karakterlere dönüştürülmüş halini geri dönelim
 * 
 * döndüğümüz String değerini main metotta yazdıralım
 * 
 * @author Yavuz
 * 
 */
public class Question45 {
	
	
	public static void main(String[] args) {
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
        String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
        
        System.out.println(karakterCevir(ingilizceKarakter, turkceKarakter));
	}
	
	public static String karakterCevir(String[] engChar, String[] trChar) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Metninizi girin..: ");
		String metin = scanner.nextLine();
		scanner.close();
		
		for (int i = 0; i < trChar.length; i++) {
			metin = metin.replace(trChar[i],engChar[i]);
		}
				
		return metin;
	}
	
}
