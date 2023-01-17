package com.bilgeadam.lesson044.factory2;

/*
 * 
 * Boy
 * fiyatı
 * malzemeleri
 * tür (Ad)
 * Hamur tipi;
 * 
 * 2 tane Alt sınıf oluşturalım biri Vejeteryan Pizza 
 * -EtliPizza olsun daha sonra bir pizzafactory oluşturacağız
 * -pizzaSec metodunda yaptığımız secimlere göre factory sınıfından bize bir pizza dönecek
 * 
 */
public abstract class Pizza {

	ETur tur;
	EBoyut boyut;
	EHamurTipi hamurTipi;
	double fiyat;
	String[] malzemleri;

	public Pizza(ETur tur, EBoyut boyut, EHamurTipi hamurTipi) {
		super();
		this.tur = tur;
		this.boyut = boyut;
		this.hamurTipi = hamurTipi;
	}

	@Override
	public String toString() {
		return "Pizza [tur=" + tur + ", boyut=" + boyut + ", hamurTipi=" + hamurTipi + ", fiyat=" + fiyat + "]";
	}

}
