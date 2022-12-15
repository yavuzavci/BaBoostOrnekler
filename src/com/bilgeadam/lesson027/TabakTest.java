package com.bilgeadam.lesson027;

import java.util.Random;

public class TabakTest {
	
	public static void main(String[] args) throws InterruptedException {
		TabakManager manager = new TabakManager();
		manager.tabaklariOlustur();
		Random random = new Random();
		
		for(int i = 0; i < 50 ; i++) {
			int secim = random.nextInt(1,3);
			manager.rastgeleCalistir(secim);
			Thread.sleep(1000);
		}
	}
	
}
