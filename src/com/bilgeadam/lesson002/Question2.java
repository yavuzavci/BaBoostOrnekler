package com.bilgeadam.lesson002;

public class Question2 {
/* Bir ürünün fiyatında %18 kdv %15 kar olduğunu biliyoruz
 * 
 *  bir ürün fiyatımız olsun elimizde
 * 
 *   bu ürün fiyatından ürünün ham fiyatını bulalım (karsız ve kdv siz)
 * 
 */
	public static void main(String[] args) {
		float satisFiyati = 300.0f, hamFiyat = 0, KDV = 0.18f,karPayi = 0.15f;
		float kdvsizFiyat = satisFiyati - (satisFiyati * KDV);
		System.out.println("Ürünün KDV siz fiyatı: " + kdvsizFiyat);
		hamFiyat = kdvsizFiyat - (kdvsizFiyat * karPayi) ;
		System.out.println("Ürünün ham fiyatı....: " + hamFiyat);
	}

}
