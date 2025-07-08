package com.tnsif.day8.nesteddemo;

public class NestedDemo implements OuterInterface , OuterInterface.InnerInterface {

	@Override
	public void calArea() {
		System.out.println("Outer Interface");
		
	}

	@Override
	public void print() {
		System.out.println("Inner Interface");		
	}

	
}
