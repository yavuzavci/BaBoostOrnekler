package com.bilgeadam.lesson007;



public class Question31 {
	
	public static void main(String[] args) {
		String[] stringArray = new String[4];
		String[] stringArray3 = { "Kelime", "Kelime2" };
		// String stringArray2[] = new String[4];
		boolean[] booleanArray = new boolean[4];
		booleanArray[0] = false;
		booleanArray[booleanArray.length - 1] = true;
		boolean[] booleanArray2 = { false, false, true };
		System.out.println(booleanArray2.length); //3
		System.out.println(booleanArray[3]);
		booleanArray[3] = false;
		System.out.println(booleanArray[3]);
		System.out.println(booleanArray[1]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray3[0]);
		System.out.println(stringArray3[1]);
		
		Integer[] integerArray = new Integer[2];
		/// wrapper classlar ile primitive türler konusundaki ilişkiyi araştırınız.
	}	
}
