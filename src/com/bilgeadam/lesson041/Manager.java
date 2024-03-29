package com.bilgeadam.lesson041;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * 1- ogrenci sınıfı oluşturalım bu ogrenci sınıfında 2 tane constructor oluşturun
 * birinde sadece isim olsun diğerinde hem isim hem ortalama olsun
 * 
 * 2- dosyamızı okuyup gelen verilerden bir ogrenci yaratıp bunları bir listeye atalım
 * daha sonra bu listeyi yazdıralım (ilk başta ogrenci oluştururken sadece isimlerle oluşturalım.)
 * 
 * 3- ogrenci listesinden bir serileştirme işlemi ile ogrencileri bir dosyay yazalım 
 * 4- serileştirip yazdığımız dosyadan gelen ogrenci verilerini okuyup console yazdıralım 
 */
public class Manager {
	
	private static List<Ogrenci> ogrenciListesi = new ArrayList<>();

	public static void main(String[] args) {
		//isimleOgrenciOku(FileSabitler.file);
		//isimleVeNotlarlaOgrenciOku(FileSabitler.file);
		dosyayaOgrencileriYaz(FileSabitler.ogrfile);
		dosyadanOgrencileriOkuVeKonsolaYazdir(FileSabitler.ogrfile);
	}
	
	public static void isimleOgrenciOku(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> ogrenciBilgiler;
			String strOgrenciBilgiler = "";
			while((strOgrenciBilgiler = reader.readLine()) != null) {
				ogrenciBilgiler = Arrays.asList(strOgrenciBilgiler.split(","));
				String isim = ogrenciBilgiler.get(0);
				Ogrenci ogrenci = new Ogrenci(isim);
				ogrenciListesi.add(ogrenci);
			}
			ogrenciListesi.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void isimleVeNotlarlaOgrenciOku(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> ogrenciBilgiler;
			String strOgrenciBilgiler = "";
			while((strOgrenciBilgiler = reader.readLine()) != null) {
				ogrenciBilgiler = Arrays.asList(strOgrenciBilgiler.split(","));
				String isim = ogrenciBilgiler.get(0);
				double ortalama = notOrtalamasiniBul(ogrenciBilgiler);
				Ogrenci ogrenci = new Ogrenci(isim, ortalama);
				ogrenciListesi.add(ogrenci);
			}
			ogrenciListesi.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static double notOrtalamasiniBul(List<String> list) {
		return list.subList(1, list.size())
				.stream()
				.collect(Collectors.averagingDouble(not -> Double.parseDouble(not)));
	}
	
	/**
	 * Dosyaya yazarken küsürat olmayacak.
	 */
	public static List<Integer> ogrenciNotlariniAl() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> notListesi = new ArrayList<>();
		try {
			System.out.println("Öğrencinin kaç notunu gireceğinizi yazınız.");
			int notSayisi = scanner.nextInt();
			if(notSayisi <= 0) throw new Exception("Öğrencinin en az 1 notu olmalıdır.");
			for (int i = 0; i < notSayisi; i++) {
				System.out.println("Öğrencinin " + (i + 1) + ". notunu giriniz.");
				int not = scanner.nextInt();
				notListesi.add(not);
			}
		} catch (Exception e) {
			notListesi = List.of(0);
		}		
		
		return notListesi;
	}
	
	public static String ogrenciBilgileriniAl() {
		String ogrenciBilgileri = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Öğrencinin adını giriniz.");
		String isim = scanner.nextLine();
		ogrenciBilgileri = isim + ",";
		
		List<Integer> notlar = ogrenciNotlariniAl();
		ogrenciBilgileri += String.join(",", 
				notlar.stream().map(String::valueOf).collect(Collectors.toList()));
		
		return ogrenciBilgileri;
	}
	
	public static void dosyayaOgrencileriYaz(File file) {
		String ogrenci = "";
		FileWriter fileWriter = null;
		Scanner scanner = new Scanner(System.in);
		try {
			fileWriter = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			System.out.println("Kaç öğrenci bilgisi gireceksiniz?");
			int ogrenciSayisi = scanner.nextInt();
			
			if(ogrenciSayisi <= 0) throw new IOException("En az 1 öğrenci bilgisi girilmelidir.\n"
					+ file.getName() + " dosyasına veri girişi başarısız.");
			
			for (int i = 0; i < ogrenciSayisi; i++) {
				ogrenci = ogrenciBilgileriniAl() + "\n";
				writer.write(ogrenci);				
			}
			writer.flush();
			System.out.println("Öğrenci bilgileri başarıyla " + file.getName() + " dosyasına kaydedildi.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void dosyayaSerilestirilmisOgrencileriYaz() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/$Java6Dosya/ogrenciseri.txt"));
            ogrenciListesi.forEach(x -> {
                try {
                    oos.writeObject(x);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {

        }
    }
	
	public static void dosyayaSerilestirilmisOgrencileriYaz2() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/$Java6Dosya/ogrenciseri2.txt"));
            oos.writeObject(ogrenciListesi);
        } catch (Exception e) {

        }
    }
	
	public static void dosyadanSerilestirilmisOgrencileriOku() {
		File file = new File("D:/$Java6Dosya/ogrenciseri2.txt");
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Ogrenci ogrenci;

//            while (file.length() != 0) {
//                System.out.println("===>" + ois.readObject());
//
//            }
			while ((ogrenci = (Ogrenci) ois.readObject()) != null) {
				System.out.println("===>" + ogrenci);
			}
		} catch (Exception e) {
			System.out.println("Dosya sonuna gelindi");
		}
	}
	
	public static void dosyadanSerilestirilmisOgrencileriOku2() {
		File file = new File("D:/$Java6Dosya/ogrenciseri2.txt");
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			List<Ogrenci> ogrenciler = (List<Ogrenci>) ois.readObject();
			ogrenciler.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("Dosya sonuna gelindi");
		}
	}
	
	public static void dosyadanOgrencileriOkuVeKonsolaYazdir(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> ogrenciBilgiler;
			String strOgrenciBilgiler = "";
			while((strOgrenciBilgiler = reader.readLine()) != null) {
				ogrenciBilgiler = Arrays.asList(strOgrenciBilgiler.split(","));
				String isim = ogrenciBilgiler.get(0);
				double ortalama = notOrtalamasiniBul(ogrenciBilgiler);
				Ogrenci ogrenci = new Ogrenci(isim, ortalama);
				ogrenciListesi.add(ogrenci);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(file.getName() + " dosyasından okunan öğrenciler");
			ogrenciListesi.forEach(System.out::println);
		}
	}
	
}
