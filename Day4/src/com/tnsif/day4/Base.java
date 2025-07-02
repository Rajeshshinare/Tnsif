package com.tnsif.day4;

public class Base {

//	declare default, private, protected and public variables
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
//	declare default, private, protected and public methods
	
	void methodDefault() {
		System.out.println("default access base class");
		System.out.println("default variable: "+varDefault);
	}
	public void methodPublic() {
		System.out.println("public access base class");
		System.out.println("public variable: "+varPublic);
	}
	private void methodPrivate() {
		System.out.println("private access base class");
		System.out.println("private variable: "+varPrivate);
	}
	protected void methodProtected() {
		System.out.println("protected access base class");
		System.out.println("protected variable: "+varProtected);
	}
	
}
