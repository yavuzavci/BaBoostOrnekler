package com.bilgeadam.lesson043.openclosed;

public class WhatsApp extends SosyalMedya {

	@Override
	public void boyutlandir(String type) {
		if(type.equals("jpg"))
			setKucultmeKatSayisi(28.0);
		
		else if(type.equals("png"))
			setKucultmeKatSayisi(32.0);
		
		else
			setKucultmeKatSayisi(36.0);		
	}

}
