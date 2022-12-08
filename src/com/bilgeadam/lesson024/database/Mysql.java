package com.bilgeadam.lesson024.database;

public class Mysql extends Database{
	
	@Override
	public boolean ekle(Veri veri) {
		veriListesi.add(veri);
		return true;
	}

	@Override
	public boolean sil(String icerik) {
		for(int i = 0;i < veriListesi.size();i++) {
			if(veriListesi.get(i).getIcerik().equals(icerik)) {
				veriListesi.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean guncelle(Veri veri) {
		for(int i = 0;i < veriListesi.size();i++) {
			if(veriListesi.get(i).getId() == veri.getId()) {
				veriListesi.get(i).setIcerik(veri.getIcerik());
				return true;
			}
		}
		return false;
	}

	@Override
	public void listele() {
		if(veriListesi.isEmpty())
			System.out.println("");
		else {
			for(Veri veri: veriListesi)
				System.out.println(veri.toString());
		}
	}
	
	@Override
	public void login() {
		System.out.println("Veri tabanına başarıyla giriş yapıldı.");
	}

}
