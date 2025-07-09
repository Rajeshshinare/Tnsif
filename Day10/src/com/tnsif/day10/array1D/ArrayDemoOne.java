package com.tnsif.day10.array1D;


class ArrayOperation
{
	
	// Print Array Data
	static void printArray(int [] arr)
	{
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		
	}
	
	// Variable Argument Function
	public static int getSum(int... n)
	{
		int sum = 0;
		for (int no : n)
		{
			sum += no;
		}
		return sum;
	}
	
	// Count No. of Odd Elements
	public static int getOddCount(int b[])
	{
		int count = 0;
		for (int i = 0; i < b.length; i++)
		{
			if(b[i] % 2 != 0)
			{
				count++;
			}
		}
		return count;
	}
	
	
}


public class ArrayDemoOne 
{

	public static void main(String[] args) 
	{
	
		int n = 10;
		int a[];
		
		a = new int[n];
		
		
		ArrayOperation.printArray(a);
		
		for (int i = 0; i < a.length; i++)
		{
			a[i] = 5 * i;
			ArrayOperation.printArray(a);
			
		}
		
		ArrayOperation.printArray(a);
//
//		System.out.println(arrop.getSum(20));
//		System.out.println(arrop.getOddCount(arr2));
		
	}
	
}
