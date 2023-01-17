package com.bilgeadam.lesson044.factory;

public class DatabaseFactory {

	public static ILogger createDatabase(String dbName) {
		switch (dbName.toUpperCase()) {
		case "POSTGRE":
			return new PostgreLogger();
		case "MONGO":
			return new MongoLogger();
		default:
			throw new RuntimeException("Girdiğiniz Database Desteklenmemektedir");
		}
	}

}
