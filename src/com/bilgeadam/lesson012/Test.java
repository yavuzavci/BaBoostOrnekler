package com.bilgeadam.lesson012;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 1. method dışarıdan girilen harfle başlayan illeri yazdır
 * 2. method illeri plaka kodları ile yazdıran kod
 * 3. method girdiğimiz şehrin ismine göre plaka dönen methodu yazalım
 * 4. ilk harf hariç sesli harfleri silip yazdıran metod
 */
public class Test {
	
	public static void main(String[] args) {
		SehirDatabase database = new SehirDatabase();
		
		String[] iller = database.iller;
		
		//ileBaşlayanİller(iller);
		//illeriPlakalariylaYazdir(iller);
		//String plaka = plakaBul(iller);
		//if(Integer.valueOf(plaka) <= 0)
		//	System.err.println("Girdiğiniz il için plaka bulunamadı.");
		//else
		//	System.out.println("Plaka..: " + plaka);
		
		//ileBaşlayanİller(database.iller);
		
		harfSilerekYazdir(iller);
	}
	
	public static void ileBaşlayanİller(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir harf girin");
		String harf = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i].startsWith(harf.toUpperCase().substring(0,1)))
				System.out.println(dizi[i]);
		}
	}
	
	public static void illeriPlakalariylaYazdir(String[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			if(i  < 9)
				System.out.println("0" + (i + 1) + "-" + dizi[i]);
			else
				System.out.println((i + 1) + "-" + dizi[i]);
		}
	}
	
	public static String plakaBul(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Plakasını bulmak istediğiniz ili girin: ");
		String il = scanner.nextLine();
		String sonuc="";
		int plaka = 0;
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i].equalsIgnoreCase(il))
				plaka =  i + 1;				
			else 
				continue;
		}
		
		if(plaka <= 0) sonuc = "0";
		else if(plaka < 9) sonuc = "0" + plaka;
		else sonuc = "" + plaka;
		
		return sonuc;
	}
	
	public static void harfSilerekYazdir(String[] iller) {
		String[] sesliHarfler = { "a", "e", "ı", "i", "o", "ö", "u", "ü" }; 
		for (int i = 0; i < iller.length; i++) {
			String sonuc = "";			
				
			for (int j = 0; j < sesliHarfler.length; j++) {
				if(iller[i].contains(sesliHarfler[j])) {
					sonuc = iller[i].substring(0,1) + iller[i].substring(1)
							.replace(sesliHarfler[j],"");
				}												
			}
			System.out.println(sonuc);
		}
	}
}
