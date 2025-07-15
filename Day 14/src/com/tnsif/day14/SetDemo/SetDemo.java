package com.tnsif.day14.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set <Integer> set = new HashSet <Integer> ();
		
		set.add(100);
		set.add(55);
		set.add(10);
		set.add(100);
		set.add(500);
		set.add(50);
		set.add(66);
		set.add(70);
		
		System.out.println(set);
		
		boolean b = set.contains(70);
		System.out.println(b);
		
		boolean b1 = set.isEmpty();
		System.out.println(b1);
		
		set.remove(70);
		System.out.println(set);
		
		Iterator <Integer> i = set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
