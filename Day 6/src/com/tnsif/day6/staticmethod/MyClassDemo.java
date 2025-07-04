package com.tnsif.day6.staticmethod;

public class MyClassDemo {

	public static void main(String[] args) {
		
		MyClass.display();
		System.out.println();
		
		MyClass o1 = new MyClass();
		System.out.println(o1);
		System.out.println();
	
		MyClass.display();
		System.out.println();

		MyClass o2 = new MyClass();
		System.out.println(o2);
		System.out.println();
		
		MyClass o3 = new MyClass();
		System.out.println(o3);
		System.out.println();
		
		
	}
}
