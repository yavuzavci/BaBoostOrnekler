package com.bilgeadam.lesson005;

import java.util.Scanner;

//Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
//burc hesabı yapan program



//Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak



//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mart
public class Question22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		boolean kontrol = false;
		
		do {
			kontrol = false;
			
			System.out.print("Lütfen doğduğunuz günün ayın kaçıncı günü olduğunu girin(1-31 arası)..: ");
			int gun = scanner.nextInt();
			System.out.print("Lütfen doğduğunuz ayın yılın kaçıncı ayı olduğunu girin(1-12 arası)...: ");
			int ay = scanner.nextInt();
			
			switch(ay) {
			case 1:
				if(gun >= 1 && gun <22) {
					System.out.println("Burcunuz Oğlak");
				}
				else if(gun >=22 && gun <= 31){
					System.out.println("Burcunuz Kova");
				}
				else {
					System.out.println("Ocak Ayının son gün 31 Ocaktır ve  ilk günü 1 Ocaktır\nsizin girdiğiniz değer: " + gun);
					kontrol = true;
				}
				break;
			case 2:
				if(gun >= 1 && gun <20) {
					System.out.println("Burcunuz Kova");
				}
				else if(gun >=20 && gun <= 29){
					System.out.println("Burcunuz Balık");
				}
				else {
					System.out.println("Şubat Ayının son gün 29 Şubattır  ve  ilk günü 1 Şubattır\nsizin girdiğiniz değer: " + gun);
					kontrol = true;
				}
				break;
			case 3:
				if(gun >= 1 && gun <20) {
					System.out.println("Burcunuz Balık");
				}
				else if(gun >=21 && gun <= 31){
					System.out.println("Burcunuz Koç");
				}
				else {
					System.out.println("Mart Ayının son gün 31 Marttır  ve  ilk günü 1 Marttır\nsizin girdiğiniz değer: " + gun);
					kontrol = true;
				}
				break;
			case 4:
				if(gun >= 1 && gun <21) {
					System.out.println("Burcunuz Koç");
				}
				else if(gun >=21 && gun <= 30){
					System.out.println("Burcunuz Boğa");
				}
				else {
					System.out.println("Nisan Ayının son gün 30 Nisandır  ve  ilk günü 1 Nisandır\nsizin girdiğiniz değer: " + gun);
					kontrol = true;
				}
				break;
			case 5:
				if(gun >= 1 && gun <22) {
					System.out.println("Burcunuz Boğa");
				}
				else if(gun >=22 && gun <= 31){
					System.out.println("Burcunuz İkizler");
				}
				else {
					System.out.println("Mayıs Ayının son gün 31 Mayıstır  ve  ilk günü 1 Mayıstır\\nsizin girdiğiniz değer: \" + gun");
					kontrol = true;
				}
				break;
			case 6:
				if(gun >= 1 && gun <23) {
					System.out.println("Burcunuz İkizler");
				}
				else if(gun >=23 && gun <= 30){
					System.out.println("Burcunuz Yengeç");
				}
				else {
					System.out.println("Haziran Ayının son günü 30 Temmuzdur ilk günü 1 Hazirandır,\n sizin girdiğiniz değer:" + gun);
					kontrol = true;
				}
				break;
			case 7:
				if(gun >= 1 && gun <23) {
					System.out.println("Burcunuz Yengeç");
				}
				else if(gun >=23 && gun <= 31){
					System.out.println("Burcunuz Aslan");
				}
				else {
					System.out.println("Temmuz Ayının son günü 31 Temmuzdur ilk günü 1 Temmuzdur,\n sizin girdiğiniz değer:" + gun);
					kontrol = true;
				}
				break;
			case 8:
				if(gun >= 1 && gun <23) {
					System.out.println("Burcunuz Aslan");
				}
				else if(gun >=23 && gun <= 31){
					System.out.println("Burcunuz Başak");
				}
				else {
					System.out.println("Ağustos Ayının son günü 31 Ağustostur ilk günü 1 Ağustosdur ,\n sizin girdiğiniz değer:" + gun);
					kontrol = true;
				}
				break;
			case 9:
				if(gun >= 1 && gun <23) {
					System.out.println("Burcunuz Başak");
				}
				else if(gun >=23 && gun <= 30){
					System.out.println("Burcunuz Terazi");
				}
				else {
					System.out.println("Eylül Ayının son günü 30 Eylüldür ilk günü 1 Eylüldür,\n sizin girdiğiniz değer:" + gun);
					kontrol = true;
				}
				break;
			case 10:
				if(gun >= 1 && gun <23) {
					System.out.println("Burcunuz Terazi");
				}
				else if(gun >=23 && gun <= 31){
					System.out.println("Burcunuz Akrep");
				}
				else {
					System.out.println("Ekim Ayının son günü 31 Ekimdir ilk günü 1 Ekimdir,\n sizin girdiğiniz değer:" + gun);
					kontrol = true;
				}
				break;
			case 11:
				if(gun >= 1 && gun <22) {
					System.out.println("Burcunuz Akrep");
				}
				else if(gun >=22 && gun <= 30){
					System.out.println("Burcunuz Yay");
				}
				else {
					System.out.println("Kasım Ayının son günü 30 Kasımdır ilk günü 1 Kasımdır ,\n sizin girdiğiniz değer:" + gun);
					kontrol = true;
				}
				break;
			case 12:
				if(gun >= 1 && gun <22) {
					System.out.println("Burcunuz Yay");
				}
				else if(gun >=22 && gun <= 31){
					System.out.println("Burcunuz Oğlak");
				}
				else {
					System.out.println("Aralık Ayının son günü 31 Aralıktır ilk günü 1 Aralıktır ,\n sizin girdiğiniz değer:" + gun);
					kontrol = true;
				}
				break;
			default:
				System.out.println("Bir yılda 12 ay vardır. Lütfen 1 ile 12 arasında ayı giriniz.");
				kontrol = true;
				break;
				
		}
			
		} while (kontrol);
		
		scanner.close();		
		
	}// Main sonu
} // Class sonu
