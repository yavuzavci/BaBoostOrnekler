package com.bilgeadam.lesson002;

import java.util.Scanner;

/**
 * Dairenin alan�n� ve �evresini bulun.
 * pi yi 3.14 al.
 * @author Yavuz
 *
 */
public class Question6 {

	public static void main(String[] args) {
		double PI = 3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen dairenin yar��ap�n� girin: ");
		double yariCap = scanner.nextDouble();
		System.out.println("L�tfen string bir de�eri giriniz :");
		// say�sal de�erlerden sonra String bir de�er alacak isek bir tane
		// bo� scan.nextLine yaz�yoruz
		scanner.nextLine();
		String value = scanner.nextLine();
		scanner.close();
		System.out.println("Dairenin �evresi : " + 2 * PI * yariCap);
		System.out.println("Dairenin alan� : " + PI * yariCap * yariCap);
		System.out.println("value==>" + value);
	}

}
