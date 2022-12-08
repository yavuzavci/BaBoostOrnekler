package com.bilgeadam.lesson024.database;

public class Veri {
	private int id;
	private String icerik;
	
	public Veri(int id) {
		this.id = id;
		this.icerik = "";
	}
	public Veri(int id, String icerik) {
		this.id = id;
		this.icerik = icerik;
	}
	public String getIcerik() {
		return icerik;
	}
	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Veri -> id = " + id + " icerik = " + icerik;
	}
	
}
