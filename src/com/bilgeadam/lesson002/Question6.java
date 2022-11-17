package com.bilgeadam.lesson002;

import java.util.Scanner;

/**
 * Dairenin alanýný ve çevresini bulun.
 * pi yi 3.14 al.
 * @author Yavuz
 *
 */
public class Question6 {

	public static void main(String[] args) {
		double PI = 3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen dairenin yarýçapýný girin: ");
		double yariCap = scanner.nextDouble();
		System.out.println("Lütfen string bir deðeri giriniz :");
		// sayýsal deðerlerden sonra String bir deðer alacak isek bir tane
		// boþ scan.nextLine yazýyoruz
		scanner.nextLine();
		String value = scanner.nextLine();
		scanner.close();
		System.out.println("Dairenin çevresi : " + 2 * PI * yariCap);
		System.out.println("Dairenin alaný : " + PI * yariCap * yariCap);
		System.out.println("value==>" + value);
	}

}
