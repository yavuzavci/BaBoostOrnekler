package com.bilgeadam.lesson026.futbolapp;

import static com.bilgeadam.lesson026.futbolapp.utility.FutbolUtility.random;

import java.util.ArrayList;
import java.util.List;

public class Mac {
	private long sure;	
	private List<Takim> takimlar;
	private int[] macSkoru;
	public Mac() {
		this.takimlar = new ArrayList<>();
		macSkoru = new int[2]; // ev sahibi - deplasman
		takimlar.add(new Takim("Ev Sahibi"));
		takimlar.add(new Takim("Deplasman"));
	}
	
	public Mac(int sure, List<Takim> takimlar) {
		this.takimlar = takimlar;
		this.sure = setSure(sure);
		macSkoru = new int[2];
	}	
	
	public long getSure() {
		return sure;
	}

	public long setSure(long sure) {
		return this.sure = sure + System.currentTimeMillis();
	}

	public List<Takim> getTakimlar() {
		return takimlar;
	}

	public void setTakimlar(List<Takim> takimlar) {
		this.takimlar = takimlar;
	}

	public int[] getMacSkoru() {
		return macSkoru;
	}

	public void setMacSkoru(int[] macSkoru) {
		this.macSkoru = macSkoru;
	}

	public boolean pasKontrol(AktifFutbolcu f) {
		for(int i = 0; i < 3;i++) {
//			int pas = random.nextInt(1,12);
//			AktifFutbolcu f = this.evSahibi.getFutbolcular().get(pas);
			if(f.pasVer()) {
				System.out.println(f.getFormaNo() + " numaralı oyuncu pas verdi");
			}
			else {
				System.out.println(f.getFormaNo() + " numaralı oyuncu pas veremedi");
				return false;
			}
		}
		return true;
	}
	
	public Takim takimDegistir(Takim takim) {
		int teamIndex = takimlar.indexOf(takim); // 0-1
		if(teamIndex == 1)
			teamIndex = 0;
		else
			teamIndex = 1;
		return takimlar.get(teamIndex);
		
	}
	
	public Takim takimDegistir2(Takim takim) {
		if(takimlar.get(0).equals(takim))
			return takimlar.get(1);
		else
			return takimlar.get(0);
		
	}
	
	public void oyna(Takim takim) throws InterruptedException {
		int index = passKontrol(12);
		
		for (int i = 0; i < 3; i++) {
			List<AktifFutbolcu> futbolcular = takim.getFutbolcular();
			if(futbolcular.get(index).pasVer()) {
				int pasAlacakOyuncuIndex = passKontrol(index);
				System.out.println(takim.getAd() + " adlı takımdan " + futbolcular.get(index).getFormaNo()
						+ " nolu oyuncu " + futbolcular.get(pasAlacakOyuncuIndex).getFormaNo() + " pas atıyor");
				index = pasAlacakOyuncuIndex;
				Thread.sleep(1500L);
			}
			else {
				System.out.println(takim.getAd() + " adlı takımdan " + futbolcular.get(index).getFormaNo()
						+ " nolu oyuncunun pası başarısız oldu !!! 	");
				takim = takimDegistir(takim);
				System.out.println("Top " + takim.getAd() + " takımına geçti !!! ");
				i = -1;
				Thread.sleep(1500);
			}
			
		}
		System.out.println(takim.getAd() + " adlı takım gol vuruşu yapıyor");
		golVurusu(takim.getFutbolcular().get(index), takim);
		takim = takimDegistir(takim);
		
	}
	
	public void golVurusu(AktifFutbolcu futbolcu, Takim takim) throws InterruptedException {
		Kaleci kaleci = takimDegistir(takim).getKaleci();
		System.out.println("Kaleci topa uzanıyor........");
		Thread.sleep(1500);
		if(futbolcu.golVurusu(kaleci.kurtarisSkoruHesapla())) {
			System.out.println("Gol gol gol");
			int takimIndex = takimlar.indexOf(takim);
			macSkoru[takimIndex]++;
			System.out.println(futbolcu.getFormaNo() + " nolu futbolcu golü atıyor.....!!!");
			skorGoster();
		}
		else {
			System.out.println(futbolcu.getFormaNo() + " nolu futbolcu golü kaçırdı.....!!!");
		}
	}
	
	public void skorGoster() {
		System.out.println("Maç skoru");
		System.out.println(takimlar.get(0).getAd() + ": " + macSkoru[0] + " - " + takimlar.get(1).getAd() + ": " + macSkoru[1]);
	}
	
	public Takim yaziTura() {
		int index = random.nextInt(2);
		return takimlar.get(index);
	}
	
	public int passKontrol(int index) {
		int oyuncuIndex = random.nextInt(10);
		while(index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}
		return oyuncuIndex;
	}
	
	public void mac() throws InterruptedException {
		System.out.println("Yazı tura atılıyor ve maça .... ");
		Thread.sleep(1000);
		Takim takim = yaziTura();
		System.out.println(takim.getAd() + " başlıyor.");
		
		while(sure > System.currentTimeMillis()) {
			if(sure == System.currentTimeMillis()) break;
			oyna(takim);
			System.out.println((sure - System.currentTimeMillis()) / 1000 + " saniye kaldı");			
		}
		System.out.println("Maç sonu.");
		skorGoster();
	}
	
}
