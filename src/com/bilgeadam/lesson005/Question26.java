package com.bilgeadam.lesson005;
// Dışarıdan bir kelime girin
// başına index numarası kullanarak alt alta yazdırınız.
import java.util.Scanner;

public class Question26 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kelime = scanner.nextLine();		
		scanner.close();
		
		for (int i = 0;i < kelime.length();i++) {
			System.out.println(i + " - " + kelime.charAt(i));
		}
	}
}
