package com.bilgeadam.lesson024.database;

import java.util.ArrayList;

public abstract class Database {
	protected String url;
	protected String database;
	protected final ArrayList<Veri> veriListesi = new ArrayList<Veri>();
	private int idIndex = 0;
	
	public abstract boolean ekle(Veri veri);
	public abstract boolean sil(String icerik);
	public abstract boolean guncelle(Veri veri);
	public abstract void listele();
	public abstract void login();
	
	public int getIdIndex() {
		return ++idIndex;
	}
}
