package com.bilgeadam.lesson042.yuzmetreyaris;

/*
 * Kosucu bir thread olacak
 * kosucunun => ismi, mesafe, sure
 * 
 * ismi ile bir kosucu olusturabileceğiz
 * 
 * thread için bir metot yazacağız
 * bu metotta her koşucu 100 metreye kadar koşacak
 * ve döngü her çalıştığında 1 metre mesafe alacak
 * her döngü arasında metodumuz 200ms beklesin ve
 * her 10 metrede bir bilgilendirme yazalım
 * 	mustafa ---> 10. metrede
 * 	mustafa ---> 20. metrede
 * 
 * metodun sonunda da 
 * mustafa adlı koşucu 100 metreyi 20000 milisaniyede koştu
 * 
 * 
 * -YuzMetreYarisi class ında 5 tane koşucu oluşturup thread leri çalıştıralım
 * 
 */
public class Kosucu implements Runnable {
	
	private String isim;
	private int mesafe;
	private long sure;
	private long baslangicZamani;
	private final long beklemeSuresi = 200L;
	
	
	public Kosucu(String isim, long baslangicZamani) {
		super();
		this.isim = isim;
		this.baslangicZamani = baslangicZamani;
		mesafe = 0;
		sure = 0;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMesafe() {
		return mesafe;
	}

	public void setMesafe(int mesafe) {
		this.mesafe = mesafe;
	}	

	public long getSure() {
		return sure;
	}

	public void setSure(long sure) {
		this.sure = sure;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				mesafe++;
				if(mesafe == 100) break;
				
				if(mesafe % 10 == 0)
					System.out.println(isim + " ===> " + mesafe + ". metrede");
				Thread.sleep(50);
			}
			long end = System.currentTimeMillis();
			sure = end - baslangicZamani;
			System.out.println(isim + " adlı koşucu " + mesafe + " metreyi " + sure + " milisaniyede koştu.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Kosucu [isim=" + isim + ", mesafe=" + mesafe + ", sure=" + sure + "]";
	}
	
	

}
