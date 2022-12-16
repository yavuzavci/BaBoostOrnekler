package com.bilgeadam.lesson028.queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * String bir kuyruk tanımlayacağız
 * 
 * bu kuyruğa 10-12 tane isim ekleyeceğiz
 * 
 * random 1-10 arası sayı üreteceğiz bu da bizim pide sayımız olacak
 * 
 * kuyruğa göre pideleri dağıtacağız
 * 
 * pide bittiğinde pide bitti yazalım
 * 
 * bir de pide alamayanları yazdıralım.
 * 
 */
public class RamazanPidesiKuyrugu {
	
	public static final Random random = new Random(System.currentTimeMillis());
	
	public static void main(String[] args) {
		int sira = 1;
		ArrayBlockingQueue<String> pideKuyrugu = new ArrayBlockingQueue<>(random.nextInt(10,12));
		
		while (pideKuyrugu.remainingCapacity() > 0) {
			pideKuyrugu.add("Kişi " + sira);
			sira++;
		}
		
		int pideSayisi = random.nextInt(1,11);
		
		while(pideSayisi > 0) {
			pideKuyrugu.remove();
			pideSayisi--;
		}
		
		if(pideKuyrugu.isEmpty())
			System.out.println("Kuyrukta pide almayan kalmamıştır.");
		else {
			System.out.println("Kuyrukta pide alamayan " + pideKuyrugu.size() + " kişi kalmıştır.");
			pideKuyrugu.forEach(System.out::println);
		}
	}

}
