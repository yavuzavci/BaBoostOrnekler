package com.bilgeadam.lesson022.calisan;
/**
 * 
 * -- Mühendislerimiz olacak
 * 
 * isim
 * soyisim
 * iş unvanı
 * maaşı
 * 
 * en az 2 constructor istiyorum(isim soyisim)
 * (isim soyisim maas)
 * 
 * maaş zammı metodu olacak.
 * 
 * maaş default en az 10000 10000-12000 arası unvan muhendis
 * eğer maaşı 12000-17000 arasında ise kıdemli mühendis
 * eğer maaşı 10000 den küçükse stajyer
 * 17000 den büyük ise uzman mühendis
 * 
 * zam oranına ek olarak 250 tl bonus alacaklar.
 * 
 * ofis çalışanları olacak
 * isim
 * soyisim
 * iş unvanı
 * maaşı
 * 
 * en düşük çalışan maaşı 8000
 * 8000 12000 arası çalışan
 * 12000 sonrası kıdemli
 * 8000 altı stajyer
 * 
 * 
 */
public class Test {
	
	public static void main(String[] args) {
		
		OfisCalisani ofisCalisani = new OfisCalisani("Zeynep","Demirci");
		System.out.println(ofisCalisani.getIsUnvani());
		System.out.println(ofisCalisani.getMaas());
		
		OfisCalisani ofisCalisani2 = new OfisCalisani("Ahmet","Yılmaz",7000);
		System.out.println(ofisCalisani2.getIsUnvani());
		System.out.println(ofisCalisani2.getMaas());
		
		Muhendis muhendis = new Muhendis("Mehmet","Öz");
		System.out.println(muhendis.getIsUnvani());
		System.out.println(muhendis.getMaas());
		
		Muhendis muhendis2 = new Muhendis("Yavuz","Avcı",15000);
		System.out.println(muhendis2.getIsUnvani());
		System.out.println(muhendis2.getMaas());
		
		InsanKaynaklari insanKaynaklari = new InsanKaynaklari("Burcu","Yüksel",10000);
		insanKaynaklari.zamYap(muhendis, 21);
		
		System.out.println(muhendis.getIsUnvani());
		System.out.println(muhendis.getMaas());
			
	}
	
}
