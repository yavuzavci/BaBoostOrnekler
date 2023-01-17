package com.bilgeadam.lesson044.factory;

class MongoLogger implements ILogger {
	
	@Override
	public void log(String exception) {
		System.out.println(exception + " --> mongoya loglandı");
	}
	
}
