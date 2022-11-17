package com.bilgeadam.lesson008;

public class Question41 {
	
	/*
	 * çarpım tablosu
	 * 1x1=1
	 * 1x2=2
	 * 
	 * 1 ile 10 arası,10 dahil
	 */
	
	public static void main(String[] args) {
		//int[][] array = new int[10][10];
		/*
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (i + 1) * (j + 1);
				System.out.println((i + 1) + "x" + (j + 1) +"="+ array[i][j]);
			}
		}
		*/
		
		//soruda arrayi string almamız gerekiyormuş, düzeltelim
		String[][] array = new String[10][10];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (i+1) + "x" + (j+1) + "=" + ((i+1) * (j+1));
			}			
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i][j]);
			}			
		}
		
	}

}
