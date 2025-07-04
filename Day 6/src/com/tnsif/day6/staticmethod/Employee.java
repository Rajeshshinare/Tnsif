package com.tnsif.day6.staticmethod;

public class Employee {

//	Declare instance variable
	private String name;
	private int id;
	
//	Declare a static CompanyName with data type String
	static String companyName = "TNSIF";
	
//	Parameterized Constructor
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

//	ToString Method
	@Override
	public String toString() {
		return "Employee [name = " + name + ", id = " + id + ", Company Name = " +companyName +"]";
	}
	
	
}
