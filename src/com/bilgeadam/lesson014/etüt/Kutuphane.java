package com.bilgeadam.lesson014.etüt;

public class Kutuphane {
	
	static int boyut;
	static int index = 0;
	Kitap[] kitapListesi;
	Yazar[] yazarListesi;
	static int yazarIndex = 0;
	
	public Yazar yazarKontrol(String yeniIsim) {
		Yazar yeniYazar = new Yazar();
		if(yazarListesi == null) {
			yazarListesi = new Yazar[50];
			yeniYazar.isim = yeniIsim;
			yazarListesi[yazarIndex] = yeniYazar;
			yazarIndex++;
		}
		
		else {
			for (int i = 0; i < yazarListesi.length; i++) {
				if(yazarListesi != null) {
					if(!yazarListesi[i].isim.equals(yeniIsim)) {
						yeniYazar.isim = yeniIsim;
						yazarListesi[yazarIndex] = yeniYazar;
						yazarIndex++;
					}
					else {
						System.out.println("Yazar database de kayıtlıdır");
						return yazarListesi[i];
					}
				}
			}
		}
		
		return yeniYazar;
	}
}
