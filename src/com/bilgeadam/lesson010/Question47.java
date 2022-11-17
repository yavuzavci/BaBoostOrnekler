package com.bilgeadam.lesson010;

import java.util.Scanner;

public class Question47 {
	/*
	 * menü için bir metot, ders kaydına bak.
	 * 
	 * bir döngümüz olacak bu döngüde işlem seçeceğiz
	 * 1- toplama kullanıcan = alana kadar girilen sayıları toplasın ve ekrana yazdırsın;
	 * 
	 * 3 ve 4 ödev
	 * 
	 * 5 - iki sayı gireceğiz bu sayıların ebob ve ekok unu hesaplayıp bize yazdırsın.
	 * ekok=sayi*sayi2/ebob;
	 */
	public static void main(String[] args) {
		uygulama();
	}
	
	public static void menu() {
		System.out.println("==Hesap makinesi===\n"); 
		System.out.println("1- Topla");
	    System.out.println("2- Çıkar");
	    System.out.println("3- Çarp");
	    System.out.println("4- Böl");
	    System.out.println("5- Ebob - Ekok");
	    System.out.println("0- Çıkış");
	}
	
	public static int islemSec() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir işlem Seçiniz..: ");
		return scanner.nextInt();
		
	}
	
	public static void uygulama() {	
		int islem = 0;
		do {
			menu();
			islem = islemSec();
			switch (islem) {
	    	case 0: 		    		
	    		break;
	    	case 1: 
	    		System.out.println(topla());
	    		break;
	    	case 2:
	    		System.out.println(cikar());
	    		break;
	    	case 3: 
	    		System.out.println(carp());
	    		break;
	    	case 4: 
	    		System.out.println(bol());
	    		break;
	    	case 5: 
	    		ebobEkok();
	    		break;
	    	default:
	    		System.out.println("Hatalı bir seçim yaptınız.\n");
	    		break;
	    	}
		} while (islem != 0);		
	}
	
	public static int topla() {
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		int toplam = 0;
		
		do {
			System.out.println("Lütfen bir sayı giriniz");
			sayi = scanner.nextLine();
			
			if(!sayi.equals("="))
				toplam += Integer.parseInt(sayi);
			
		} while (!sayi.equals("="));
		
		
		return toplam;		
	}
	public static int cikar() {
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		int sonuc = 0;
		int sayac = 0;
		do {
			System.out.println("Lütfen bir sayı giriniz");
			sayi = scanner.nextLine();
			sayac++;
			if(!sayi.equals("=")) {
				
				if(sayac == 1) {
					sonuc = Integer.parseInt(sayi);
				}
				else {
					sonuc -= Integer.parseInt(sayi);
				}							
			}				
			
		} while (!sayi.equals("="));
		
		
		return sonuc;
	}
	public static int carp() {
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		int sonuc = 0;
		int sayac = 0;
		do {
			System.out.println("Lütfen bir sayı giriniz");
			sayi = scanner.nextLine();
			sayac++;
			if(!sayi.equals("=")) {				
				if(sayac == 1)
					sonuc = Integer.parseInt(sayi);
				else
					sonuc *= Integer.parseInt(sayi);						
			}				
			
		} while (!sayi.equals("="));
		
		
		return sonuc;
	}
	public static double bol() {
		Scanner scanner = new Scanner(System.in);
		String sayi = "";
		double sonuc = 0;
		int sayac = 0;
		do {
			System.out.println("Lütfen bir sayı giriniz");
			sayi = scanner.nextLine();
			if(sayi.equals("0"))
				System.out.println("0 bölme işlemini tanımsız yapar. Başka bir sayı girin.");
			else {
				sayac++;
				if(!sayi.equals("=")) {					
					if(sayac == 1)
						sonuc = Double.parseDouble(sayi);					
					else
						sonuc /= Double.parseDouble(sayi);												
				}
			}
		} while (!sayi.equals("="));		
		
		return sonuc;
	}
	
	public static void ebobEkok() {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayıyı girin..: ");
		int sayi1 = scanner.nextInt();
		System.out.print("2. sayıyı girin..: ");
		int sayi2 = scanner.nextInt();
		
		int ebob = 1, ekok = 1;
		
		if(sayi1 < sayi2) {
			for (int i = 1; i <= sayi2; i++) {
				if(sayi1 % i == 0 && sayi2 % i == 0)
					ebob = i;
			}
		}
		
		else {
			for (int i = 1; i <= sayi1; i++) {
				if(sayi1 % i == 0 && sayi2 % i == 0)
					ebob = i;
			}
		}
		
		ekok = sayi1 * sayi2 / ebob;		
		System.out.println("Ebob..: " + ebob + " Ekok..: " + ekok);
	}

}
