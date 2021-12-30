package com.devsuperior.m19.genericsMaps.set.application;

import java.util.HashSet;
import java.util.Set;

public class Main_Hashset {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		set.remove("Tablet");
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
