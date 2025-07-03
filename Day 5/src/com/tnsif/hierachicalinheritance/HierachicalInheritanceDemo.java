package com.tnsif.hierachicalinheritance;

public class HierachicalInheritanceDemo {

	public static void main(String[] args) {
		
//		Person p = new Person();
//		Student s = new Student();
//		Employee e = new Employee();
//		
//		System.out.println(p);
//		System.out.println(s);
//		System.out.println(e);
		
		Person p1 = new Person();
		System.out.println("-------Person Details--------");
		System.out.println(p1);
		System.out.println("------------------------------");
		
		Person p;
		p = new Person ("Rajesh", "Pune");
		System.out.println("Person Details: "+ p);
		
		p = new Student ("Datta", "Mumbai", "TE", 78.22f);
		System.out.println("Student Details "+p);
		
	    p = new Employee("Sahil", "Pune", "123", 116545, "Developer");
		System.out.println("Employee Details "+p);
	}

}
