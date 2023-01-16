package com.bilgeadam.lesson043.liskovsubstitution;

import com.bilgeadam.lesson043.utility.Bildirim;
import com.bilgeadam.lesson043.utility.Kullanici;

/*
 * Liskov Substitution ==> bir sınıf inherit edildiği sınıf gibi davranmalıdır.
 * 
 * 1- Bizim email ve Sms gönderme metotlarımız var sonra bir gün Facebook dedi ki
 * ben artık sms göndermeyi desteklemiyorum bu sorunu nasıl çözeriz
 * 
 * 2- Whatsapp sadece video konferans yapabiliyor, sohbet edilebilir, resim paylaşabilir, hikaye paylaş
 * facebook -> post atabilir, resim paylaşabilir, sohbet edilebilir, hikaye paylaş
 * instagram -> post atabilir, resim paylaşabilir, sohbet edilebilir, hikaye paylaş
 * burda sosyal medyada bu metotları abstract olarak yazmıştık şimdi buradaki sorunu bulup
 * nasıl çözeceğimize dair kodlamaları yapın
 */

public class Instagram extends SosyalMedya implements IEmailSendable,ISmsSendable,IPostable,VideoCallable {

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
