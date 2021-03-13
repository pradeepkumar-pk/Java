package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<StudentComparator> list = new ArrayList<>();
		list.add(new StudentComparator(56, "ravi", 27));
		list.add(new StudentComparator(60, "neeraj", 25));
		list.add(new StudentComparator(18, "pradeep", 27));
		list.add(new StudentComparator(99, "sanjeev", 26));
		
		System.out.println(list);

		System.out.println("\nSorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(list, new AgeComparator());
		//Traversing the elements of list  
		for(StudentComparator st: list){  
		System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		}
		
		System.out.println("\nSorting by Roll");  
		//Using RollComparator to sort the elements  
		Collections.sort(list, new RollComparator());
		//Traversing the elements of list  
		for(StudentComparator st: list){  
		System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		}
		
		System.out.println("\nSorting by Name");  
		//Using NameComparator to sort the elements  
		Collections.sort(list, new NameComparator());
		//Traversing the elements of list  
		for(StudentComparator st: list){  
		System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		}
		
		System.out.println("\nSorting by AgeAndName");  
		//Using AgeAndNameComparator to sort the elements  
		Collections.sort(list, new AgeAndNameComparator());
		//Traversing the elements of list  
		for(StudentComparator st: list){  
		System.out.println(st.rollNo+" "+st.name+" "+st.age);  
		}

	}
}

class RollComparator implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		 // return o1.rollNo.compareTo(o2.rollNo); //Cannot invoke compareTo(int) on the primitive type int.

		return o1.rollNo - o2.rollNo;
		
		//alternate method
		/*if (o1.rollNo > o2.rollNo)
			return 1;
		else if (o1.rollNo < o2.rollNo)
			return -1;
		else
			return 0;*/
	}
}

class NameComparator implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o1.name.compareTo(o2.name);
	}
}

class AgeComparator implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o1.age.compareTo(o2.age);
		
		//alternate method
		//return o1.age - o2.age;
	}
}

class AgeAndNameComparator implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		//int flag = o1.age - o2.age;
		int flag = o1.age.compareTo(o2.age);
		if(flag == 0) {
			return o1.name.compareTo(o2.name);
		}
		return flag;
	}
	
}

class StudentComparator {
	int rollNo;
	String name;
	Integer age;

	
	public StudentComparator(int rollNo, String name, Integer age) {	
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "StudentComparable [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
}