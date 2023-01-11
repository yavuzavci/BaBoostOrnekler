package com.bilgeadam.lesson040;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
		// veriGir();
		// veriOku();
		// harfDegistir(veriOku());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dosyaSil2(FileSabitler.path);
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
			BufferedWriter writer = new BufferedWriter(new FileWriter(FileSabitler.file, true));
			writer.write(ifade);
			writer.flush();
			System.out.println(ifade + " başarıyla " + FileSabitler.file.getName() + " dosyasına yazdırıldı.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String veriOku() {
		String tumMetin = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FileSabitler.file));
			System.out.println(FileSabitler.file.getName() + " dosyasının içindeki veriler...: ");
			String deger;
			while((deger = reader.readLine()) != null) {
				tumMetin += deger + "\n";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tumMetin;
	}
	
	public static void harfDegistir(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen değiştirmek istediğiniz harfi giriniz");
		char eskiHarf = scanner.nextLine().charAt(0);
		System.out.println("Lütfen yeni harfi giriniz");
		char yeniHarf = scanner.nextLine().charAt(0);
		metin = metin.replace(eskiHarf, yeniHarf);
		dosyayaVeriEkle(metin);
	}
	
	public static void dosyayaVeriEkle(String metin) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Metin dosyaya eklenerek mi yazılsın (E/H)");
		boolean kontrol = false;
		
		if(scanner.nextLine().equalsIgnoreCase("e"))
			kontrol = true;
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(FileSabitler.file,kontrol));
			writer.write(metin + "\n");
			writer.flush();
			System.out.println(metin + " başarıyla " + FileSabitler.file.getName()+ " dosyasına eklendi.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void dosyaSil(File file) {
		if(file.exists()) {
			System.out.println("Dosyanız siliniyor.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			file.delete();
			System.out.println(file.getName() + " adlı dosyanız silindi.");
		}
		else
			System.out.println("Böyle bir dosya bulunamadı.");
	}
	
	public static void dosyaSil2(Path path) {
		try {
			if(Files.deleteIfExists(path)) {
				System.out.println("Dosyanız siliniyor.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Dosyanız silindi.");
			}
			else
				System.out.println("Böyle bir dosya bulunamadı.");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
}
