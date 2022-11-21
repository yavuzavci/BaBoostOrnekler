package com.bilgeadam.lesson012;

public class Question50 {
	
	public static void main(String[] args) {
		int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		frekans(dizi);
	}
	
	public static void frekans(int[] dizi) {
		boolean[] kontrol = new boolean[dizi.length];
		
		for (int i = 0; i < dizi.length; i++) {
			if(kontrol[i] == true) {
				continue;
			}
			int count = 1;
			
			for (int j = i + 1; j < dizi.length; j++) {
				if(dizi[i] == dizi[j]) {
					kontrol[j] = true;
					count++;
				}
			}
			
			System.out.println(dizi[i] +" sayisi "+ count + " kere tekrar etmiştir");
			
		}
	}	
	
}
