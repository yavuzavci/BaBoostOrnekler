package com.bilgeadam.lesson025.odev;

import static com.bilgeadam.lesson025.odev.Utility.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager {
	
	private List<Menu> haftalikMenu;
	
	public Manager() {
		this.haftalikMenu = new ArrayList<Menu>();
	}
	
	public List<Menu> getHaftalikMenu(){
		return haftalikMenu;
	}
	
	public void haftalikMenuOlustur() {	
		for(EGunler gun : GUNLER) {
			Menu menu = new Menu(gun);
			menu.setCorba(rastgeleCorbaSec());			
			menu.setYemek(rastgeleYemekSec());			
			menu.setTatli(rastgeleTatliSec());			
			menu.setIcecek(rastgeleIcecekSec());			
			haftalikMenu.add(menu);
		}
	}
	
	public void haftalikMenuyuYazdir() {
		for(Menu menu : haftalikMenu)
			System.out.println(menu.toString());
	}
	
}
