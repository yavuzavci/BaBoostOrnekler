package com.bilgeadam.lesson017;

public class OopTekrar {
	
	public static void main(String[] args) {
		// class(sınıf) ve obje(nesne)
		
		// sınıflarımızı oluştururken
		
		Profile myProfile = new Profile();
		myProfile.username = "mustafa";
		myProfile.postOlustur();
		System.out.println(myProfile.username + "-" + myProfile.postSayisi);
		
		Profile myProfile2 = new Profile();
		myProfile2.username = "Burhan";
		myProfile2.postOlustur();
	}
	
}
