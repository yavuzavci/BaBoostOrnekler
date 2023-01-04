package com.bilgeadam.lesson037;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * bir tane bölme metodum olsun dışarıdan 2 parametre alsın
 * sonra bölme işlemini yapıp sonucu dönsün
 * 
 * main de for döngüsü kuracağız 3 kere çalışsın
 * bu for döngüsü içinde de try catch yapısını kullanalım
 */
public class TryCatchOrnek {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
            try {
                bolme();
            } catch (ArithmeticException e) {
                System.out.println("2.sayi 0 olamaz");
                System.out.println(e.toString());
            }
            
        }
	}
	
	public static double bolme() {
        double bolum = 0;
        boolean kontrol = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Lütfen birinci sayıyı giriniz");
                int sayi1 = scanner.nextInt();
                System.out.println("Lütfen ikinci  sayıyı giriniz");
                int sayi2 = scanner.nextInt();
                kontrol = false;
                bolum = sayi1 / sayi2;
            } catch (InputMismatchException e) {
                System.out.println("Lütfen sadece rakam giriniz");
                System.out.println(e.toString());
                kontrol = true;
            }
        } while (kontrol);
        
        return bolum;        
	}
}
