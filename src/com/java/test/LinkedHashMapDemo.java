package com.java.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("mnop", 40);
		map.put("abcd", 80);
		map.put("pqrs", 70);
		map.put("qwer", 60);
		map.put("stuv", 50);
		map.put("ghij", 30);
		System.out.println("lmap: " + map);
		
		//map.remove("stuv");
		//System.out.println("\nlmap: " + map);
		
		System.out.println("keys:");
		for(String str: map.keySet()) {
			System.out.println(str);
		}
		
		System.out.println("\nvalues:");
		for(Integer i: map.values()) {
			System.out.println(i);
		}
		
		System.out.println("\nIterating Map Using EntrySet and ForEach");
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("\nIterating Map Using Iterator and Map Entry");
		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> pair = it.next();
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}
		
		System.out.println("\nIterating Map Using Lambda Expression");
		map.forEach((k,v)-> System.out.println(k + ":" + v));
		
		System.out.println("\nIterating Using Stream API");
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey()+ ":" + e.getValue()));
	}
}

















