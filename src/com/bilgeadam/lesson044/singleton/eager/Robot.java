package com.bilgeadam.lesson044.singleton.eager;
/*
 * 1 tane robotumuz var bu robotumuzun çalış metodu var
 * çalış metodunda hashcode --> robot çalışıyor gibi bir çıktı vereceğiz
 * 2- Ev Halkı sınıfımız olacak
 * bu sınıfta robotCagir metodu olacak bu bize bir robot çağıracak
 */
public class Robot {
	private static Robot robotInstance = new Robot();
	
	private Robot() {
		
	}
	
	public static Robot getInstance() {
		return robotInstance;
	}
	// Thread safe yapmak için metodumuzu syncronized metot haline getirebiliriz
	
	public void calis() {
		System.out.println(hashCode() + " --> robot çalışıyor");
	}

}
