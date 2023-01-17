package com.bilgeadam.lesson043.dependencyinversion.databaselogger;

public class PostgreLogger implements ILogger {
	
	@Override
	public void log(String exception) {
		System.out.println(exception + " --> postgres e loglandı");
	}
	
}
