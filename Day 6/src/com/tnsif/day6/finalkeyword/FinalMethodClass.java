package com.tnsif.day6.finalkeyword;

public class FinalMethodClass {

//	constructor
	public FinalMethodClass(){
		System.out.println("This is a default constructor");
	}
	
	final int a = 50;
	
//	final method
	final void show() {
		System.out.println("Value of a: "+a);
	}
}
