package com.tnsif.association.hasA;

public class Executor {

	public static void main(String[] args) {

		Address address = new Address("5903 Laxminagar", "Pune", "Maharashtra", "412105");
		
		Person p = new Person("Rajesh",address);
		p.displayInfo();
		System.out.println(p);
	}

}


