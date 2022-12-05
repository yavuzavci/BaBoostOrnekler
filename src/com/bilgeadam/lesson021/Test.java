package com.bilgeadam.lesson021;
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
		Muhendis muhendis = new Muhendis("Mehmet","Öz");
		OfisCalisani ofisCalisani = new OfisCalisani("Zeynep","Demirci");
		
		Muhendis muhendis2 = new Muhendis("Yavuz","Avcı",15000);
		OfisCalisani ofisCalisani2 = new OfisCalisani("Ahmet","Yılmaz",7000);
		
		System.out.println(muhendis2.getIsUnvani());
		System.out.println(muhendis2.getMaas());
		muhendis2.zamYap(50);
		System.out.println(muhendis2.getIsUnvani());
		System.out.println(muhendis2.getMaas());
		
		System.out.println(ofisCalisani2.getIsUnvani());
		System.out.println(ofisCalisani2.getMaas());
		ofisCalisani2.zamYap(40);
		System.out.println(ofisCalisani2.getIsUnvani());
		System.out.println(ofisCalisani2.getMaas());
	}
	
}
