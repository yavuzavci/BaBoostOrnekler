package com.bilgeadam.lesson007;
// dizide en büyük 2. sayıyı bulalım
public class Question34 {

	public static void main(String[] args) {
		int[] sayilar = { 1300, 120, 5, 85, -256, 16, 1258, 81, 14};

		int max = sayilar[0];
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < sayilar.length;i++) {
			if(sayilar[i] > max)
				max = sayilar[i];
		}
				
		for(int i = 0; i < sayilar.length;i++) {
			if(sayilar[i] < max && sayilar[i] > secondMax)
				secondMax = sayilar[i];
		}
		
		System.out.println("Max : " + max + " 2. Max : " + secondMax);
		
	}

}
