package com.java.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<Student> list = new LinkedList<>();
		list.add(new Student(1, "pk"));
		list.add(new Student(2, "sk"));
		list.add(new Student(3, "ravi"));
		list.add(new Student(4, "neeraj"));
		list.add(new Student(4, "chuhiya"));
		System.out.println("List1: " + list);
		
		list.remove(0);
		System.out.println("\nList2: " + list);
		
		System.out.println("\n-----using iterator");
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("iterator: " + it.next());
		}
		
		System.out.println("\n-----using list_iterator");
		ListIterator<Student> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println("list_iterator: " + lit.next());
		}
		
		System.out.println("\n-----using for loop");
		for(Student stu: list) {
			System.out.println("for: " + stu);
		}
	}
}

class Student {
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
}