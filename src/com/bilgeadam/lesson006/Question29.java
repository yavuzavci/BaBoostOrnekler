package com.bilgeadam.lesson006;

import java.util.Scanner;

/*
* Menu 
* 1-Dışarıdan bir kelime ve bir harf girilsin  eğer kelimemizin için de o
*   harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
*
*
* 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
* giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
* içerisinde o harf varsa değiştirsin
*
*
* 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
* olmadığını bulunuz(kek,iki,kabak)
*
*
* 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
* başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
* açıldığını düşünün elimizde) her a bir sayfaya her b bir sayfaya her c bir
* sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı bir
* sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
* sayfa olduğunu ekrana yazdıralım.
*/

public class Question29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean menu = true;
		
		while (menu) {
			System.out.println("================= String İşlemleri =============== ");
			System.out.println("1 -> Harf saydırma");
			System.out.println("2 -> Harf değiştirme");
			System.out.println("3 -> Palindrom kontrolü");
			System.out.println("4 -> Sayfa açma");
			System.out.println("5 -> Sayfa açma 2");
			System.out.println("0 -> ÇIKIŞ");
			System.out.print("Bir tercihte bulunmak için sayı seçin..: ");
			int secim = scanner.nextInt();
			scanner.nextLine();
			
			switch (secim) {				
				case 1:{
					String indexler = "";
					System.out.print("Kelimenizi yazın.........................: ");
					String kelime = scanner.nextLine();
					System.out.print("Kelimenizde hangi harfi aradığınızı yazın..: ");
					String harf = scanner.nextLine();
										
					if (!kelime.contains(harf)) {
						System.out.println("Kelimenizde '" + harf + "' harfi yoktur.");
						break;
					}
						
					int harfSayaci = 0;
					for(int i = 0;i < kelime.length();i++) {
						if(kelime.charAt(i) == harf.charAt(0)) {
							harfSayaci++;
							indexler += i + ",";
						}
								
					}
					
					System.out.println(harf + " harfi kelimenizde " + harfSayaci + " adet bulunmaktadır.");
					System.out.println(harf + " değerinin indexleri ===> "+ indexler.substring(0,indexler.length() - 1));
					break;
				}
				case 2:{
					System.out.print("Kelimenizi yazın..................................: ");
					String kelime = scanner.nextLine();
					System.out.print("Kelimenizde değiştirmek istediğiniz harfi yazın...: ");
					String eskiHarf = scanner.nextLine();					
										
					if (!kelime.contains(eskiHarf)) {
						System.out.println("Harf kelimede yoktur.");
						break;
					}
					
					System.out.print("Kelimenizde hangi harfi aradığınızı yazın..: ");
					String yeniHarf = scanner.nextLine();					
					kelime = kelime.substring(0).replace(eskiHarf, yeniHarf);					
					System.out.println("Kelimenizin yeni hali..: " + kelime);
					break;
				}
				case 3:{
					System.out.print("Kelimenizi yazın..................................: ");
					String kelime = scanner.nextLine();
					
					String tersKelime = "";
					
					for(int i = kelime.length() - 1; i >= 0;i--)
						tersKelime += kelime.charAt(i);
					
					if(kelime.equalsIgnoreCase(tersKelime))
						System.out.println("Kelimeniz palindromdur.");
					else
						System.out.println("Kelimeniz palindrom değildir.");
					break;
				}
				case 4:{
					int sayfa = 1;
					boolean checkA = false, checkB = false, checkC = false;
					// sadece ilk karşılaşmada yeni sayfa aç
					for(int i = 0;i < 5;i++) {
						System.out.print((i + 1) + ". kelimeyi girin..: ");
						String kelime = scanner.nextLine();
						switch (kelime.charAt(0)) {
							case 'a':
								if(!checkA) {
									checkA = true;
									sayfa++;
								}
								break;
							case 'b':
								if(!checkB) {
									checkB = true;
									sayfa++;
								}
								break;
							case 'c':
								if(!checkC) {
									checkC = true;
									sayfa++;
								}								
								break;
							default:
								break;
						}						
					}
					
					System.out.println("Elimizde " + sayfa + " sayfa var.");
					break;
				}
				case 5: // hoca alternatif yöntem
					String defter = "";
					for(int i = 0;i < 5;i++) {
						System.out.println("lütfen bir değer giriniz: ");
						switch (scanner.nextLine().charAt(0)) {
							case 'a','A':
								if(!defter.contains("a")) {
									defter += "a";
								}
								break;
							case 'b','B':
								if(!defter.contains("b")) {
									defter += "b";
								}
								break;
							case 'c','C':
								if(!defter.contains("c")) {
									defter += "c";
								}								
								break;
							default:
								if(!defter.contains("x")) {
									defter += "x";
								}
								break;
						}						
					}
					
					System.out.println("Açılan sayfa sayısı: " + defter.length());
					break;
				case 0:					
					menu = false;
					break;
				default:
					System.out.println("Geçersiz tercih.");
					break;
			}
			System.out.println("==================================================");
		}
		scanner.close();
		System.out.println("Programdan çıkılıyor...");
	}

}
