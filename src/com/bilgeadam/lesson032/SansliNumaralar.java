package com.bilgeadam.lesson032;

import static com.bilgeadam.lesson032.Utility.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/*
 * 
 * 1 den 100 e kadar rastgele
 * 10 000 tane sayı ureteceğiz 
 * 1- sayıolustur metodu ile rastgele olusturduğumuz sayıları map a atacağız 
 * sayının kaç kere olduğunu tutacağız key değeri sayı 
 * value değeri ise kaç kere üretildiği.
 * 
 * 
 * 2-map de gezinirken  listeye ekleyeceğiz her elaman
 *  ne kadar tekrar ediyorsa o kadar
 * kez listeye ekleyeceğiz
 * 
 * 3- en son listeden rastgele 10 adet değer alacğız ve bunu bir set e ekleyeceğiz 
 * önce listeyi karıştıralım Collections.shuffle();
 * ben bir set oluşturacağım bu setin içine 10 tane rakam atacağım
 *  
 *  
 */
public class SansliNumaralar {	
	
	private Map<Integer,Integer> sayiMap;
	private List<Integer> sayiListesi;
	private Set<Integer> sansliSayilar;
	
	public SansliNumaralar() {
		sayiMap = new HashMap<Integer,Integer>();
		sayiListesi = new ArrayList<Integer>();
		sansliSayilar = new TreeSet<Integer>();
	}
	
	public Map<Integer, Integer> getSayiMap() {
		return sayiMap;
	}

	public void setSayiMap(Map<Integer, Integer> sayiMap) {
		this.sayiMap = sayiMap;
	}

	public List<Integer> getSayiListesi() {
		return sayiListesi;
	}

	public void setSayiListesi(List<Integer> sayiListesi) {
		this.sayiListesi = sayiListesi;
	}

	public Set<Integer> getSansliSayilar() {
		return sansliSayilar;
	}

	public void setSansliSayilar(Set<Integer> sansliSayilar) {
		this.sansliSayilar = sansliSayilar;
	}

	public void sayiOlustur(){
		for (int i = 0; i < uretilenSayiMiktari; i++) {
			int sayi = rastgeleSayiUret();
			if(!sayiMap.containsKey(sayi))
				sayiMap.put(sayi, 1);
			else
				sayiMap.put(sayi, sayiMap.get(sayi) + 1);
		}
	}
	
	public void listeOlustur() {
		sayiMap.forEach((k,v) -> {
			for(int i = 0; i < v; i++)
				sayiListesi.add(k);
		});
	}
	
	public void sansliSayilariBul() {
		Collections.shuffle(sayiListesi);		
		while (sansliSayilar.size() <= setLimit) {
			int index = rastgeleSayiUret(0,sayiListesi.size());
			int sayi = sayiListesi.get(index);
			sansliSayilar.add(sayi);
			sayiListesi.remove(index);			
		}
	}
	
	public void sansliSayilariYazdir() {
		System.out.println("Şanslı Sayılar");
		int i = 1;
		for(int sayi : sansliSayilar) {
			System.out.println(i + ". şanslı sayı -> " + sayi);
			i++;
		}
	}
	
}
