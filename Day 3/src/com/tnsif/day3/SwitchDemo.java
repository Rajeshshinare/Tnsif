package com.tnsif.day3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner ds = new Scanner(System.in);
		System.out.println("1) Current Recharge Details: ");
		System.out.println("2) Current Recharge Expiry: ");
		System.out.println("3) New Offers: ");
		System.out.println("4) Talk to our customer Support Person: ");
		
		System.out.println("Please Enter your Choice: ");
		
		int userInput = ds.nextInt();
		
		switch (userInput) {
		
		case 1: 
			System.out.println("Current Recharge Details: ");
		break;
		
		case 2: 
			System.out.println("Current Recharge Expiry: ");
		break;
		
		case 3: 
			System.out.println("New Offers: ");
		break;
		
		case 4: 
			System.out.println("Talk to our customer Support Person: ");
		break;
		
		default: 
			System.out.println(userInput + " is not a valid input given by you..!");
		}
	}

}
