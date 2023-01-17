package com.bilgeadam.lesson044.factory;

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
