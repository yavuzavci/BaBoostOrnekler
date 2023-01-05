package com.bilgeadam.lesson038;

import java.util.Scanner;

/*
 * 1- bir yuk yeri secme metodumuz olsun
 * bu metot limandaki yukler dizisinden kendine bir yer belirlesin
 * eğer sınır dışı ise hatayı yakalayalım ve gösterelim
 * 2- Kendi exception sınıfımızı yaratalım () LimanAppException
 * daha sonra seçtiğim indexteki yer null değilse hata fırlatacağız
 * seçtiğiniz yer dolu ;
 * 
 */
public class Uygulama {
	
	Liman liman;
	static Scanner scanner = new Scanner(System.in);
	
	public Uygulama() {
		super();
		this.liman = new Liman(); 
	}
	
	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		try {
			uygulama.yukYeriSec();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Lütfen sınırlar dahilinde bir yer seçiniz");
		}
	}
	
	// eski method
	public Yuk yukSec(int yer) {
		if(yer < 0 || yer >= liman.getYukler().length)
			throw new IndexOutOfBoundsException("Yanlış yer seçtiniz.");
		
		Yuk yuk = liman.getYukler()[yer];
		if(yuk == null)
			throw new NullPointerException("Seçtiğiniz yerde bir yük yok.");
		
		return yuk;
	}
	
	public void yukYeriSec() {
		System.out.println("Lütfen bir yük yeri seçiniz");
		int index = scanner.nextInt();
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lütfen sınırlar dahilinde bir yer seçiniz");
		}
	}
	
	public void yukYeriSec2(int index) {
		if(index < 0 || index >= liman.getYukler().length)
			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);
		
		if(liman.getYukler()[index] != null)
			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
	}
	
}
