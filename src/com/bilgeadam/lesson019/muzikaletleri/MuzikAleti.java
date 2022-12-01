package com.bilgeadam.lesson019.muzikaletleri;

public class MuzikAleti {
	String mensei;
	String uretimTarihi;
	String ad;
	String tur;
	double boyut;
	
	public MuzikAleti() {
		
	}
	
	public MuzikAleti(String Mmensei, String MuretimTarihi, String Mad, String Mtur, double Mboyut) {
		mensei = Mmensei;      
		uretimTarihi = MuretimTarihi;
		ad = Mad;
		tur = Mtur;
		boyut = Mboyut;
	}
	
	public void cal() {
		System.out.println(ad + " Çalınıyor");
	}
	
	public void bilgileriGoster() {
		System.out.println("ad= " + ad);
		System.out.println("menşei= " + mensei);
		System.out.println("üretim tarihi= " + uretimTarihi);
		System.out.println("tür= " + tur);
		System.out.println("boyut= " + boyut);
	}
	
}
