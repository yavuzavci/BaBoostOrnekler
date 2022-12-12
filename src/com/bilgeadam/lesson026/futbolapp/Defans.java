package com.bilgeadam.lesson026.futbolapp;

import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.DEFANSMAXARALIK;
import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.DEFANSMINARALIK;
import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.random;

public class Defans extends AktifFutbolcu {
	
	private int pozisyonAlma;
	private int kafa;
	private int sicrama;
	
	public Defans(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.setDayaniklilik(getDayaniklilik());
		this.setDayaniklilik(getDayaniklilik());
		this.setHiz(getHiz());
		this.setPas(getPas());
		this.setSut(getSut());
		this.setYetenek(getYetenek());
		this.setKararlilik(getKararlilik());
		this.setDogalForm(getDogalForm());
		this.setSans(getSans());
		this.pozisyonAlma = rastgeleYetenekPuaniAta();
		this.kafa = rastgeleYetenekPuaniAta();
		this.sicrama = rastgeleYetenekPuaniAta();
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Defans [pozisyonAlma=").append(pozisyonAlma).append(", kafa=").append(kafa).append(", sicrama=")
				.append(sicrama).append(", getAdSoyad()=").append(getAdSoyad()).append(", getFormaNo()=")
				.append(getFormaNo()).append(", getDayaniklilik()=").append(getDayaniklilik()).append(", getHiz()=")
				.append(getHiz()).append(", getPas()=").append(getPas()).append(", getSut()=").append(getSut())
				.append(", getYetenek()=").append(getYetenek()).append(", getKararlilik()=").append(getKararlilik())
				.append(", getDogalForm()=").append(getDogalForm()).append(", getSans()=").append(getSans())
				.append("]");
		return builder.toString();
	}
	
	@Override
	public int rastgeleYetenekPuaniAta() {
		return random.nextInt(DEFANSMINARALIK, DEFANSMAXARALIK);
	}

	@Override
	public int pasSkoruHesapla() {
		int bonus = random.nextInt(0, 4);
		return (int) (this.getPas() * 0.2 
				+ this.getYetenek() * 0.2
				+ this.getDayaniklilik() * 0.1
				+ this.getDogalForm() * 0.1
				+ this.pozisyonAlma * 0.1
				+ this.getSans() * 0.2
				+ bonus);
	}

}
