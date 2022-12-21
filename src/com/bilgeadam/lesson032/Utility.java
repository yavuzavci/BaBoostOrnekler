package com.bilgeadam.lesson032;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	
	public static final Random random = new Random(System.currentTimeMillis());
	public static final int setLimit = 10;
	public static final int maxSayi = 100;
	public static final int uretilenSayiMiktari = 10000;
	public static Scanner scanner = new Scanner(System.in);

    public static String stringDegerAlma(String sorgu) {
        System.out.println(sorgu);
        return scanner.nextLine();
    } 

    public static int intDegerAlma(String sorgu) {
        System.out.println(sorgu);
        return Integer.parseInt(scanner.nextLine());
    }
    
    public static int rastgeleSayiUret() {
    	return random.nextInt(1,maxSayi + 1);
    }
    
    public static int rastgeleSayiUret(int altSinir, int ustSinir) {
    	return random.nextInt(altSinir,ustSinir);
    }
}
