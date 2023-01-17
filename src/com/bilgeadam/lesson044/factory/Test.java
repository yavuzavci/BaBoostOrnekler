package com.bilgeadam.lesson044.factory;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen loglama yapacağınız database ismini giriniz");
		String dbName = scanner.nextLine();
		// standart nesne oluşturma
		PostgreLogger postgreLogger = new PostgreLogger();
		MongoLogger mongoLogger = new MongoLogger();
		// polymorphism
		ILogger postgreLogger2 = new PostgreLogger(); 
		ILogger mongoLogger2 = new MongoLogger();
		
		ILogger iLogger = DatabaseFactory.createDatabase(dbName);
		System.out.println(iLogger.getClass());
	}
	
}
