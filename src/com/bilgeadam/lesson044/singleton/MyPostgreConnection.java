package com.bilgeadam.lesson044.singleton;
/*
 * Singleton yapısına uygun bir Singleton Class oluşturmanın adımları
 * 1- Constructor -> private olacak
 * 2- sınıf içinde kendi referansında static bir değişken tanımlayacağız
 * 3- static bir getInstance() metodu yazacağız ve bize kendi sınıfımızı
 * geri dönecek
 * 4- metot içinde değişkenimizin null kontrolünü yapacağız
 * eğer null ise değişkenimizi new leyeceğiz değilse geri döneceğiz
 */
public class MyPostgreConnection {
	
	private static MyPostgreConnection instance;

	private MyPostgreConnection() {
		
	}
	
	public static MyPostgreConnection getInstance() {
		if(instance == null)
			instance = new MyPostgreConnection();
		
		return instance;
	}

	@Override
	public String toString() {
		return "MyPostgreConnection [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}	
	
}
