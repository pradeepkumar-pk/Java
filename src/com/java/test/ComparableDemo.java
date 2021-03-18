package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ComparableDemo {
	public static void main(String[] args) {
		List<StudentComparable> list = new ArrayList<>();
		list.add(new StudentComparable(86, "pradeep", 27));
		list.add(new StudentComparable(24, "neeraj", 25));
		list.add(new StudentComparable(78, "ravi", 27));
		list.add(new StudentComparable(99, "sanjeev", 26));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("\nIterating List Using Iterator and While loop");
		Iterator<StudentComparable> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nIterating List Using ListIterator and While loop");
		ListIterator<StudentComparable> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println("\nIterating List Using For loop");
		for(StudentComparable stu: list) {
			System.out.println(stu);
		}
	}
}

class StudentComparable implements Comparable<StudentComparable> {
	int rollNo;
	String name;
	int age;
	
	public StudentComparable(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "StudentComparable [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(StudentComparable o) {
		
		return this.age - o.age;
		
		//alternate method.
		/*if(this.age > o.age)
			return 1;
		else if(this.age < o.age)
			return -1;
		else
			return 0;*/
	}
}
