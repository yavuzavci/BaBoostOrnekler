package com.bilgeadam.lesson026.futbolapp;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		Takim takim1 = new Takim("Ev Sahibi");
		Takim takim2= new Takim("Deplasman");
		List<Takim> takimlar = new ArrayList<Takim>();
		takimlar.add(takim1);
		takimlar.add(takim2);
		
		Mac mac = new Mac(60000,takimlar);		
		mac.mac();
	}
	
}
