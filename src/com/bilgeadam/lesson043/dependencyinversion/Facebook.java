package com.bilgeadam.lesson043.dependencyinversion;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

public class Facebook extends SosyalMedya implements IEmailSendable,IPhotoSharable,IPostSendable,IStorySharable,IChatable {

	@Override
	public void boyutlandir(String type) {
		if(type.equals("jpg"))
			setKucultmeKatSayisi(34.0);
		
		else if(type.equals("png"))
			setKucultmeKatSayisi(37.0);
		
		else
			setKucultmeKatSayisi(45.0);
		
	}

	@Override
	public void postGonder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sohbetEt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resimPaylas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hikayePaylas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emailGonder(Kullanici kullanici) {
		if(kullanici.getEmail() != null)
			Bildirim.emailGonder(kullanici.getEmail());		
	}
	
}
