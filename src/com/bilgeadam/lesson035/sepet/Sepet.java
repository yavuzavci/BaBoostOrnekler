package com.bilgeadam.lesson035.sepet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * 1- Urun sınıfımızda isim ve fiyat değerlerini tutacağız 
 * bunlar için gerekli get set ve constructor yapılarını kuracğız
 * 2- Sepette EUrun lerden bir arrayimiz olsun
 * - bir de ürün listemiz olsun.
 * - bir ürün oluştur metodu yapıp
 * - EUrun product arrayindeki enımların değeri ile ürün listemizi dolduralım.
 * 3- bir ürün fiyat map imiz olsun. bu map i urunler listesi üzerinden oluşturalım.
 * 
 * 4- urun ekle metodu ekleyelim listeden donup indexine göre seçebiliriz ya da 
 * String olarak girebiliriz
 * buradaki mapimize dışarıdan bir ürün ekleyeceğiz her seçişte bir tane ekleyecek
 * yani 1 er atacak
 * 
 * 5- 2 tane map imiz var 1.map sepet sepet üzerinde bir ürüne denk geldiğimde bu ürünün
 * kaç adet olduğunu biliyorum aynı ürün Urun fiyat mapinde de tutuluyor
 * aynı ürün ismiyle de diğer mapten fiyatı çekerim
 * bunu maptaki her eleman için yapacağız ve her bir eleman için bize double bir fiyat dönecek
 * bu fiyatları double bir listede toplayalım
 * ve daha sonra bu double listedeki değerleri toplayalım bu da bize sepetteki toplam fiyatı verecek
 */

public class Sepet {
	
	private final EUrun[] product = EUrun.values();
	private Map<String,Double> urunFiyatMap;
	private List<Urun> urunler;
	
	private Map<String,Integer> sepet;
	
	
	public Sepet() {
		urunler = new ArrayList<Urun>();
		urunFiyatMap = new HashMap<String,Double>();
		sepet = new HashMap<String,Integer>();
		urunOlustur();
		urunFiyatMapOlustur();
	}

	public List<Urun> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<Urun> urunler) {
		this.urunler = urunler;
	}	
	
	public Map<String, Double> getUrunFiyatMap() {
		return urunFiyatMap;
	}

	public void setUrunFiyatMap(Map<String, Double> urunFiyatMap) {
		this.urunFiyatMap = urunFiyatMap;
	}

	public void urunOlustur() {
		// klasik yöntem
//		for(EUrun urun : product) {
//			urunler.add(new Urun(urun.name(),urun.fiyat));
//		}		
		// stream yöntemi
		Arrays.stream(product).forEach(u -> urunler.add(new Urun(u.name(),u.fiyat)));
	}
	
	public void urunFiyatMapOlustur() {		
		urunFiyatMap = urunler.stream()
				.collect(Collectors.toMap(Urun::getIsim, Urun::getFiyat));
	}
	
	public void urunEkle() {
		System.out.println("Eklemek istediğiniz ürün adını giriniz");
		Scanner scanner = new Scanner(System.in);
		String urunAdi = scanner.nextLine();
		if(!sepet.containsKey(urunAdi))
			sepet.put(urunAdi, 1);
		else
			sepet.put(urunAdi, sepet.get(urunAdi) + 1);
	}
	
	public void sepetinToplamTutariniBul() {
		Double toplam2 = sepet.entrySet().stream()
				.map(urun -> urunFiyatMap.get(urun.getKey()) * urun.getValue())
                .reduce((s1, s2) -> s1 + s2).get();

        System.out.println("Sepetin toplam fiyatı -> " + toplam2);
	}
	
	public void urunleriListele() {
		urunFiyatMap.forEach((k,v) -> System.out.println(k+"="+v));
	}
	
	public void menu() {
		int kontrol = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("--------");
			System.out.println("1- UrunListesi göster");
			System.out.println("2- Ürün ekle");
			System.out.println("3- Sepeti göster");
			System.out.println("--------");
			System.out.println("Lütfen bir işlem seçiniz");
			kontrol = scanner.nextInt();
			switch(kontrol) {
				case 1:
					urunleriListele();
					break;
				case 2:
					urunEkle();
					break;
				case 3:
					sepetiGoster();
					break;
				case 0:
					break;
				default:
					break;
			}
		} while (kontrol != 0);
		scanner.close();
	}
	
	public void sepetiGoster() {
		sepet.forEach((k,v) -> System.out.println(k+"="+v));
		sepetinToplamTutariniBul();
	}
}
