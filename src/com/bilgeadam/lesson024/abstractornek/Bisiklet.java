package com.bilgeadam.lesson024.abstractornek;

public class Bisiklet extends Arac {
	@Override
	public void ilerle() {
		System.out.println("Bisiklet hareket ediyor.");
	}
	
	@Override
	public void dur() {
		System.out.println("Bisiklet durdu.");
	}
}
