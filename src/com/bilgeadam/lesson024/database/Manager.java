package com.bilgeadam.lesson024.database;

import com.bilgeadam.lesson024.enumornek.Utility;

public class Manager {
	
	// private IDatabase db;
	private Database db;
	
	public Manager(Database db) {
		this.db = db;
	}
	
	public void calistir() {
		int secim;
		db.login();
		do {
			menuBaslik();
			secim = Utility.intDegerAlma("Lütfen seçiminizi yapınız");
			switch(secim){
				case 1: 
					Veri veri = veriOlustur();
					db.ekle(veri);
					System.out.println("Veri başarıyla veri tabanına kaydedildi.");
					break;
				case 2:
					if(db.veriListesi.isEmpty())
						System.err.println("HATA: Veri tabanında veri yoktur. Silme işlemi başarısız.");
					else {
						String icerik = 
								Utility.stringDegerAlma("Lütfen silmek istediğiniz verinin içeriğini girin..: ");
						if(db.sil(icerik))
							System.out.println("Veri veri tabanından başarıyla silindi.");
						else
							System.err.println("HATA: " + icerik + " veri tabanında bulunamadı. Silme işlemi başarısız.");
					}
					break;
				case 3: 
					if(db.veriListesi.isEmpty())
						System.err.println("HATA: Veri tabanında veri yoktur. Güncelleme- işlemi başarısız.");
					else {
						int id = 
								Utility.intDegerAlma("Güncellemek istediğiniz verinin id sini yazınız");
						String icerik = 
								Utility.stringDegerAlma("Lütfen güncellemek istediğiniz verinin içeriğini giriniz");
						Veri yeniVeri = new Veri(id,icerik);						
						if(db.guncelle(yeniVeri))
							System.out.println("Veri başarıyla güncellendi.");
						else
							System.err.println("HATA: " + icerik + " veri tabanında bulunamadı. Güncelleme işlemi başarısız.");
					}
					break;
				case 4: 
					db.listele();
					break;
				default: break;
			}
		} while (secim != 0);
	}
	
	private void menuBaslik() {
		System.out.println("####### VERİ TABANI #######");
		System.out.println("1- Veri Ekle");
		System.out.println("2- Veri sil");
		System.out.println("3- Veri güncelle");
		System.out.println("4- Verileri listele");
	}
	
	private Veri veriOlustur() {
		int id = db.getIdIndex();
		String icerik = Utility.stringDegerAlma("Lütfen verinizin içeriğini girin..: ");
		return new Veri(id,icerik);
	}
}
