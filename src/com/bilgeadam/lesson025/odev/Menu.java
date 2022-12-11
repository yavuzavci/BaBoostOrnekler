package com.bilgeadam.lesson025.odev;

public class Menu {
	
	private ECorbalar corba;
	private EGunler gun;
	private EIcecekler icecek;
	private ETatlilar tatli;
	private EYemekler yemek;
	
	
	public Menu(EGunler gun) {
		this.gun = gun;
	}

	public ECorbalar getCorba() {
		return corba;
	}

	public void setCorba(ECorbalar corba) {
		this.corba = corba;
	}

	public EGunler getGun() {
		return gun;
	}

	public void setGun(EGunler gun) {
		this.gun = gun;
	}

	public EIcecekler getIcecek() {
		return icecek;
	}

	public void setIcecek(EIcecekler icecek) {
		this.icecek = icecek;
	}

	public ETatlilar getTatli() {
		return tatli;
	}

	public void setTatli(ETatlilar tatli) {
		this.tatli = tatli;
	}

	public EYemekler getYemek() {
		return yemek;
	}

	public void setYemek(EYemekler yemek) {
		this.yemek = yemek;
	}
	
	@Override
	public String toString() {
		return getGun()
				+ "\nCORBA-> " + getCorba()
				+ "\nYEMEK-> " + getYemek()
				+ "\nTATLI-> " + getTatli()
				+ "\nICECEK-> " + getIcecek();
	}
	
}
