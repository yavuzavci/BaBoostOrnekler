package com.bilgeadam.lesson026.futbolapp;

import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.KALECIMAXARALIK;
import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.KALECIMINARALIK;
import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.random;

public class Kaleci extends Futbolcu {
	
	private int kurtaris;
	
	public Kaleci(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.kurtaris = rastgeleYetenekPuaniAta();
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kaleci [kurtaris=").append(kurtaris).append(", getAdSoyad()=").append(getAdSoyad())
				.append(", getFormaNo()=").append(getFormaNo()).append(", getDayaniklilik()=").append(getDayaniklilik())
				.append(", getHiz()=").append(getHiz()).append(", getPas()=").append(getPas()).append(", getSut()=")
				.append(getSut()).append(", getYetenek()=").append(getYetenek()).append(", getKararlilik()=")
				.append(getKararlilik()).append(", getDogalForm()=").append(getDogalForm()).append(", getSans()=")
				.append(getSans()).append("]");
		return builder.toString();
	}
	
	@Override
	public int rastgeleYetenekPuaniAta() {
		return random.nextInt(KALECIMINARALIK, KALECIMAXARALIK);
	}
	
}
