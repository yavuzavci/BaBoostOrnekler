package com.bilgeadam.lesson025.sepet;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * bu ürünleri enum da tutalım
 * 
 * daha sonra sepet clasımızda bir ürün array i olsun
 * bu ürün arrayi de urun enumunu referans alsın (String)
 * 
 * bir de sepetimiz olsun String bir liste
 * 
 * bir menümüz olsun
 * 1- ürünleri listele /// 1-Cips 2-kola .... x-süt 
 * 2- sepete ürün ekle
 * (1 e bastığımızda sepete cipsi eklesin
 *    2 ye bastığımızda kolayı eklesin)
 * 3- sepeti yazdır
 */
public class Sepet {
	
	String[] urunler;	
	List<String> sepet;
	
	public Sepet() {
		urunListesiOlustur();
		this.sepet = new ArrayList<String>();
	}
	
	public void menu() {
		int secim;
		do {
			System.out.println("1- Ürünleri listele");
			System.out.println("2- Sepete ürün ekle");
			System.out.println("3- Sepeti yazdır");
			secim = Utility.intDegerAlma("Lütfen bir işlem seçiniz");			
			switch(secim) {
				case 1:
					urunleriListele();
					break;
				case 2:
					urunEkle();
					break;
				case 3:
					sepetiGoster();
					break;
				default:
					break;
			}
		} while (secim != 0);
		
	}
	
	public void urunleriListele() {
		int i = 1;
		for(String urun : urunler) {
			System.out.println(i + "-" + urun);
			i++;
		}
			
	}
	
	public void urunListesiOlustur() {
		urunler = new String[EUrun.values().length];
		for (int i = 0; i < urunler.length; i++) {
			urunler[i] = EUrun.values()[i].toString();
		}
	}
	
	public void urunEkle() {
		urunleriListele();
		int secim = Utility.intDegerAlma("Lütfen bir işlem seçiniz");			
		sepet.add(urunler[secim - 1]);
	}
	
	public void sepetiGoster() {
		for(String urun : sepet)
			System.out.println(urun);
	}
	
}
