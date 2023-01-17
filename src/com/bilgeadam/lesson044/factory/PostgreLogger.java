package com.bilgeadam.lesson044.factory;

class PostgreLogger implements ILogger {
	
	@Override
	public void log(String exception) {
		System.out.println(exception + " --> postgres e loglandı");
	}
	
}
