package com.bilgeadam.lesson024.abstractornek;

public class Gemi extends Arac {
	
	@Override
	public void ilerle() {
		System.out.println("Gemi hareket ediyor.");
	}
	@Override
	public void dur() {
		System.out.println("Gemi durdu.");
	}
	
}
