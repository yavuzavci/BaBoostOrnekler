package com.bilgeadam.lesson027;

import java.util.Scanner;
import java.util.Stack;

/*
 * dışarıdan bir metin girecez sonra bu metni bir stacka atayacağız
 * daha sonra da palindrom olup olmadığını kontrol eden metodu yazalım.
 */
public class PalindromStack {
	
	public static Stack<Character> stack = new Stack<Character>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ifadenizi girin");
		String ifade = scanner.nextLine();
		scanner.close();
		if(isPalindrom(ifade))
			System.out.println(ifade + " palindromdur");
		else
			System.out.println(ifade + " palindrom değildir");
		
	}
	
	private static void stackOlustur(String ifade) {
		for(int i = 0; i < ifade.length(); i++) {
			stack.push(ifade.charAt(i));
		}
		stack.forEach(System.out::println);
	}
	
	private static boolean isPalindrom(String ifade) {
		stackOlustur(ifade);
		
		for (int i = 0; i < ifade.length() / 2; i++) {
			if(ifade.charAt(i) != stack.pop())
				return false;
		}
		return true;
	}
	
}
