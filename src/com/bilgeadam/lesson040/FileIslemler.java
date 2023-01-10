package com.bilgeadam.lesson040;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * System.out.println("0- Çıkış");
            System.out.println("1- Dosya Yarat");
            System.out.println("2- Ekle");
            System.out.println("3- Okuma");
            System.out.println("4- Harf Değiştir");
            System.out.println("5- Dosya silme");
            System.out.println("lütfen işlem seçiniz");
            
            
            
 * 1- File sabitlerde bir file yaratalım daha sonra bu file metotlarda kullanacağız
 * 
 * dosya yaratmak için bir metot yazalım
 * eğer dosyamız dizinde yoksa yaratsın varsa bize bir çıktı versin bu dosya daha önce yaratılmıştır
 * 
 * 2- dosyamıza dışarıdan aldığımız bir veriyi ekleyelim (Scanner ile aldığımız veriyi)
 * ve her ekleme yapıldıktan sonra bir sonraki ekleme işlemi alt satıra geçsin
 * 
 * *4-dısardan girdiğimiz bir deger metin içerisinde varsa o degeri dısardan 
 * girdiğimiz 2. deger ile degistirip dosyaya geri yazalım 
 *
 *5- eger dosya varsa silelim yoksa dosya bulunamamıstır diye çıktı verelim
 * 
 */
public class FileIslemler {
	
	public static void main(String[] args) {
		dosyaOlustur();
		veriGir();
		veriOku();
	}

	public static void dosyaOlustur() {
		if(!FileSabitler.file.exists()) {
			try {
				FileSabitler.file.createNewFile();
				System.out.println(FileSabitler.file.getName() +" başarıyla oluşturuldu.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			System.out.println("Bu dosya daha önce yaratılmıştır.");
	}
	
	public static void veriGir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir ifade girin.");
		String ifade = scanner.nextLine();
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(FileSabitler.file,true));
			writer.write(ifade);
			writer.flush();
			System.out.println(ifade + " başarıyla " + FileSabitler.file.getName()+ " dosyasına yazdırıldı.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void veriOku() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FileSabitler.file));
			System.out.println(FileSabitler.file.getName() + " dosyasının içindeki veriler...: ");
			String deger;
			while((deger = reader.readLine()) != null) {
				System.out.println(deger);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
