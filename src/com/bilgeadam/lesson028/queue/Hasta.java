package com.bilgeadam.lesson028.queue;
/*
* isim
* şikayet
* öncelik özelliği 
* 
* şikayete göre önceliği belirliyeceğiz
* 
*      Apandisit ----> En yüksek öncelik
        Yanık -------> Orta Öncelik
        Baş Ağrısı ---> En düşük öncelik
* 
* önceliğe göre kuyruğumuzu oluşturacağız
* 
* 
*/

import static com.bilgeadam.lesson028.queue.ESikayet.*;

public class Hasta implements Comparable<Hasta>{
	private String isim;
	private ESikayet sikayet;
	private int oncelik;
	
	public Hasta() {
		isim = "";
		oncelikBelirle(sikayet);
	}
	
	public Hasta(String isim, ESikayet sikayet) {
		this.isim = isim;
		this.sikayet = sikayet;
		oncelikBelirle(sikayet);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}	

	public ESikayet getSikayet() {
		return sikayet;
	}

	public void setSikayet(ESikayet sikayet) {
		this.sikayet = sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}

	@Override
	public String toString() {
		return "Hasta [isim=" + isim + ", sikayet=" + sikayet + "]";
	}

	@Override
	public int compareTo(Hasta hasta) {
		if(hasta.oncelik > this.oncelik)
			return -1;
		else
			return 1;
	}
	
	private void oncelikBelirle(ESikayet sikayet) {
		switch (sikayet) {
        case APANDISIT: {
            this.oncelik = 1;
            break;
        }
        case YANIK: {
            this.oncelik = 2;
            break;
        }
        case BASAGRISI: {
            this.oncelik = 3;
            break;
        }
        default:
            throw new IllegalArgumentException("Unexpected value: " + sikayet);
        }
	}
	
}
