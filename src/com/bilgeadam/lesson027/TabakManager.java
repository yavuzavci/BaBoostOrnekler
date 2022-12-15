package com.bilgeadam.lesson027;

import java.util.Random;
import java.util.Stack;
/*
 * Rastgele 1 ya da 2 gelecek bir seçim üreteceğiz
 * sonra bu seçime göre metotta bir işlem seçtireceğiz
 * 1 gelmişse temizle
 * 2 gelmişse kullan metodu çalışsın
 */
public class TabakManager {
	
	private Stack<Tabak> temizler;
	private Stack<Tabak> kirliler;
	
	public TabakManager() {
		temizler = new Stack<Tabak>();
		kirliler = new Stack<Tabak>();
	}	

	public Stack<Tabak> getTemizler() {
		return temizler;
	}

	public void setTemizler(Stack<Tabak> temizler) {
		this.temizler = temizler;
	}

	public Stack<Tabak> getKirliler() {
		return kirliler;
	}

	public void setKirliler(Stack<Tabak> kirliler) {
		this.kirliler = kirliler;
	}	
	
	public void tabaklariOlustur() {
		Random random = new Random(System.currentTimeMillis());
		for(int i = 0; i < 10; i++) {
			Tabak tabak = new Tabak(i,random.nextBoolean());
			if(tabak.isKirliMi())
				kirliler.push(tabak);
			else
				temizler.push(tabak);
		}			
	}
	
	public void tabaklariYazdir(Stack<Tabak> stack) {
		while(!stack.isEmpty())
			System.out.println(stack.pop());		
	}
	
	public void kullan() {
		if(!temizler.isEmpty()) {
			Tabak tabak = temizler.pop();
			tabak.setKirliMi(true);
			kirliler.push(tabak);
			System.out.println(tabak.getId() + " ID li tabak kullanılmıştır.");
		}
		else {
			System.out.println("Temiz tabak kalmamıştır.");
			temizle();
		}
			
	}
	
	public void temizle() {
		if(!kirliler.isEmpty()) {
			Tabak tabak = kirliler.pop();
			tabak.setKirliMi(false);
			temizler.push(tabak);
			System.out.println(tabak.getId() + " ID li tabak temizlenmiştir.");
		}
		else {
			System.out.println("Kirli tabak kalmamıştır.");
			kullan();
		}
			
	}
	
	public void rastgeleCalistir(int secim) {		
		switch(secim) {
			case 1: 
				temizle();
				break;
			case 2:
				kullan();
				break;
			default:
				break;
		}
	}
}
