package com.tnsif.day3;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		
		int num = 20;
		
		for(int i=10; i<=num; i++) {
			
			for (int j=1; j<=10; j++) {
				
		System.out.print(i*j+" ");
				System.out.println(i+ "*" +j+ " = " +i*j);
				
			}
			
			System.out.println(" ");
			
		}
		
		
//		Star Pattern
//		int row = 6;
//		for(int i=1; i<=row; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
	}
}
