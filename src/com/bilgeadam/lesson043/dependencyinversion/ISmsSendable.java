package com.bilgeadam.lesson043.dependencyinversion;

import com.bilgeadam.lesson043.utility.Kullanici;

public interface ISmsSendable {
	void smsGonder(Kullanici kullanici);
}
