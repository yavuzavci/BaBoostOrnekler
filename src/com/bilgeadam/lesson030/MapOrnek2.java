package com.bilgeadam.lesson030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {

	String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };
	int[] notlar = { 60, 80, 70 };
	int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
	
	Map<String, Integer> sinif = new HashMap<>();
	Map<String, int[]> sinif2 = new HashMap<>();
	// Alternatif Çözüm
	Map<String, List<Integer>> sinif3 = new HashMap<>();
	
	public void mapOlustur() {
		for (int i = 0; i < notlar.length; i++) {
	    	sinif.put(ogrenci[i], notlar[i]);
	    }
	}
	
	public void mapOlustur2() {
		for (int i = 0; i < notlar2.length; i++) {
			sinif2.put(ogrenci[i], notlar2[i]);
		}
	}
	// Alternatif Çözüm
	public void mapOlustur3() {
		for(int i = 0; i < ogrenci.length; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < notlar2[i].length; j++) {
				list.add(notlar2[i][j]);
			}
			sinif3.put(ogrenci[i], list);
		}
	}
	
	public static void main(String[] args) {
	    MapOrnek2 mapOrnek2 = new MapOrnek2();
	    mapOrnek2.mapOlustur();
	    System.out.println(mapOrnek2.sinif.get("Ece"));
//	    mapOrnek2.sinif.forEach((k, v) -> System.out.println(k + "-->" + v));
	    
	    for(Entry<String,Integer> r : mapOrnek2.sinif.entrySet()) {
	    	System.out.println(r.getKey() + "--->" + r.getValue());
	    }
	    System.out.println();
	    mapOrnek2.mapOlustur2();
	    mapOrnek2.sinif2.forEach((k, v) ->
	    	System.out.println(k + "-->" + Arrays.toString(v))
	    );
	    
	    // Alternatif Çözüm
	    System.out.println();
	    mapOrnek2.mapOlustur3();
	    mapOrnek2.sinif3.forEach((k, v) ->{
	    	System.out.println(k + ":");
	    	v.forEach(t -> System.out.print(t + " "));
	    	System.out.println();
	    });
	}
}
