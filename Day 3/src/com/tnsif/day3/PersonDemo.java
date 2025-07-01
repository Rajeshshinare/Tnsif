package com.tnsif.day3;
import java.util.*;
public class PersonDemo {
	public static void main(String[] args) {
		
//		Scanner object to accept user input
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Enter person name: ");
		name = sc.next();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Enter gender: ");
		String gender = sc.next();
		System.out.println("Enter Mobile Number: ");
		long mobileNumber = sc.nextLong();
		System.out.println("Enter income: ");
		int income = sc.nextInt();
		
		
//		person object and initialized values using setter
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobileNumber(mobileNumber);
		
		
//		by using getter method i am reading the data
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
//		display person details using toSting() method
		System.out.println(person);
		
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After calculation of Tax: ");
		System.out.println(person);
		
	}
}
