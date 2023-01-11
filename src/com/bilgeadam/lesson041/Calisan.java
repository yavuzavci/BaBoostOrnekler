package com.bilgeadam.lesson041;

public class Calisan extends Thread {
	String isim;
	
	public Calisan(String isim) {
		this.isim = isim;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + " çalışıyor-----> " + (i + 1));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void calis() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + " calis methodu -----> " + (i + 1));
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
