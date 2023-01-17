package com.bilgeadam.lesson044.singleton.lazy;

public class EvHalki implements Runnable {
	private Robot robot;
	
	public void robotCagir() {
		robot = Robot.getInstance();
		robot.calis();
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		robotCagir();
	}
}
