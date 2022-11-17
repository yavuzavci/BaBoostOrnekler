package com.bilgeadam.lesson008;

public class Question39 {

	/*
     * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3 katı
     * ise bilge 5 ise adam hem3 ve hem 5 ise bilgeadam yazdıralım int start=2; int
     * end=22; çıktı [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge]
     *
     *
     */
	
	
	/**
	 * hatalarım var, düzeltilmiş halini yazıyorum.
	 * @author Yavuz
	 */
	public static void main(String[] args) {
		//String[] array = null;
		int start=2,end=22;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Başlangıcı girin..: ");
//		start = scanner.nextInt();
//		System.out.print("Bitişi girin......: ");
//		end = scanner.nextInt();
//		scanner.close();	
		
		String[] array = new String[end - start + 1];
		
		for (int i = 0; i < array.length; i++) {
			int sayi = i + start;
			if(sayi % 15 == 0) array[i] = "BilgeAdam";
			else if(sayi % 3 == 0) array[i] = "Bilge";
			else if (sayi % 5 == 0) array[i] = "Adam";
			else array[i] = sayi + ""; //String.valueOf(start);
		}
		
		System.out.println("Başlangıç : " + start);
		System.out.println("Bitiş : " + end);
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {			
			if(i == array.length - 1)
				System.out.print(array[i]);
			else
				System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}

}
