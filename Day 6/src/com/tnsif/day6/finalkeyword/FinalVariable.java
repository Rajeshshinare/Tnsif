package com.tnsif.day6.finalkeyword;

public class FinalVariable {

//	final int a; 	// final instance variable must be initialized
	final int x = 100;
	
//	declare a static blank final variable
	final static int y;
	
	final static int z = 10;
	
//	instance method
	void change() {
//		final variable can't be change or re-assign
//		a = 20;
//		x = 30;
//		z = 50;
	}

	@Override
	public String toString() {
		return "FinalVariable [x= " + x + ", y= " +y+ "]";
	}
	
//	declare a static block
	static {
		y = 20;
//		z = 50; 		once initialized can't be re-assign
	}
}
