package com.bilgeadam.lesson007;

// bir dizide ard arda gelen 2 indexteki sayı değeri 2 ise true yazdırıp döngü
// sonlansın
public class Question35 {

	public static void main(String[] args) {
		int[] sayilar = { 2, -256, 16, 1258, 5, 2 };
		boolean sonuc = false;
		for (int i = 0; i < sayilar.length - 1; i++) {
			if(sayilar[i] == 2 && sayilar[i + 1] == 2) {
				sonuc = true;
				break;
			}
		}

		System.out.println("Sonuç...: " + sonuc);
	}

}
