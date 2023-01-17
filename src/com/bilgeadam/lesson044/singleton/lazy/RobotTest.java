package com.bilgeadam.lesson044.singleton.lazy;

public class RobotTest {
	
	public static void main(String[] args) {
		EvHalki anne = new EvHalki();
		EvHalki baba = new EvHalki();
		EvHalki cocuk = new EvHalki();
		
		//anne.robotCagir();
		//baba.robotCagir();
		//cocuk.robotCagir();
		
		Thread thread1 = new Thread(anne);
		Thread thread2 = new Thread(baba);
		Thread thread3 = new Thread(cocuk);
		thread1.start();
		thread2.start();
		thread3.start();	
	}
}
