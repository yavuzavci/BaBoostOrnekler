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
		String pcSecimi = karsiHamleAl(rastgeleSayiUret(tkm.length));
		System.out.println("Rakibiniz " + pcSecimi + " seçti.");
		if(pcSecimi.equals(benimSecimim)) 
			System.out.println("Berabere kaldınız.");
		else {
			switch(benimSecimim) {
				case "taş":
					if(pcSecimi.equals("kağıt")) 
						System.out.println("Kaybettiniz.");
					else 
						System.out.println("Kazandınız.");
					break;
				case "kağıt":
					if(pcSecimi.equals("makas")) 
						System.out.println("Kaybettiniz.");
					else 
						System.out.println("Kazandınız.");
					break;
				case "makas":
					if(pcSecimi.equals("taş")) 
						System.out.println("Kaybettiniz.");
					else 
						System.out.println("Kazandınız.");				
					break;
				default:
					System.err.println("Geçersiz seçim yaptınız.");
					break;
			}
		}
		
		System.out.print("Tekrar oynamak istiyor musunuz?\nÇıkış için h yazın -> ");
		String devam = scanner.nextLine().toLowerCase();		
		
		if(devam.equals("h")) oyun = false;
		else oyun = true;
		
		System.out.println();		
		return oyun;
	}
	
	public static String karsiHamleAl(int sayi) {
		switch(sayi) {
			case 0: return "taş";
			case 1: return "kağıt";
			case 2: return "makas";
			default:return "";
		}
	}
	
	public static int rastgeleSayiUret(int deger) {
		Random random = new Random();
		int sayi = random.nextInt(deger); // [0,değer) aralığında bir sayı üret
		return sayi;
	}
	
}
