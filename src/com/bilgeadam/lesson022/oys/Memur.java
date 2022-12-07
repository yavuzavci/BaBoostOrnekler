package com.bilgeadam.lesson022.oys;

public class Memur extends Calisan implements IOgrenciIsleri{

	public Memur(String isim, String soyisim, int calismaSaati, double maas) {
		super(isim, soyisim, calismaSaati, maas);
	}

	public Memur(String isim, String soyisim) {
		super(isim, soyisim);
	}

	@Override
	public Ogrenci ogrenciKaydi() {
		String isim = OysUtility.stringDegerAlma("Lütfen öğrencinin ismini girin");
		String soyisim = OysUtility.stringDegerAlma("Lütfen öğrencinin soyismini girin");
		String adres = OysUtility.stringDegerAlma("Lütfen öğrencinin adresini girin");
		return new Ogrenci(isim,soyisim,adres);
	}

	@Override
	public boolean ogrenciKaydiSil(String ogrenciNo) {
		
		return false;
	}

	@Override
	public void bilgilendirmeYap(Ogrenci ogrenci) {
		
	}

	@Override
	public boolean dersKaydiOnayla(Ders ders, Ogrenci ogrenci) {
		
		return false;
	}
	
	@Override
	public void ogretmenlerListesi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ogrencilerListesi() {
		
		for (Ogrenci ogrenci : Okul.ogrenciListesi) {
			System.out.println(ogrenci.toString());
		}
		
	}
	
	@Override
	public void menu() {
		int secim;
		
		do {
			super.menu();
			System.out.println("1- Öğrenci kaydı yap");
			System.out.println("2- Öğrenci kaydı sil");
			System.out.println("3- Bilgilendirme yap");
			System.out.println("4- Ders kaydı onayla");
			System.out.println("5- Öğretmenler listesi");
			System.out.println("6- Öğrenciler listesi");
			secim = OysUtility.intDegerAlma("Lütfen bir değer giriniz");
			islemler(secim);
		} while (secim != 0);
	}
	
	public void islemler(int secim) {
		switch(secim){
			case 1: 
				Ogrenci ogrenci = ogrenciKaydi();
				Okul.ogrenciListesi.add(ogrenci);
				System.out.println(ogrenci.getIsim() + " " + ogrenci.getSoyisim()  
									+ " adlı öğrenci başarıyla sisteme eklendi.");
				break;
			case 2: 
				//ogrenciKaydiSil();
				break;
			case 3: 
				//bilgilendirmeYap();
				break;
			case 4: 
				//dersKaydiOnayla();
				break;
			case 5: 
				ogretmenlerListesi();
				break;
			case 6: 
				ogrencilerListesi();
				break;
			default: break;
		}
	}
	
}
