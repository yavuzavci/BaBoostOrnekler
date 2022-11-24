package com.bilgeadam.lesson015;

import java.util.Random;

/* 
 * 
 * bir static olmayan metot yazacağız
 * bu metot bize random int üretip dönecek;
 * daha sonra main metotta biz bu sayıyı boyut1 e eşitleyelim
 * boyut2 için de bir random sayı oluşturalım
 * 
 * static bir metot olsun
 * string değerimizi
 * içeride değiştirip geri döndürelim
 * 
 */
public class Question52 {
	
	int boyut1;
	static int[] dizi;
	static int boyut2;
	
	String deger;
	
	public static void main(String[] args) {
		Question52 question52 = new Question52();
		question52.boyut1 = question52.rastgeleSayiUret();
		boyut2 = question52.rastgeleSayiUret();
		System.out.println("boyut1: " + question52.boyut1);
		System.out.println("boyut2: " + boyut2);
		question52.deger = "metin";
		System.out.println(question52.deger);
		question52.deger = metinDegistir(question52.deger);
		System.out.println(question52.deger);
		question52.rastgeleSayilarYazdir();
	}
	
	public int rastgeleSayiUret(){
		return new Random().nextInt(5);
	}
	
	public static String metinDegistir(String metin) {
		metin = "Değiştirilmiş metin";
		return metin;
	}
	
	public int[] diziUret() {
		int[] dizi = new int[boyut1];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rastgeleSayiUret();
			System.out.println(dizi[i]);
		}
		
		return dizi;
	}
	
	public void rastgeleSayilarYazdir() {
		int boyut = rastgeleSayiUret();
		System.out.println("boyut : " + boyut);
		int[] dizi = new int[boyut];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rastgeleSayiUret();
			System.out.println(dizi[i]);
		}
	}
	
}
