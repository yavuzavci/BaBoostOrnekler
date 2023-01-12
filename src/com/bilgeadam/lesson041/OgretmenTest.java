package com.bilgeadam.lesson041;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class OgretmenTest {
	
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(FileSabitler.file));
			
			Ogretmen ogretmen1 = new Ogretmen("Muhammet", bufferedReader);
			Ogretmen ogretmen2 = new Ogretmen("Mustafa", bufferedReader);
			
			ogretmen1.start();
			ogretmen2.start();
			try {
				ogretmen1.join();
				ogretmen2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ogretmen1.getOgrenciListesi().size());
			System.out.println(ogretmen2.getOgrenciListesi().size());
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException exception) {
				
			}
		}
	}
	
}
