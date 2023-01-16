package com.bilgeadam.lesson043.openclosed;

/*
 * Open Closed===> Kodlarımız geliştirmeye acık degistirmeye 
 * kapalı olsun var olan modelleri degiştirmek yerine geliştirmeliyiz
 * 
 * 1-Resim boyutlandırma sınıfına bir metot yazacagız bu metot bizden bir insatagramı alacak 
 * bir String type lacak eğer jpg ise kücültme katsayisi 38 png 30 olsun 
 * 
 * 2- Yeni bir sosyal medya uygulaması daha eklendi ve facbookun jpg kucultme katsayısı 34
 * png 37 olsun diğer 45
 * 3- Yeni bir sosyal medya uygulamsı daha ekledik Whats app bunun jpg =>>28 png 32 ,diğerleri 36
 *
 * sorunumuz her sosyal medya eklandıgınde Resım boyutlandırma daki boyutlandırma2 metoduna 
 * yeni if else ler eklemk zorunda kalıyoruz bunu gidermek ne yapabiliriz
 *
 * (cozum: Sosyal medya clasında bir abstract metoto olusturduk boyutlandırma adında 
 * ve her sınıf kendi ozelinde boutlandırma degerlerini setledi ve daha sonra 
 * Resim boyutlandırma sınıfında ki boyutlandırma metodunda Sosyal medya abstrac sınıfı uzerinden 
 * kalıtım yapısı ile beraber abstarac metoto cagırıldı ve test sınıfında da 3 farklı sınıf
 * olusturularak bu tek metot ile çalıştırıldı daha sonra bir sosyal medyaya daha ihtiyaç duyarsak 
 * Resim boyutlandırma sınıfndaki boyutlandrma metodunu degiştirmeden kullabilecek bir hala getirmiş olduk) 
 *
 *
 */

public class Instagram extends SosyalMedya {

	@Override
	public void boyutlandir(String type) {
		if(type.equals("jpg"))
			setKucultmeKatSayisi(38.0);
		
		else if(type.equals("png"))
			setKucultmeKatSayisi(30.0);
		
		else
			setKucultmeKatSayisi(40.0);
		
	}
	
}
