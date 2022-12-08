package com.bilgeadam.lesson024.database;

import java.util.Scanner;

public class Utility {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static String stringDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}
	public static int intDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return Integer.parseInt(scanner.nextLine());
	}
}
