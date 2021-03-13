package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		MapIteration mapIteration = new MapIteration();
		Map<String, Integer> map = new HashMap<>();

		map.put("One", 1);
		map.put("Three", 3);
		map.put("Two", 2);

		System.out.println("Iterating Keys of Map Using KeySet");
		mapIteration.iterateKeys(map);

		System.out.println("\nIterating Values of Map Using Values");
		mapIteration.iterateValues(map);

		System.out.println("\nIterating Map Using KeySet and ForEach");
		mapIteration.iterateUsingKeySetAndForeach(map);

		System.out.println("\nIterating Map Using EntrySet and ForEach");
		mapIteration.iterateUsingEntrySetAndForeach(map);

		System.out.println("\nIterating Map Using Iterator and Map Entry");
		mapIteration.iterateUsingIteratorAndEntry(map);

		System.out.println("\nIterating Map Using Lambda Expression");
		mapIteration.iterateUsingLambda(map);

		System.out.println("\nIterating Using Stream API");
		mapIteration.iterateUsingStreamAPI(map);
	}

	public void iterateKeys(Map<String, Integer> map) {
		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}

	public void iterateValues(Map<String, Integer> map) {
		for (Integer value : map.values()) {
			System.out.println(value);
		}
	}

	public void iterateUsingKeySetAndForeach(Map<String, Integer> map) {
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}

	public void iterateUsingEntrySetAndForeach(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public void iterateUsingIteratorAndEntry(Map<String, Integer> map) {
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> pair = iterator.next();
			System.out.println(pair.getKey() + ":" + pair.getValue());
		}
	}

	public void iterateUsingLambda(Map<String, Integer> map) {
		map.forEach((k, v) -> System.out.println((k + ":" + v)));
	}

	public void iterateUsingStreamAPI(Map<String, Integer> map) {
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}

}