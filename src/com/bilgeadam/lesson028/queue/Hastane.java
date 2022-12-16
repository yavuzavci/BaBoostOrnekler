package com.bilgeadam.lesson028.queue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hastane {
	
	public static Queue<Hasta> hastaKuyrugu;
	
	public static void main(String[] args) {
		Hasta hasta1 = new Hasta("Deniz",ESikayet.APANDISIT);		
		Hasta hasta2 = new Hasta("Betül",ESikayet.BASAGRISI);
		Hasta hasta3 = new Hasta("Can",ESikayet.YANIK);
		Hasta hasta4 = new Hasta("Ali",ESikayet.BASAGRISI);
		Hasta hasta5 = new Hasta("Ege",ESikayet.BASAGRISI);
		Hasta hasta6 = new Hasta("Fırat",ESikayet.APANDISIT);
		Hasta hasta7 = new Hasta("Gökhan",ESikayet.YANIK);
		
		List<Hasta> hastalar = Arrays.asList(hasta1,hasta2,hasta3,
				hasta4,hasta5,hasta6,hasta7);
		
		hastaKuyrugu = hastaKuyrugunuAl(hastalar);
		hastaKuyrugunuYazdir(hastaKuyrugu);
	}
	
	private static Queue<Hasta> hastaKuyrugunuAl(List<Hasta> hastalar){
		Queue<Hasta> kuyruk = new PriorityQueue<Hasta>();
		for(Hasta h : hastalar)
			kuyruk.offer(h);
		
		return kuyruk;
	}
	
	private static void hastaKuyrugunuYazdir(Queue<Hasta> hastaKuyrugu) {
		while(!hastaKuyrugu.isEmpty()) {
			System.out.println(hastaKuyrugu.poll());
		}
	}
}
