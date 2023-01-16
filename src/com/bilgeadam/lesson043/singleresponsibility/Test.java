package com.bilgeadam.lesson043.singleresponsibility;

import com.bilgeadam.lesson043.openclosed.Instagram;
import com.bilgeadam.lesson043.utility.Kullanici;

public class Test {
	
	public static void main(String[] args) {
		Facebook facebook = new Facebook();
		Instagram instagram = new Instagram();
		
		Kullanici kullanici = new Kullanici("Mustafa","mustafa@gmail.com");
		facebook.emailGonder(kullanici);
		instagram.emailGonder(kullanici);
	}

}
