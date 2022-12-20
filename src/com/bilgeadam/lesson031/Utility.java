package com.bilgeadam.lesson031;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	public static Scanner scanner = new Scanner(System.in);
	public static Random random = new Random(System.currentTimeMillis());

    public static String stringDegerAlma(String sorgu) {
        System.out.println(sorgu);
        return scanner.nextLine();
    } 

    public static int intDegerAlma(String sorgu) {
        System.out.println(sorgu);
        return Integer.parseInt(scanner.nextLine());
    }
    
    public static int rastgeleSayiUret(int baslangic, int bitis) { 
		return random.nextInt(baslangic, bitis);
	}
}
