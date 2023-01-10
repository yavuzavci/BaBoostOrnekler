package com.bilgeadam.lesson040;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOrnek2 {
	
	public static void main(String[] args) {
		String path = "D:/$Java6Dosya/deneme2.txt";
		File file = new File(path);
		try {
			if(!file.exists()) {
				file.createNewFile();
			}			
//			FileWriter fileWriter = new FileWriter(file);
//			BufferedWriter writer2 = new BufferedWriter(fileWriter);
			
			/**
			 * new FileWriter(file,true) -> her defasında dosyayı 
			 * sıfırlamadan devamına yazdırmak için true yu kullanıyoruz
			 */
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));			
			
//			writer.write("satır1\n");
//			writer.write("satır2");			
//			writer.flush();
			
//			Scanner input = new Scanner(file);
			// Scanner ile okuma
//			while(input.hasNextLine()) {
//				System.out.println(input.next());
//			}
			
			BufferedReader reader = new BufferedReader(new FileReader(file)); 			
			
//			String deger1 = reader.readLine();
//			System.out.println(deger1);
//			String deger2 = reader.readLine();
//			System.out.println(deger2);
//			String deger3 = reader.readLine();
//			System.out.println(deger3);
			
			
			writer.write("satır1\n");
			writer.write("satır2");			
			writer.flush();
			
			String deger;
			while((deger = reader.readLine()) != null) {
				System.out.println(deger);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
