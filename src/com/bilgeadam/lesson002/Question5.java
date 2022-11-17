package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz");
		double sayi1 = scanner.nextDouble();
		System.out.println("sayi===>" + sayi1);
		scanner.nextLine();
		System.out.println("Lütfen bir deðer giriniz");
		String value = scanner.nextLine();
		System.out.println("Lütfen bir deðer giriniz");
		String value2 = scanner.nextLine();
		System.out.println("value===>"+ value + value2);
		
		// ctrl + shift + c -> toplu yorum satýrý
		scanner.close();
	}

}
