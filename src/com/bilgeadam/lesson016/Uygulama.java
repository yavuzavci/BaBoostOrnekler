package com.bilgeadam.lesson016;

import java.util.Random;

/*
 * 
 * bir deste oluşturalım// sadece rakamları içersin 0.......51
 * desteyi göster metotu yazacağız daha once olusturduğumuz deste dizisiniz
 * bu metoto da  kullanacağız ve indexlerine göre
 *     kupa as kupa2 .......Maça as maça2......
 */
public class Uygulama {
	
	Kart kart = new Kart();

	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		int[] deste = uygulama.desteYap();
//		
//		for (int i = 0; i < deste.length; i++) {
//			System.out.println(deste[i]);
//		}		
		uygulama.siraliDesteyiGoster(deste);
//		uygulama.yazdir(deste);
		deste = uygulama.desteyiKaristir(deste);
		System.out.println();
//		uygulama.yazdir(deste);
//		System.out.println();
		uygulama.karisikDesteyiGoster(deste);
		System.out.println();
		uygulama.karisikDesteyiGoster2(deste, 15);
	}
	
	public int rastgeleIndexUret() {
		return new Random().nextInt(52);
	}
	
	public int[] desteyiKaristir(int[] deste) {
		for (int i = 0; i < deste.length; i++) {
			int rastgeleIndex = rastgeleIndexUret();
			int gecici = deste[i];
			deste[i] = deste[rastgeleIndex];
			deste[rastgeleIndex] = gecici;
		}
		
		return deste;
	}
	
	public void yazdir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
	}
	
	public int[] desteYap() {
		int[] deste = new int[kart.kartNumaralari.length * kart.kartTurleri.length];
		for (int i = 0; i < deste.length; i++) {
			deste[i] = i;
		}			
		return deste;	
	}
	
	public void karisikDesteyiGoster(int[] deste) {
		for (int i = 0; i < deste.length; i++) {
			if(deste[i] >= 0 && deste[i] < 13)
				System.out.println(kart.kartTurleri[0]+ " " + kart.kartNumaralari[deste[i] % 13]);
			else if(deste[i] >= 13 && deste[i] < 26)
				System.out.println(kart.kartTurleri[1]+ " " + kart.kartNumaralari[deste[i] % 13]);
			else if(deste[i] >= 26 && deste[i] < 39)
				System.out.println(kart.kartTurleri[2]+ " " + kart.kartNumaralari[deste[i] % 13]);
			else
				System.out.println(kart.kartTurleri[3]+ " " + kart.kartNumaralari[deste[i] % 13]);			
		}
		
		/*
		 * Hoca alternatif çözüm
		 * 
		 * for (int i = 0; i < deste.length; i++) {
		 *		int kartIndex = deste[i] / 13;
		 *		int numaraIndex = deste[i] % 13;
		 *		String kartTuru = kart.kartTurleri[kartIndex];
		 *		String kartNumarasi = kart.kartNumaralari[numaraIndex];
		 *		System.out.println(kartTuru + " " + kartNumarasi);
		 *	}
		 * 
		 */
		
	}
	
	public void karisikDesteyiGoster2(int[] deste, int kartSayisi) {
		int count = 0;
		
		if(kartSayisi == 0 || kartSayisi > 52)
			System.out.println("Kart sayısı belirtilen aralıkta olmadığı için herhangi bir değer gösterilemez.");
		else
			count = kartSayisi;
		
		for(int i = 0;i < count;i++) {
			int kartIndex = deste[i] / 13;
			int numaraIndex = deste[i] % 13;
			String kartTuru = kart.kartTurleri[kartIndex];
			String kartNumarasi = kart.kartNumaralari[numaraIndex];
			System.out.println(kartTuru + " " + kartNumarasi);
		}
	}
	
	public void siraliDesteyiGoster(int[] deste) {
		for (int i = 0; i < kart.kartTurleri.length; i++) {
			for (int j = 0; j < kart.kartNumaralari.length; j++) {
				System.out.print(kart.kartTurleri[i]+ " " + kart.kartNumaralari[j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
}
