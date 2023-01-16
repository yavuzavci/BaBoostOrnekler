package com.bilgeadam.lesson043.openclosed;


public class ResimBoyutlandirma {
	
	// 1. adımda sadece instagram var
	public void boyutlandir(Instagram instagram, String type) {
		if(type.equals("jpg"))
			instagram.setKucultmeKatSayisi(38.0);
		
		else if(type.equals(".png"))
			instagram.setKucultmeKatSayisi(30.0);
		
		else
			instagram.setKucultmeKatSayisi(40.0);
			
	}
	// 2. adımda facebook da eklendi onunda küçültme katsayıyı belirlenecek
	public void boyutlandir2(SosyalMedya sosyalMedya, String type) {
		if(sosyalMedya instanceof Instagram) {
			if(type.equals("jpg"))
				sosyalMedya.setKucultmeKatSayisi(38.0);
			
			else if(type.equals("png"))
				sosyalMedya.setKucultmeKatSayisi(30.0);
			
			else
				sosyalMedya.setKucultmeKatSayisi(40.0);
		}
		
		else if(sosyalMedya instanceof Facebook) {
			if(type.equals("jpg"))
				sosyalMedya.setKucultmeKatSayisi(34.0);
			
			else if(type.equals("png"))
				sosyalMedya.setKucultmeKatSayisi(37.0);
			
			else
				sosyalMedya.setKucultmeKatSayisi(45.0);
		}
		
		else {
			
		}
		
	}
	
	public void boyutlandir3(SosyalMedya sosyalMedya, String type) {
		sosyalMedya.boyutlandir(type);
	}
	
}
