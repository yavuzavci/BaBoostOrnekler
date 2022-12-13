package com.bilgeadam.lesson026.futbolapp;

import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.FORVETMAXARALIK;
import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.FORVETMINARALIK;
import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.random;

public class Forvet extends AktifFutbolcu {
	
	private int bitiricilik; 
	private int ilkDokunus;
	private int kafa;
	private int ozelYetenek;
	
	public Forvet(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.bitiricilik = rastgeleYetenekPuaniAta();
		this.ilkDokunus = rastgeleYetenekPuaniAta();
		this.kafa = rastgeleYetenekPuaniAta();
		this.ozelYetenek = rastgeleYetenekPuaniAta();
	}

	public int getBitiricilik() {
		return bitiricilik;
	}

	public void setBitiricilik(int bitiricilik) {
		this.bitiricilik = bitiricilik;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Forvet [bitiricilik=").append(bitiricilik).append(", ilkDokunus=").append(ilkDokunus)
				.append(", kafa=").append(kafa).append(", ozelYetenek=").append(ozelYetenek).append(", getAdSoyad()=")
				.append(getAdSoyad()).append(", getFormaNo()=").append(getFormaNo()).append(", getDayaniklilik()=")
				.append(getDayaniklilik()).append(", getHiz()=").append(getHiz()).append(", getPas()=").append(getPas())
				.append(", getSut()=").append(getSut()).append(", getYetenek()=").append(getYetenek())
				.append(", getKararlilik()=").append(getKararlilik()).append(", getDogalForm()=").append(getDogalForm())
				.append(", getSans()=").append(getSans()).append("]");
		return builder.toString();
	}
	
	@Override
	public int rastgeleYetenekPuaniAta() {
		return random.nextInt(FORVETMINARALIK, FORVETMAXARALIK);
	}
	
	@Override
	public int pasSkoruHesapla() {
		int bonus = random.nextInt(1, 6);
		return (int) (this.getPas() * 0.2 
				+ this.getYetenek() * 0.2
				+ this.ozelYetenek * 0.2
				+ this.getDayaniklilik() * 0.1
				+ this.getDogalForm() * 0.1
				+ this.getSans() * 0.1
				+ bonus);
	}

	@Override
	public int golSkoruHesapla(int kurtaris) {
		int bonus = (int) (random.nextInt(1, 5) * this.getDogalForm() * 0.075);
		return (int) (this.getYetenek() * 0.2
				+ this.ozelYetenek * 0.2
				+ this.getSut() * 0.1
				+ this.getIlkDokunus() * 0.1
				+ this.getKararlilik() * 0.1
				+ this.getSans() * 0.1
				+ this.kafa * 0.1
				+ this.bitiricilik * 0.2
				+ this.getDogalForm() * 0.1
				+ bonus
				- kurtaris);
	}
	
}
