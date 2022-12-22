package com.bilgeadam.lesson033;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
/*
 * skt geçmemiş ürünlere %54 zam yapalım
 * bunları bir sete atalım.
 * sonra seti yazdıralım.
 * 
 * ürünlerimizin fiyatlarının ortalamasını getiren stream kodunu yazın.
 */
public class UrunManager {
	
	List<Urun> urunler = new ArrayList<>();
	List<Optional<Urun>> yeniurunler = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	public Urun urunOlustur() {
		System.out.println("Ürün adını giriniz");
		String urunAdi = scanner.nextLine();
		System.out.println("Ürün fiyatını giriniz");
		double fiyat = Double.parseDouble(scanner.nextLine());
		System.out.println("Ürün son kullanma tarihini giriniz");
		int skt = Integer.parseInt(scanner.nextLine());
		return (urunAdi == null || urunAdi.isEmpty() || fiyat <= 0) 
				? null 
				: new Urun(urunAdi,fiyat,skt);
	}
	
	public Optional<Urun> urunOlustur2(){
		System.out.println("Ürün adını giriniz");
		Optional<String> urunAdi = Optional.ofNullable(scanner.nextLine());
		System.out.println("Ürün fiyatını giriniz");
		Optional<Double> fiyat = Optional.ofNullable(Double.parseDouble(scanner.nextLine()));
		System.out.println("Ürün son kullanma tarihini giriniz");
		Optional<Integer> skt = Optional.ofNullable(Integer.parseInt(scanner.nextLine()));		
		
		return (!urunAdi.isPresent() 
				|| !fiyat.isPresent() || fiyat.get() <= 0 
				|| !skt.isPresent())
				? Optional.empty()
				: Optional.of(new Urun(urunAdi.get(),fiyat.get(),skt.get()));
	}
	
	public void urunEkle(Optional<Urun> urun) {
		if(urun.isPresent())
			urunler.add(urun.get());
	}
	
	public void tarihiGecmisUrunleriYazdir() {
		urunler.stream()
			.filter(x -> x.getSonKullanmaTarihi() < 2022)
			.toList()
			.forEach(System.out::println);
	}
	public void tarihiGecmemisUrunlereZamYapVeYazdir() {
		urunler.stream()
		.filter(x ->{
			if(x.getSonKullanmaTarihi() > 2022) {
				x.setFiyat(x.getFiyat() * 1.54);
				return true;
			}
			return false;
		})
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
//      Set<Urun> zamliUrunler = urunler.stream().filter((x) -> x.getSonKullanmaTarihi() > 2022).map((y) -> {
//    	  y.setFiyat(y.getFiyat() * 1.54);
//    	  return y;
//      	}).collect(Collectors.toSet());
		
//		zamliUrunler.forEach(System.out::println);
	}
	
	public void fiyatOrtalamasiniBulVeYazdir() {
		System.out.println("Ortalama fiyat...: " + 
				urunler.stream().collect(Collectors.averagingDouble(Urun::getFiyat)));
	}
	
}
