package com.bilgeadam.lesson043.interfacesegregation;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

public class WhatsApp extends SosyalMedya implements IEmailSendable,ISmsSendable,IChatable,IPhotoSharable,IVideoCallable,IStorySharable {

	@Override
	public void boyutlandir(String type) {
		if(type.equals("jpg"))
			setKucultmeKatSayisi(28.0);
		
		else if(type.equals("png"))
			setKucultmeKatSayisi(32.0);
		
		else
			setKucultmeKatSayisi(36.0);		
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
	public void videoKonferansYap() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void hikayePaylas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smsGonder(Kullanici kullanici) {
		if(kullanici.getPhone() != null)
			Bildirim.smsGonder(kullanici.getPhone());
	}

	@Override
	public void emailGonder(Kullanici kullanici) {
		if(kullanici.getEmail() != null)
			Bildirim.emailGonder(kullanici.getEmail());
	}

}
