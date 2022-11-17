package com.bilgeadam.lesson009;

import java.util.Iterator;

public class Question43 {
	//bir metot yazalım bu metot dizi içindeki tek elemanları alıp başka bir diziye atsın ve o diziyi yazdırsın.	
	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
	                { 189, 35, 56, 89, 8 } };
		int[] tekSayilar = tekSayilariAta2(matris); 
		//tekSayilariAta(matris);		
		yazdir(tekSayilar);
	}
	/**
	 * benim metodum. 
	 * @author Yavuz 
	 */
	public static void tekSayilariAta(int[][] dizi) {
		int tekSayiDiziBoyutu = 0;				
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if(dizi[i][j] % 2 == 1) {
					tekSayiDiziBoyutu++;
				}
			}
		}
		int[] tekSayilar = new int[tekSayiDiziBoyutu];
		int k = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if(dizi[i][j] % 2 == 1) {
					tekSayilar[k] = dizi[i][j];
					k++;
					if(k == tekSayiDiziBoyutu) k = 0;
				}
			}
		}		
		System.out.print("Matristeki tek sayılar..: ");
		for (int i = 0; i < tekSayilar.length; i++) {
			System.out.print(tekSayilar[i]+" ");
		}
		System.out.println();
	}
	/**
	 * hocanın metodu
	 */
	public static int[] tekSayilariAta2(int[][] dizi) {
		int[] teksayilar = new int[dizi.length * dizi[0].length];
		int sayac = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if(dizi[i][j] % 2 != 0) {
					teksayilar[sayac] = dizi[i][j];
					sayac++;
				}
			}
		}
		
		return teksayilar;
	}
	
	public static void yazdir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
	}

}
