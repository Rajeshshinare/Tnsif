package com.tnsif.day4.firstPackage;

import com.tnsif.day4.Base;

public class Executor {

	public static void main(String[] args) {

//		accessing different package class
		Base b1 = new Base();
		
//		private, default, protected, public
		b1.methodPublic();
		b1.varPublic=3564;
		b1.methodPublic();
		
	}

}
