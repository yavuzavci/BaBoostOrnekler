package com.bilgeadam.lesson020.pokemon;

public class Pokemon {
	
	private long id;
	private String ad;
	private String tur;
	private int can;
	private int guc;
	private int derece;
	private String[] handikap;
	private Kullanici kullanici;
	
	public void pokedex() {
		System.out.println("PokeDex");
		System.out.println("==================");
		System.out.println("id= " + id);
		System.out.println("ad= " + ad);
		System.out.println("tur= " + tur);
		System.out.println("can= " + can);
		System.out.println("guc= " + guc);
		System.out.println("derece= " + derece);		
	}
	
	public Pokemon() {
		can = 100;
	}	

	public Pokemon(long id, String ad, String tur, int can, int guc, int derece, String... handikap) {
		this.id = id;
		this.ad = ad;
		this.tur = tur;
		this.can = can;
		this.guc = guc;
		this.derece = derece;
		this.handikap = handikap;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int getGuc() {
		return guc;
	}

	public void setGuc(int guc) {
		this.guc = guc;
	}

	public int getDerece() {
		return derece;
	}

	public void setDerece(int derece) {
		this.derece = derece;
	}

	public String[] getHandikap() {
		return handikap;
	}

	public void setHandikap(String[] handikap) {
		this.handikap = handikap;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}
	
	
	
}
