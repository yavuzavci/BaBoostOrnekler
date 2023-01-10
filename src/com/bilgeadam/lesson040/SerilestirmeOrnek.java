package com.bilgeadam.lesson040;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilestirmeOrnek {
	
	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci("Mustafa", 34);
		ObjectOutputStream oos = null;
		//Serileştirme işlemi (Serialization)
		try {
			FileOutputStream fos = new FileOutputStream("D:/$Java6Dosya/seri.txt");
			oos = new ObjectOutputStream(fos);
//			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("seri.txt"));
			oos.writeObject(ogrenci);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// --------------------------------------------------
		// DeSerialization işlemi
		
		try {
			FileInputStream fis = new FileInputStream("D:/$Java6Dosya/seri.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try {
				Ogrenci ogrenci2 = (Ogrenci) ois.readObject();
				System.out.println(ogrenci2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
