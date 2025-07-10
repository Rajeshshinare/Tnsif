package com.tnsif.day10.array1D;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		
//		Student s = new Student (0, null);
		Student [] arr;
		
//		declare memory for 5 object or type students
		arr = new Student[5];
		
		arr [0] = new Student(101, "Rajesh");
		arr [1] = new Student(102, "Sahil");
		arr [2] = new Student(103, "Datta");
		arr [3] = new Student(104, "Mahesh");
		arr [4] = new Student(105, "Aayan");

		for(int i=0; i<arr.length; i++) {
			System.out.println("Elements at "+i+" : "+arr[i].getRollNo()+"  "+arr[i].getName());
		}
	}
}
