package com.java.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("dd");
		set.add("ee");
		System.out.println("set1: " + set);

		set.remove("dd");
		System.out.println("set2: " + set);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println("iterator: " + it.next());
		}

		for (String str : set) {
			System.out.println("for: " + str);
		}
	}
}
