package com.bilgeadam.lesson043.openclosed;

public class Facebook extends SosyalMedya {

	@Override
	public void boyutlandir(String type) {
		if(type.equals("jpg"))
			setKucultmeKatSayisi(34.0);
		
		else if(type.equals("png"))
			setKucultmeKatSayisi(37.0);
		
		else
			setKucultmeKatSayisi(45.0);
		
	}
	
}
