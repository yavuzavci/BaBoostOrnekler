package com.bilgeadam.lesson023.interfaceornek;

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
