package com.tnsif.day6.finalkeyword;

public class FinalMethodClassDemo extends FinalMethodClass {
	
//	Compile time error because it is a final method
//	@Override
//	void show() {
//		System.out.println("This is a final method of a parent class");
//	}
	
	void display() {
		System.out.println("This is not a final method this is child class method ");
	}

}
