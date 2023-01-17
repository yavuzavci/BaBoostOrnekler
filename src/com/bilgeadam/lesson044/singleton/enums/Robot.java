package com.bilgeadam.lesson044.singleton.enums;
/*
 * 1 tane robotumuz var bu robotumuzun çalış metodu var
 * çalış metodunda hashcode --> robot çalışıyor gibi bir çıktı vereceğiz
 * 2- Ev Halkı sınıfımız olacak
 * bu sınıfta robotCagir metodu olacak bu bize bir robot çağıracak
 */
public enum Robot {
	ROBOT;
	
	public void calis() {
		System.out.println(hashCode() + " --> robot çalışıyor");
	}

}
