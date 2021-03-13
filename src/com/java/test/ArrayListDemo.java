package com.java.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		try {
			List<String> list = new ArrayList<>();

			list.add("samsung");
			list.add("lg");
			list.add("nokia");
			list.add("htc");
			list.add(3, "motorola");
			System.out.println("List1: " + list);

			list.remove("lg");
			list.remove(1);
			System.out.println("List2: " + list);
			System.out.println("List size: " + list.size());

			System.out.println("\n---Using For Loop:");
			for (String str : list) {
				System.out.println("for: " + str);
			}

			// Iterator it = list.iterator(); //It will also work.
			Iterator<String> it = list.iterator();
			System.out.println("\n---Using Iterator:");
			while (it.hasNext()) {
				System.out.println("iterator: " + it.next());
			}

			// Creating object of ListIterator<String> using listIterator() method
			ListIterator<String> iterator = list.listIterator();
			// ListIterator iterator = list.listIterator();

			// Printing the iterated value
			System.out.println("\n---Using ListIterator:");
			while (iterator.hasNext()) {
				System.out.println("Value is : " + iterator.next());
			}
		} catch (NullPointerException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
