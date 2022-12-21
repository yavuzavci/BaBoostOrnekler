package com.bilgeadam.etut.lesson031;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Uygulama implements ICrud {
	
	Kitaplik kitaplik;

	public Uygulama(Kitaplik kitaplik) {
		super();
		this.kitaplik = kitaplik;
	}
	
	public Uygulama() {
		super();
		this.kitaplik = new Kitaplik();
	}
	
	public Yazar yazarKontrol(String yazarIsmi) {
		 if(kitaplik.getIsmeGoreYazarlar().containsKey(yazarIsmi)) {
			 System.out.println("Yazar daha önce eklenmiş");
			 return kitaplik.getIsmeGoreYazarlar().get(yazarIsmi);
		 }
		 else {
			 int yas = Utility.intDegerAlma("Yazarın yaşını giriniz");
			 Yazar yazar = new Yazar(yazarIsmi, yas);
			 kitaplik.getIsmeGoreYazarlar().put(yazarIsmi, yazar);
			 return yazar;
		 }
	}

	@Override
	public void kitapEkle() {
		String ad = Utility.stringDegerAlma("Lütfen kitap ismini giriniz");
		int sayfaSayisi = Utility.intDegerAlma("Lütfen kitabın sayfa sayısını giriniz");
		String yazarIsimSoyisim = Utility.stringDegerAlma("Lütfen yazar ismini giriniz");
		Yazar yazar = yazarKontrol(yazarIsimSoyisim);
		Kitap kitap = new Kitap(ad, sayfaSayisi, yazar);
		kitaplik.getKitaplar().add(kitap);
		yazar.getKitaplar().add(kitap);
		kitaplik.getYazaraGoreKitaplar().put(yazar, yazar.getKitaplar());
		ismeGoreKitapEkle(kitap, ad, kitaplik.getIsmeGoreKitaplar());
	}

	private void ismeGoreKitapEkle(Kitap kitap, String ad, Map<String, List<Kitap>> map) {
		List<Kitap> kitaplar = new ArrayList<>();
		for (int i = 0; i < kitaplik.getKitaplar().size(); i++) {
			if(map.containsKey(ad)) {
				kitaplar = map.get(ad);
				kitaplar.add(kitap);
			}
			else {
				kitaplar.add(kitap);
			}
		}
		
	}

	@Override
	public void kitapSil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kitap ismeGoreKitapBul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kitap> yazarinKitaplariniBul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kitap> kitaplariListele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Yazar> yazarlariListele() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
