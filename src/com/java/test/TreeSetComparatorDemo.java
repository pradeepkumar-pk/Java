package com.java.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparatorDemo {
	public static void main(String[] args) {
		Set<Integer> tset = new TreeSet<>((Integer i1, Integer i2) -> { 
				if (i1 < i2)
					return 1;
				else if (i1 > i2)
					return -1;
				else
					return 0;
				}); //using lambda expression
		
		
		/*Set<Integer> tset = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				if (i1 < i2)
					return 1;
				else if (i1 > i2)
					return -1;
				else
					return 0; //for descending order
				
				if (i1 > i2)
					return 1;
				else if (i1 < i2)
					return -1;
				else
					return 0; //for ascending order(natural order)
			}
		});*/

		tset.add(56);
		tset.add(23);
		tset.add(67);
		tset.add(45);
		tset.add(12);
		tset.add(34);
		System.out.println("tset1: " + tset);

		System.out.println("\n---Using For iterator:");
		Iterator<Integer> it = tset.iterator();
		while (it.hasNext()) {
			System.out.println("iterator: " + it.next());
		}
	}
}
