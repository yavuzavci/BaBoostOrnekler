package com.bilgeadam.lesson040;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOrnek {
	
	public static void main(String[] args) {		
		// Output -> yazma işlemi
		// InputStream -> okuma işlemi
		try {
			FileOutputStream fos = new FileOutputStream("d:/$Java6Dosya/deneme.txt");
			FileInputStream fis = new FileInputStream("d:/$Java6Dosya/deneme.txt");
			try {
				//fos.write(65);
				//fos.write(80);
				//byte[] array = {101,80,88};
				//fos.write(array);
				String string = "Merhaba dunya";
				fos.write(string.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			
			int deger;
			while((deger = fis.read()) != -1) {
				System.out.println((char) deger);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
