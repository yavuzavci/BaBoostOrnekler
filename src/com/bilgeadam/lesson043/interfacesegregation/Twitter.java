package com.bilgeadam.lesson043.interfacesegregation;

import com.bilgeadam.lesson043.utility.Kullanici;

public class Twitter extends SosyalMedya implements ISmsSendable,IEmailSendable,IPostSendable,IPhotoSharable,IChatable {

	@Override
	public void sohbetEt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resimPaylas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postGonder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emailGonder(Kullanici kullanici) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smsGonder(Kullanici kullanici) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boyutlandir(String type) {
		// TODO Auto-generated method stub
		
	}

}
