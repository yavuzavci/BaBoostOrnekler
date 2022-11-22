package com.bilgeadam.lesson012;

import java.util.Scanner;

/*
 * 1. method dışarıdan girilen harfle başlayan illeri yazdır
 * 2. method illeri plaka kodları ile yazdıran kod
 * 3. method girdiğimiz şehrin ismine göre plaka dönen methodu yazalım
 * 4. ilk harf hariç sesli harfleri silip yazdıran metod
 * 5.method bir önceki methoddan dönen Dğerlerin ilk üç harfini alın ve sonuna ... 
 * nokta ekleyin Adn... Ady... gibi
 * 6.method bir önceki methoddan dönen dizide  B ile başlayan illerin başına 1-Blk gibi yazdıralım
 * 7.method ikinci harfi a olanların  ilk değeri ve sadece ilk 3 harfini büyük yazdırın Çankırı->ÇAN
 */
public class Test {
	
	public static void main(String[] args) {
		SehirDatabase database = new SehirDatabase();
		
//		String[] iller = database.iller;
				
//		ileBaslayanIller(iller);
//		illeriPlakalariylaYazdir(iller);
//		String plaka = plakaBul(iller);
//		if(Integer.valueOf(plaka) <= 0)
//			System.err.println("Girdiğiniz il için plaka bulunamadı.");
//		else
//			System.out.println("Plaka..: " + plaka);
//		
//		ileBaslayanIller(database.iller);
//		harfSilerekYazdir(iller);
		
		/* buradan sonraki kısımlar 2022-11-21 uygulama dersi sonunda
		 * denenmesi istenen beşinci, altıncı ve yedinci metotları içerecektir. 
		 * Çalıştırmak istemediğiniz metodun kod satırını yorum içine alıp 
		 * tersi durumda yorum dışı bırakın.
		 */
		
		String[] iller;
		// 4. method
//		iller = sesliHarfleriSil(database.iller);
//		illeriYazdir(iller);
		// 5. method
//		iller = illereNoktaEkle(iller);
//		illeriYazdir(iller);
		// 6. method
//		bIleBaslayanIller(iller);		
		// 7. method
		iller = database.iller;
		illeriSecerekYazdir(iller);
	}
	
	public static void bIleBaslayanIller(String[] iller) {
		int bSayaci = 1;
		for (int i = 0; i < iller.length; i++) {
			if(iller[i].startsWith("B")) {
				System.out.println(bSayaci + "-" + iller[i]);
				bSayaci++;
			}
				
		}
	}
	
	public static void ileBaslayanIller(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir harf girin");
		String harf = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i].startsWith(harf.toUpperCase().substring(0,1)))
				System.out.println(dizi[i]);
		}
	}
	
	public static String[] illereNoktaEkle(String[] iller) {
		String[] yeniDizi = iller;
		for (int i = 0; i < yeniDizi.length; i++) {
			yeniDizi[i] = yeniDizi[i].substring(0,3) + "...";
		}
		
		return yeniDizi;
	}
	
	public static void illeriSecerekYazdir(String[] iller) {
		for (int i = 0; i < iller.length; i++) {
			if(iller[i].indexOf('a') == 1)
				System.out.println(iller[i] + "->" + iller[i].substring(0,3).toUpperCase());
		}		
	}
	
	public static void illeriYazdir(String[] iller) {
		for (int i = 0; i < iller.length; i++) {
			System.out.println(iller[i]);
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
		scanner.close();
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
	
	public static String[] sesliHarfleriSil(String[] iller) {
		String[] sesliHarfler = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };
		String[] yeniDizi = iller;
		for (int i = 0; i < iller.length; i++) {	
			
			for (int j = 0; j < sesliHarfler.length; j++) {
				if(iller[i].contains(sesliHarfler[j])) {
					yeniDizi[i] = yeniDizi[i].replace(sesliHarfler[j],"");
				}												
			}			
		}
		
		return yeniDizi;
	}
}
