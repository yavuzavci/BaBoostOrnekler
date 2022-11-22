package com.bilgeadam.lesson013;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Student student;
		boolean cikis = false;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Öğrenci kaydetmek istiyor musunuz? Çıkış için 0 yazın.");
			int girdi = scanner.nextInt();
			
			if(girdi == 0) cikis = true;
			else {
				student = new Student();
				student.ogrenciKaydet();
			}
			
		} while (!cikis);
		scanner.close();		
	}	
	
}
