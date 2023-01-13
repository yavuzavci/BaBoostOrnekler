package com.bilgeadam.lesson042.taksiapp;

public class Test {

	public static void main(String[] args) {		
		Durak.taksiler.forEach(Thread::start);
	}
	
}
