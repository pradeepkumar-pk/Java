package com.java.test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		Set<Integer> lhset = new LinkedHashSet<>();
		lhset.add(1);
		lhset.add(2);
		lhset.add(3);
		lhset.add(null);
		lhset.add(4);
		lhset.add(null);
		lhset.add(5);
		System.out.println("lhset1: " + lhset);
		lhset.remove(3);
		System.out.println("lhset2: " + lhset);
		
		System.out.println("\n---Using For Loop:");
		for(Integer i: lhset) {
			System.out.println("for: " + i);
		}
		
		System.out.println("\n---Using Iterator:");
		Iterator<Integer> it = lhset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
