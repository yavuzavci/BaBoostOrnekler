package com.bilgeadam.lesson043.dependencyinversion;

import com.bilgeadam.lesson043.dependencyinversion.databaselogger.DatabaseLogger;
import com.bilgeadam.lesson043.dependencyinversion.databaselogger.DatabaseLogger2;
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
			new DatabaseLogger().logToPostgre();
		} catch (VideoException e) {
			new DatabaseLogger().logToMongo();
		}
		
		try {
			whatsapp.hikayePaylas();
			whatsapp.videoKonferansYap();
		} catch (StoryException e) {
			new DatabaseLogger2(new PostgreLogger()).log();
		} catch (VideoException e) {
			new DatabaseLogger2(new MongoLogger()).log();
		}
	
	}
}
