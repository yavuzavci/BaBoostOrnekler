package com.bilgeadam.lesson011;

public class Question48 {
	// dizideki elemanlar arasındaki farkın en küçük olduğu değer nedir?
	public static void main(String[] args) {
		int[] array = { 1, 5, -4, 3 };
		System.out.println("En küçük fark..: " + enKucukFark(array));
	}
	
	public static int enKucukFark(int[] dizi) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < dizi.length; i++) {			
			if(i == dizi.length - 1) {
				if(Math.abs(dizi[i] - dizi[0]) < min)
					min = Math.abs(dizi[i] - dizi[0]);
			}			
			else {
				if(Math.abs(dizi[i] - dizi[i + 1]) < min)
					min = Math.abs(dizi[i] - dizi[i + 1]);
			}			
		}
		
		return min;
	}
	
}
