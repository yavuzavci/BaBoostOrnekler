package com.bilgeadam.lesson043.dependencyinversion;

import com.bilgeadam.lesson043.utility.Kullanici;

public interface IEmailSendable {
	void emailGonder(Kullanici kullanici);
}
