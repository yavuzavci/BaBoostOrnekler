package com.bilgeadam.lesson008;

public class Question37 {
	
	/*
	 * int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
	 * 
	 * dizi içinde 1 ve 4 kaç kere geçtiğini ve 1 sayısının adeti 4 sayısının adetinden 
	 * büyükse true değilse false
	 */
	
	public static void main(String[] args) {
		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };
		
		int birSayaci = 0, dortSayaci = 0;
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == 1) birSayaci++;
			if(sayilar[i] == 4) dortSayaci++;
		}
		
		System.out.println(birSayaci > dortSayaci ? true : false);

	}

}
