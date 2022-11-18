package com.bilgeadam.lesson011;

import java.util.Random;
import java.util.Scanner;

public class Uygulama {
	
	public static void main(String[] args) {
		uygulama();
	}
	
	public static void uygulama() {
		TasKagitMakas tkm = new TasKagitMakas();
		String[] secilebilecekTumDurumlar = tkm.tasKagitMakas;
		Scanner scanner = new Scanner(System.in);
		
		boolean oyun = true;
		
		while(oyun) {
			oyun = oyna(secilebilecekTumDurumlar,scanner);
			if(oyun == false) {
				System.out.println("OYUN SONLANDIRILDI.");
				break;
			}
		}		
	}
	
	public static boolean oyna(String[] tkm, Scanner scanner) {	
		boolean oyun;
		System.out.println("######## TAŞ - KAĞIT - MAKAS ########");
		System.out.println();
		System.out.print("Birini seçin..: ");
		String benimSecimim = scanner.nextLine().toLowerCase();
		String pcSecimi = karsiHamleAl(rastgeleSayiUret(tkm.length)).toLowerCase();
		System.out.println("Rakibiniz " + pcSecimi + " seçti.");
		if(pcSecimi.equalsIgnoreCase(benimSecimim)) 
			System.out.println("Berabere kaldınız.");
		else {
			switch(benimSecimim) {
				case "taş":
					if(pcSecimi.equalsIgnoreCase("Kağıt")) System.out.println("Kaybettiniz.");
					else System.out.println("Kazandınız.");
					break;
				case "kağıt":
					if(pcSecimi.equalsIgnoreCase("Makas")) System.out.println("Kaybettiniz.");
					else System.out.println("Kazandınız.");
					break;
				case "makas":
					if(pcSecimi.equalsIgnoreCase("Taş")) System.out.println("Kaybettiniz.");
					else System.out.println("Kazandınız.");				
					break;
				default:
					System.err.println("Geçersiz seçim yaptınız.");
					break;
			}
		}
		
		System.out.print("Tekrar oynamak istiyor musunuz?\nÇıkış için h ye basın ");
		String devam = scanner.nextLine().toLowerCase();
		
		
		if(devam.equals("h")) oyun = false;
		else oyun = true;
		
		System.out.println();		
		return oyun;
	}
	
	public static String karsiHamleAl(int sayi) {
		switch(sayi) {
			case 0: return "Taş";
			case 1: return "Kağıt";
			case 2: return "Makas";
			default:return "";
		}
	}
	
	public static int rastgeleSayiUret(int uzunluk) {
		Random random = new Random();
		int sayi = random.nextInt(uzunluk); // [0,3) aralığında bir sayı üret
		return sayi;
	}
	
}
