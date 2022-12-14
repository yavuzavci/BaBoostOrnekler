package com.bilgeadam.lesson027;

import java.util.Stack;

public class ParaSayma {
	/*
	 * bir stack oluşturacağız bu stack e 5 6 tane değer ekleyeceğiz
	 * 
	 * 100 tl den yüksek olanları toplam değerine ekleyelim. 
	 * küçük olanları da başka bir stack e ekleyelim.
	 * en sonunda toplamı ve yeni oluşturduğumuz stack i yazdıralım.
	 * 
	 */
	public static void main(String[] args) {
		int toplam = 0;
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> yeniStack = new Stack<>();
		stack.add(12);
		stack.add(432);
		stack.add(123);
		stack.add(54);
		stack.add(13);
		stack.add(32);
		stack.add(326);
		stack.add(40);
		
		while(!stack.isEmpty()) {
			int sayi = stack.pop();
			if(sayi > 100)
				toplam += sayi;
			else
				yeniStack.add(sayi);
		}
		
		System.out.println("Toplam....: " + toplam);
		yeniStack.forEach(i -> System.out.println(i));
	}
	
}
