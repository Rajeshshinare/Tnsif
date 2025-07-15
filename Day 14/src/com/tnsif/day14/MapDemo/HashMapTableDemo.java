package com.tnsif.day14.MapDemo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashMapTableDemo {

	public static void main(String[] args) {
		
		Hashtable <Integer, String> ht = new Hashtable <Integer, String>();
		
		ht.put(101, "Pune");
		ht.put(102, "Mumbai");
		ht.put(103, "Baraati");
		ht.put(104, "Nagar");
		ht.put(105, "Nanded");
		ht.put(101, "Pune");
		
		System.out.println(ht);
		
		ht.putIfAbsent(105, "PCMC");
		ht.put(101, "Satara");
		System.out.println(ht);
		
		ht.clone();
		System.out.println(ht);
		
		System.out.println(ht.replace(101, "Sangli"));
		System.out.println(ht);
		
		Set s = ht.keySet();
		System.out.println(s);
		
		Collection <String> c = ht.values();
		System.out.println(c);

	}
}
