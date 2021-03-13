package com.java.test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("mnop", 40);
		map.put("abcd", 80);
		map.put("pqrs", 70);
		map.put("qwer", 60);
		map.put("stuv", 50);
		map.put("ghij", 30);
		System.out.println("lmap: " + map);
		
		
	}
}
