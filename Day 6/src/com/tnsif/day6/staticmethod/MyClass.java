package com.tnsif.day6.staticmethod;

public class MyClass {

	
	private int section;  // non static variable or instance variable
	
	private static int srNo; // static or class variable
	
	// static Block
	static
	{
		System.out.println("---------Within Static Block---------");
		srNo = 1000;
//		section = 101; cannot use non static variable in static section
	}
	
//	default constructor
	public MyClass() {
		System.out.println("-------Within Default Constructor-------");
		srNo++;
		section++;
	}

//	 toString
	@Override
	public String toString() {
		return "MyClass [serial No = "+srNo +", section = " + section + "]";
	}
	
//	static method
	static void display() {
//		System.out.println("section : "+section); can't be access non static method
		System.out.println("Serial No : "+srNo);
	}
}
