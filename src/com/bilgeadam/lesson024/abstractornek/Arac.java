package com.bilgeadam.lesson024.abstractornek;

public abstract class Arac {
	
	double hiz;
	
	public void hiziGoster() {
		System.out.println("Aracınızın hızı-> " + hiz);
	}
	
	public abstract void ilerle();
	public abstract void dur();
	
}
