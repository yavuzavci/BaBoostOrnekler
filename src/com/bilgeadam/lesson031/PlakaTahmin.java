package com.bilgeadam.lesson031;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 * -bu arrayden bir map olusturan metodu yazalım 
 * key degerleri plaka degerleri olsun value şehir olsun 
 * 1,2,3 
 * 
 * oyun sayısını 
 * hakkımız olsun () --> bir oyunda 3 kere tahminde bulunabiliriz 
 * 
 * menumuz olacak 
 * 
 * Sehir tahmin oyunana hosgeldiniz
 * Her oyun için 3 tahmin hakkınız bulunmaktadır 
 * 
 * 1-oyuna basla
 * 
 * 1.oyun (kacıncı oyundaysak)
 * 3 tahmin hakkımız var(herdefasında azalacak)
 * 
 * Random bir plaka uretecegiz 
 * ve kullanıcıya soru soracagız bu plaka hangi ile atittir 
 * kullanıcıdan gelen degere gore işlem yapacagız dogruysa bildiniz
 * yanlıssa tekrar deneyin cıktısını verip basa donecegiz (toplamda 3 tahmin hakkımız bulunmaktadır)
 * başarılı bildiğimiz zaman ve tahmin hakkımız kalmadıgı zman ana menuye donsun 
 * 
 * 
 * 2-Eski Tahminlerim=> 1den fazla oyun oynayabilirim 
 * her oyunun tahminlerini bir yerde tutacagım sonra burayı cagırdıgım zaman 
 * her oyunun tahminleri ayrı ayrı yazılsın  
 *  
 * 3- cıkıs
 * 
 * 
 */
public class PlakaTahmin {
	
	private int oyunSayisi;
	private int hak;
	private Map<Integer, List<String>> eskiTahminler; 

	private final String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };
	
	private Map<Integer, String> illerMap;
	
	public PlakaTahmin() {
		oyunSayisi = 0; 
		hak = 3;
		illerMap = plakalariAta(iller);
		eskiTahminler = new LinkedHashMap<>();		
	}
	
	public void menu() {
		int secim = 3;
		
		do {
			System.out.println("Şehir tahmin oyunana hosgeldiniz");
			System.out.println("Her oyun için 3 tahmin hakkınız bulunmaktadır");
			System.out.println("=============================================");
			System.out.println("1 - Oyuna Başla");
			System.out.println("2 - Eski Tahminlerim");
			System.out.println("3 - Çıkış");
			secim = Utility.intDegerAlma("Lütfen bir seçim yapınız");
			switch(secim) {
				case 1:
					oyna();
					break;
				case 2:
					tahminleriYazdir();
					break;
				case 3:
					break;
				default:
					break;
			}
		} while (secim != 3);		
	}	
	
	private void oyna() {
		int plaka = rastgelePlakaUret();
		oyunSayisi++;
		tahminEt(plaka);
	}
	
	private void tahminEt(int plaka) {
		List<String> tahminler = new ArrayList<String>();
		System.out.println(plaka + " plaka kodu hangi ile aittir?");
		
		while(hak != 0) {
			String tahmin = Utility.stringDegerAlma("Lütfen tahmininizi yazınız");
			tahminler.add(tahmin);
			if(illerMap.get(plaka).equalsIgnoreCase(tahmin)) {
				System.out.println("Tebrikler, Bildiniz!");
				hak = 3;
				break;
			}
			hak--;
			if(hak != 0)
				System.out.println("Bilemediniz. "+ hak + " hakkınız kaldı.");			
			else {
				System.out.println("Bilemediniz.\nHakkınız kalmadı.");
				hak = 3;
				break;
			}
		}
		
		eskiTahminler.put(oyunSayisi, tahminler);
	}
	
	private void tahminleriYazdir() {
		eskiTahminler.forEach((k,v) ->
			System.out.println(k + ". oyunun tahminieri = " + v)
		);
	}
	
	private Map<Integer, String> plakalariAta(String[] iller) {
		Map<Integer, String> map = new LinkedHashMap<>();
		int k = 0;
		for (String il : iller)
			map.put(++k, il);
		return map;
	}	
	
	private int rastgelePlakaUret() {
		return Utility.rastgeleSayiUret(1, 82);
	}

}
