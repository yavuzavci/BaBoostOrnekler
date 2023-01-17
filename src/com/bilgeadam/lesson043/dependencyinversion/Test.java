package com.bilgeadam.lesson043.dependencyinversion;

import com.bilgeadam.lesson043.dependencyinversion.databaselogger.DatabaseLogger;
import com.bilgeadam.lesson043.dependencyinversion.databaselogger.DatabaseLogger;
import com.bilgeadam.lesson043.dependencyinversion.databaselogger.MongoLogger;
import com.bilgeadam.lesson043.dependencyinversion.databaselogger.PostgreLogger;
import com.bilgeadam.lesson043.dependencyinversion.exception.StoryException;
import com.bilgeadam.lesson043.dependencyinversion.exception.VideoException;

public class Test {
	
	public static void main(String[] args) {
		WhatsApp whatsapp = new WhatsApp();
		
		try {
			whatsapp.hikayePaylas();
			whatsapp.videoKonferansYap();
		} catch (StoryException e) {
			new DatabaseLogger(new PostgreLogger()).log(e.getMessage());
		} catch (VideoException e) {
			new DatabaseLogger(new MongoLogger()).log(e.getMessage());
		}
	
	}
}
