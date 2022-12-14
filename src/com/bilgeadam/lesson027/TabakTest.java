package com.bilgeadam.lesson027;

public class TabakTest {
	
	public static void main(String[] args) {
		TabakManager manager = new TabakManager();
		manager.tabaklariOlustur();
		for(int i = 0;i < 10; i++) {
			manager.kullan();
		}
	}
	
}
