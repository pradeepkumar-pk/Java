package com.java.test;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String, Integer> htab = new Hashtable<>();
		htab.put("mnop", 40);
		htab.put("abcd", 80);
		htab.put("pqrs", 70);
		htab.put("qwer", 60);
		htab.put("stuv", 50);
		htab.put("ghij", 30);
		System.out.println("lmap: " + htab);
		
		Enumeration<String> e = htab.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Enumeration<Integer> ee = htab.elements();		
		while(ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}
				
	}
}
