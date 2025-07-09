package com.tnsif.day10.array1D;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		
//		get the array
		int intArr[] = {69,20,12,40,35};
		
//		print the array
		System.out.println(intArr);
		System.out.println(Arrays.toString(intArr));
		
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
//			System.out.print(intArr[i]+" ");
		}
		
		System.out.println();
		
//		Sorting
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
//		Binary Search
		System.out.println(Arrays.binarySearch(intArr,12));
		System.out.println(Arrays.binarySearch(intArr,9));

	}
}
