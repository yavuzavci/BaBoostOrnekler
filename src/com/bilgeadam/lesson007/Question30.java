package com.bilgeadam.lesson007;

import java.util.Scanner;

/*
*
* Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
* 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
* yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
* Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
* işlemler yazdıralım 2000ile bitiyorsa kıta içi işelmeler ve OTH yerine Ki
* 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200200…
*
*
*
*
*
*/

public class Question30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String iban;
		boolean ibanCheck = false;
		do {
			System.out.print("Lütfen IBAN girin: ");
			iban = scanner.nextLine();
			if(!iban.startsWith("TR") && !iban.startsWith("OTH"))
				System.out.println("Geçerli bir IBAN numarası girmediniz. ");			
			else
				ibanCheck = true;
			
		}while(!ibanCheck);		
		
		if(iban.startsWith("TR")) {
			System.out.println("Yurt içi işlemler");
			if(iban.endsWith("5001"))
				System.out.println("Ziraat Bankası");
			else if(iban.endsWith("5002"))
				System.out.println("Garanti Bankası");
			else if(iban.endsWith("5003"))
				System.out.println("İş Bankası");
			else
				System.out.println("Başka bir banka");
		}
		if(iban.startsWith("OTH")){
			System.out.println("Yurt dışı işlemler");
			if(iban.endsWith("2000")) {
				iban = iban.replace("OTH","Ki");
				System.out.println("Kıta içi işlemler");
			}
				
			else {
				iban = iban.replace("OTH","Kd");
				System.out.println("Kıta dışı işlemler");
			}				
		}
		System.out.println("IBAN..: " + iban);
		scanner.close();		
		
		
		/* 
		 * hoca çözümü - switch case TR
		 * 
		 * String bankaKodu = iban.substring(iban.length() - 4);
		
		switch(bankaKodu) {
			case "5001":
				System.out.println("Ziraat Bankası");
				break;
			case "5002":
				System.out.println("Garanti Bankası");
				break;
			case "5003":
				System.out.println("İş Bankası");
				break;
			default:
				System.out.println("Diğer");
				break;
		}
		 * 
		 * 
		 */
	}

}
