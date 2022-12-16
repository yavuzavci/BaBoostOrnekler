package com.bilgeadam.lesson028.queue;
/*
 * Müşteri kuyruğumuz olacak
 * bu müşteri kuyruğuna müşteri ekleyeceğiz
 * sonra da müşterileri işleme alacağız
 * 65 yaş üstü öncelikli olsun
 */

import java.util.List;
import java.util.PriorityQueue;

public class Banka {
	private PriorityQueue<Musteri> musteriKuyrugu;

	public Banka() {
		super();
		musteriKuyrugu = new PriorityQueue<Musteri>();
	}
	public Banka(List<Musteri> musteriler) {
		super();
		musteriKuyrugu = kuyrukOlustur(musteriler);
	}

	public PriorityQueue<Musteri> getMusteriKuyrugu() {
		return musteriKuyrugu;
	}

	public void setMusteriKuyrugu(PriorityQueue<Musteri> musteriKuyrugu) {
		this.musteriKuyrugu = musteriKuyrugu;
	}	
	
	public void musterileriYazdir() {
		while(!musteriKuyrugu.isEmpty()) {
			System.out.println(musteriKuyrugu.poll());
		}
	}
	
	private PriorityQueue<Musteri> kuyrukOlustur(List<Musteri> musteriler) {
		PriorityQueue<Musteri> kuyruk = new PriorityQueue<Musteri>();
		for(Musteri m : musteriler)
			kuyruk.offer(m);
		return kuyruk;
	}
	
}
