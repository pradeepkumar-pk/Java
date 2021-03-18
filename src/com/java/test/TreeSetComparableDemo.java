package com.java.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparableDemo {
	public static void main(String[] args) {
		Set<Student1> tset = new TreeSet<>();
		tset.add(new Student1(14));
		tset.add(new Student1(11));
		tset.add(new Student1(15));
		tset.add(new Student1(13));
		tset.add(new Student1(16));
		tset.add(new Student1(12));
		System.out.println("set: " + tset);
	}
}


class Student1 implements Comparable<Object>{
	int rollNo;
	
	Student1(int rollNo){
		this.rollNo = rollNo;
	}
	
	@Override
	public int compareTo(Object obj) {
		
		Student1 s = (Student1)obj;

		//return this.rollNo - s.rollNo; //for ascending order
		return s.rollNo - this.rollNo; //for descending order

		/*if(this.rollNo > s.rollNo)
			return -1;
		else if(this.rollNo < s.rollNo)
			return 1;
		else
			return 0;*/
	}
	
	public String toString() {
		return "" + rollNo;
	}
}



