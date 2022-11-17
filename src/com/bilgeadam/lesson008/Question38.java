package com.bilgeadam.lesson008;

public class Question38 {

	public static void main(String[] args) {
		// bir dizide 13 var ise 13 ve bir sonraki 
		// eleman toplama eklenmeden toplam sonucu bulan kod
		int[] nums = { 1, 13, 13, 13, 5, 1 };
		int toplam = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 13) {
				if(nums.length > i + 1 && nums[i + 1] != 13)
					i++;
			}
			else {
				toplam+=nums[i];
			}
		}		
		
		/*
		 * çalışmayan çözüm
		 * 
		 * while(i < nums.length) {
			if (nums[i] == 13) i += 2;
			else {
				toplam += nums[i];
				i++;
			}
		}
		 * 
		 */
		
		System.out.println("Toplam...: " + toplam);
		
	}

}
