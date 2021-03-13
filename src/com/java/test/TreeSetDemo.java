package com.java.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> tset = new TreeSet<>();
		tset.add(56);
		tset.add(23);
		tset.add(67);
		// tset.add(null); //will throw error
		tset.add(45);
		tset.add(12);
		tset.add(34);
		System.out.println("tset1: " + tset);
		
		tset.remove(4);
		System.out.println("tset2: " + tset);
		
		System.out.println("\n---Using For Loop:");
		for(Integer i: tset) {
			System.out.println("for: " + i);
		}
		
		System.out.println("\n---Using For iterator:");
		Iterator<Integer> it = tset.iterator();
		while(it.hasNext()) {
			System.out.println("iterator: " + it.next());
		}
		
	}
}
