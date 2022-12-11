package com.bilgeadam.lesson025.odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utility {
	
	public static final Random random = new Random();
	public static final EGunler[] GUNLER = EGunler.values();
	private static final List<ECorbalar> corbalar = new ArrayList<>(Arrays.asList(ECorbalar.values()));
	private static final List<EIcecekler> icecekler = new ArrayList<>(Arrays.asList(EIcecekler.values()));
	private static final List<ETatlilar> tatlilar = new ArrayList<>(Arrays.asList(ETatlilar.values()));
	private static final List<EYemekler> yemekler = new ArrayList<>(Arrays.asList(EYemekler.values()));
	
	public static ECorbalar rastgeleCorbaSec() {
		Collections.shuffle(corbalar);
		return corbalar.remove(0);
	}
		
	public static EIcecekler rastgeleIcecekSec() {
		Collections.shuffle(icecekler);
		return icecekler.remove(0);
	}
	
	public static ETatlilar rastgeleTatliSec() {
		Collections.shuffle(tatlilar);
		return tatlilar.remove(0);
	}
	
	public static EYemekler rastgeleYemekSec() {
		Collections.shuffle(yemekler);
		return yemekler.remove(0);
	}
}
