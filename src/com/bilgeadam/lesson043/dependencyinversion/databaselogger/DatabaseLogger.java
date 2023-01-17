package com.bilgeadam.lesson043.dependencyinversion.databaselogger;

public class DatabaseLogger {
	
	ILogger logger;

	public DatabaseLogger(ILogger logger) {
		super();
		this.logger = logger;
	}
	
	public void log(String exception) {
		logger.log(exception);
	}
	
}
