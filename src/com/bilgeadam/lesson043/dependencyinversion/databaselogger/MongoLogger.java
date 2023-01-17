package com.bilgeadam.lesson043.dependencyinversion.databaselogger;

public class MongoLogger implements ILogger {
	
	@Override
	public void log(String exception) {
		System.out.println(exception + " --> mongoya loglandı");
	}
	
}
