package com.bilgeadam.lesson042.taksiapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Durak {
	public static List<Taksi> taksiler;
	public static Queue<Integer> musteriKuyrugu;
	
	static {
		taksiler = new ArrayList<Taksi>();
		for(int i = 1; i < 11; i++)
			taksiler.add(new Taksi(i));
		
		musteriKuyrugu = new LinkedList<Integer>();
		for(int i = 1; i < 101; i++)
			musteriKuyrugu.offer(i);
	}
}
