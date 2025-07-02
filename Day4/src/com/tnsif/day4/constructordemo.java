package com.tnsif.day4;
import java.util.*;
public class constructordemo {

	public static void main(String[] args) {
		
		Scanner sd = new Scanner(System.in);
	
		
		String name , city;
		int id;
		
		System.out.println("Enter Customer Id: ");
		id=sd.nextInt();
		sd.nextLine();
		System.out.println("Enter Customer Name: ");
		name=sd.nextLine();
		System.out.println("Enter customer city: ");
		city=sd.nextLine();	
		System.out.println(" ");
		
		Customer c1 = new Customer();
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		System.out.println(c1);
		
		Customer c2 = new Customer(name, id, city);
		c2.setCustomerCity(city);
		c2.setCustomerId(id);
		c2.setCustomerName(name);
		System.out.println(c2);
		
		
	}
	
	
}
