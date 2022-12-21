package com.bilgeadam.etut.lesson031;

import java.util.List;

public interface ICrud {
	void kitapEkle();
	void kitapSil();
	Kitap ismeGoreKitapBul();
	List<Kitap> yazarinKitaplariniBul();
	List<Kitap> kitaplariListele();
	List<Yazar> yazarlariListele();
}
