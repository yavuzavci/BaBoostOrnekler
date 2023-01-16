package com.bilgeadam.lesson043.dependencyinversion.databaselogger;

public class DatabaseLogger {
	
	public void logToPostgre() {
		PostgreLogger postgreLogger2 = new PostgreLogger();
		postgreLogger2.log();
	}
	
	public void logToMongo() {
		MongoLogger mongoLogger = new MongoLogger();
		mongoLogger.log();
	}
	
}
