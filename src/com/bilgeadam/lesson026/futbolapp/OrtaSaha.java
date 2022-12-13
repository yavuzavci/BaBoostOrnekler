package com.bilgeadam.lesson026.futbolapp;

import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.ORTASAHAMAXARALIK;
import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.ORTASAHAMINARALIK;
import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.random;

public class OrtaSaha extends AktifFutbolcu {
	
	private int uzunTop;
	private int ilkDokunus;
	private int topSurme;
	private int uretkenlik;
	private int ozelYetenek;
	
	public OrtaSaha(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.uzunTop = rastgeleYetenekPuaniAta();
		this.ilkDokunus = rastgeleYetenekPuaniAta();
		this.topSurme = rastgeleYetenekPuaniAta();
		this.uretkenlik = rastgeleYetenekPuaniAta();
		this.ozelYetenek = rastgeleYetenekPuaniAta();
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
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
		builder.append("OrtaSaha [uzunTop=").append(uzunTop).append(", ilkDokunus=").append(ilkDokunus)
				.append(", topSurme=").append(topSurme).append(", uretkenlik=").append(uretkenlik)
				.append(", ozelYetenek=").append(ozelYetenek).append(", getAdSoyad()=").append(getAdSoyad())
				.append(", getFormaNo()=").append(getFormaNo()).append(", getDayaniklilik()=").append(getDayaniklilik())
				.append(", getHiz()=").append(getHiz()).append(", getPas()=").append(getPas()).append(", getSut()=")
				.append(getSut()).append(", getYetenek()=").append(getYetenek()).append(", getKararlilik()=")
				.append(getKararlilik()).append(", getDogalForm()=").append(getDogalForm()).append(", getSans()=")
				.append(getSans()).append("]");
		return builder.toString();
	}
	
	@Override
	public int rastgeleYetenekPuaniAta() {
		return random.nextInt(ORTASAHAMINARALIK, ORTASAHAMAXARALIK);
	}
	
	@Override
	public int pasSkoruHesapla() {
		int bonus = random.nextInt(1, 8);
		return (int) (this.getYetenek() * 0.3
				+ this.getSut() * 0.2
				+ this.getKararlilik() * 0.1
				+ this.getSans() * 0.1
				+ this.getPas() * 0.2
				+ this.getDayaniklilik() * 0.1
				+ this.getDogalForm() * 0.1
				
				+ bonus);
	}

	@Override
	public int golSkoruHesapla(int kurtaris) {
		int bonus = (int) (random.nextInt(1, 6) * this.getDogalForm() * 0.075);
		return (int) (this.getYetenek() * 0.2
				+ this.ozelYetenek * 0.2
				+ this.getSut() * 0.2
				+ this.getIlkDokunus() * 0.1
				+ this.getKararlilik() * 0.1
				+ this.getSans() * 0.1
				+ this.getDogalForm() * 0.1				
				+ bonus
				- kurtaris);
	}
	
}
