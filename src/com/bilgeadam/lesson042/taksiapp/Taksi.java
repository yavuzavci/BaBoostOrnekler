package com.bilgeadam.lesson042.taksiapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Taksilerimizin her biri bir thread olacak
 * 
 * taksilerde -> id,musterisayisi,musterilerin idsinin tutulduğu bir liste, bekleme süresi
 * 
 * bekleme süresi random long bir değer oluşturalım 1000 - 5000 arasında olsun
 * 
 * durağımızda taksilerimiz olacak
 * durağımızda bir müşteri kuyruğumuz olacak 
 * bu kuyrukta müşterilerimizin id si tutulacak
 * kuyruğumuzda 100 tane müşteri olsun
 * durağımızda da 10 tane taksi olsun
 * 
 * 
 * kuyruğumuz boşalana kadar taksilerimiz sıra ile kuyruğumuzdan müşterileri alsın.
 * 
 * kuyruktan aldığı müşteri no sunu kendi içinde tuttuğu listeye eklesin
 * 1. no lu taksi 5. müşterisini aldı ----> musteri idsi --> 8
 * daha sonra taksimiz bekleme süresi kadar bekleyip döngümüze devam etsin.
 * döngümüz sona erdiğinde de 
 * 1 no lu taksi toplamda -> 20 müşteri aldı ve mesaisi sona erdi
 * 
 * 
 */
public class Taksi extends Thread {
	private long taksiId;
	private int musteriSayisi;
	private List<Integer> musteriListesi;
	private long beklemeSuresi;
	
	
	public Taksi(long taksiId) {
		this.taksiId = taksiId;
		musteriSayisi = 0;
		musteriListesi = new ArrayList<>();
		beklemeSuresi = new Random().nextLong(1000, 5001);
	}
	
	public long getTaksiId() {
		return taksiId;
	}
	
	public void setTaksiId(int taksiId) {
		this.taksiId = taksiId;
	}
	
	public int getMusteriSayisi() {
		return musteriSayisi;
	}
	
	public void setMusteriSayisi(int musteriSayisi) {
		this.musteriSayisi = musteriSayisi;
	}
	public List<Integer> getMusteriListesi() {
		return musteriListesi;
	}
	
	public void setMusteriListesi(List<Integer> musteriListesi) {
		this.musteriListesi = musteriListesi;
	}
	
	public long getBeklemeSuresi() {
		return beklemeSuresi;
	}

	public void setBeklemeSuresi(long beklemeSuresi) {
		this.beklemeSuresi = beklemeSuresi;
	}

	@Override
	public String toString() {
		return "Taksi [taksiId=" + taksiId + ", musteriSayisi=" + musteriSayisi + ", musteriListesi=" + musteriListesi + "]";
	}
	
	@Override
	public void run() {
		while(!Durak.musteriKuyrugu.isEmpty()) {
			Integer musteri = Durak.musteriKuyrugu.poll();
			musteriListesi.add(musteri);
			System.out.println(taksiId + " no lu taksi -> " 
					+ musteriListesi.size() + ". müşterisini aldı "
					+ "---> müşteri id si ---> " + musteri);
			try {
				Thread.sleep(beklemeSuresi);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		musteriSayisi = musteriListesi.size();
		
		System.out.println(taksiId + " no lu taksi toplamda "
				+ " -> " + musteriSayisi + " müşteri aldı ve mesaisi sona erdi.");
	}
}
