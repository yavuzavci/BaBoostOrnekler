package com.bilgeadam.lesson043.dependencyinversion;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

/*
 * i -> interface segregation
 * 
 * twitter hikaye paylaşımını desteklemiyor. nasıl çözeriz ?
 */

public class Instagram extends SosyalMedya implements IEmailSendable,ISmsSendable,IPostSendable,IChatable,IVideoCallable,IPhotoSharable,IStorySharable {

	@Override
	public void boyutlandir(String type) {
		if(type.equals("jpg"))
			setKucultmeKatSayisi(38.0);
		
		else if(type.equals("png"))
			setKucultmeKatSayisi(30.0);
		
		else
			setKucultmeKatSayisi(40.0);
		
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
