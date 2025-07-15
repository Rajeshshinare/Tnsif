package com.tnsif.day14.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		
		Set <Student> set = new HashSet <Student> ();
		
		set.add(new Student(101,"Rajesh", 54.09)); 
		set.add(new Student(101,"Rajesh", 54.09)); // Duplicate
		set.add(new Student(102,"Datta", 66.06));
		set.add(new Student(103,"Sahil", 78.00));
		set.add(new Student(104,"Mahesh", 55.02));
		
		System.out.println(set);
	}
}
