package com.java.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("mnop", 40);
		map.put("abcd", 80);
		map.put(null, null);
		map.put("pqrs", 70);
		map.put("qwer", 60);
		map.put("stuv", 50);
		map.put("aaaa", null);
		map.put("ghij", 30);
		map.put("zzzz", 30);
	//	map.put(null, 3333);		
		System.out.println("map1: " + map);
		
	//	map.remove(null);
	//	System.out.println(map);
		
		Set<String> s = map.keySet();
		System.out.println("\nmap keysets: " + s);
		System.out.println("\nkeysets using iterator: ");
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection<Integer> coll1 = map.values();
		System.out.println("\nmap values: " + coll1);
		
		Collection<String> coll2 = map.keySet();
		System.out.println("\nmap keysets: " + coll2);
		
        // using keySet() for iteration over keys 
        for (String str : map.keySet()) {
        	System.out.println("key: " + str);
        }
             
          
        // using values() for iteration over keys 
        for (Integer intg : map.values()) {
        	System.out.println("value: " + intg);
        }
             

		//Iterating over Map.entrySet() using For-Each loop
        System.out.println("\nIterating over Map.entrySet() using For-Each loop");
		for(Map.Entry<String, Integer> entry: map.entrySet()) { //using for-each loop for and Map.entrySet()
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
		
		//Iterating using iterators over Map.Entry<K, V>
		System.out.println("\nIterating using iterators over Map.Entry<K, V>");
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator(); // using iterators and Map.entrySet()
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
		
		//Using forEach(action) method :
			/*In Java 8, you can iterate a map using Map.forEach(action) method and using lambda expression. This technique is clean and fast.*/
		System.out.println("\nusing Map.forEach(action) method and using lambda expression");
		map.forEach((k,v) -> System.out.println("key: " + k + ", value: " + v));
		/*public void iterateUsingLambda(Map<String, Integer> map) {
		    map.forEach((k, v) -> System.out.println((k + ":" + v)));
		}*/
		
		
		//Stream API is one of the main features of Java 8. We can use this feature to loop through a Map as well but as in previous examples, we need to obtain a set of entries first:		
		System.out.println("\nusing Map.forEach(action) method and using Stream API");
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));		
		/*public void iterateUsingStreamAPI(Map<String, Integer> map) {
		    map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
		}*/
	}
}


















