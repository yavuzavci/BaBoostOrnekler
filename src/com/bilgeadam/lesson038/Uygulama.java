package com.bilgeadam.lesson038;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * 1- bir yuk yeri secme metodumuz olsun
 * bu metot limandaki yukler dizisinden kendine bir yer belirlesin
 * eğer sınır dışı ise hatayı yakalayalım ve gösterelim
 * 
 * 2- Kendi exception sınıfımızı yaratalım () LimanAppException
 * daha sonra seçtiğim indexteki yer null değilse hata fırlatacağız
 * seçtiğiniz yer dolu ;
 * 
 * 3- ağırlık belirle ==> limanımız 100 kilo altı yükleri kabul etmiyor
 * yükümüz bu kurala uymuyorsa exception fırlatacak
 * 
 * 4- limanımız cuma günleri kabul yapmıyor. bunun için metot yazacağız
 * kabultarihkontrol==> cuma günü olup olmadığını kontrol eden exception fırlatacağız.
 * 
 * 5- yukolustur metodunu yazalım aşağıdaki kontrolleri yapalım
 * kontrollerden geçiyorsa yükümüzü ekleyelim.
 * 
 */
public class Uygulama {
	
	Liman liman;
	static Scanner scanner = new Scanner(System.in);
	
	public Uygulama() {
		super();
		this.liman = new Liman(); 
	}
	
	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
//		try {
//			uygulama.yukOlustur();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		uygulama.yukOlustur();
	}
	
	// eski method
	public Yuk yukSec(int yer) {
		if(yer < 0 || yer >= liman.getYukler().length)
			throw new IndexOutOfBoundsException("Yanlış yer seçtiniz.");
		
		Yuk yuk = liman.getYukler()[yer];
		if(yuk == null)
			throw new NullPointerException("Seçtiğiniz yerde bir yük yok.");
		
		return yuk;
	}
	
	public void yukYeriSec() {
		int index = Utility.intDegerAlma("Lütfen bir yük yeri seçiniz");
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lütfen sınırlar dahilinde bir yer seçiniz");
		}
	}
	
	public void yukYeriSec2(int index) {
		if(index < 0 || index >= liman.getYukler().length)
			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);
		
		if(liman.getYukler()[index] != null)
			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
	}
	
	public int yukYeriSec3() {
		int index = Utility.intDegerAlma("Lütfen bir yük yeri seçiniz");
		if(index < 0 || index >= liman.getYukler().length)
			throw new LimanAppException(ErrorType.SINIRLAR_DISINDA);
		
		if(liman.getYukler()[index] != null)
			throw new LimanAppException(ErrorType.DOLU_YER_SECIMI);
		
		return index;
	}
	
	public double kantar() {
		double agirlik = Utility.doubleDegerAlma("Lütfen yerleştirilecek yükün ağırlığını giriniz.");
		if(agirlik < 100)
			throw new LimanAppException(ErrorType.ASGARI_AGIRLIK);
		
		return agirlik;
	}
	
	public LocalDate kabulTarihiKontrol() {
        LocalDate date = Utility.tarihAl();
        
        if (date.isBefore(LocalDate.now())) {
            throw new LimanAppException(ErrorType.GECERSIZ_KABUL_TARIHI);
        }
        
        if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
            throw new LimanAppException(ErrorType.MESAI_GUNLERI_DISI);
        }
        
        return date;
	}
	
	public void yukOlustur() {
		Yuk yuk = null;
		int index = 0;
		try {
			index = yukYeriSec3();
			LocalDate kabulTarihi = kabulTarihiKontrol();			
			double agirlik = kantar();
			String isim = Utility.stringDegerAlma("Lütfen yerleştirilecek yükün adını giriniz.");
			yuk = new Yuk(isim,agirlik,kabulTarihi);
			liman.getYukler()[index] = yuk;
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if(yuk == null)
				System.out.println("Yükünüz kabul olmamıştır.");
			else
				System.out.println("Yükünüz kabul olmuştur. " + index + " numaralı yere yerleşmiştir.");
		}
	}
}
