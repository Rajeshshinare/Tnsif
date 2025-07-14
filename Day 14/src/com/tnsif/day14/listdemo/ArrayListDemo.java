package com.tnsif.day14.listdemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		List l = new ArrayList ();
		
		System.out.println(l.isEmpty());
		
		l.add(10);
		l.add(20);
		l.add("Raj");
		l.add(130);
		l.add(10.5f);
		l.add("Datta");
		l.add(true);
		l.add("Sahil");
		l.add(5.3f);
		l.add(100);
		
		System.out.println("List is: "+l);
		
		System.out.println(l.isEmpty());
		
		System.out.println(l.size());
		
		System.out.println(l.contains(1));
		
		l.remove(false);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		System.out.println(l.remove(l.lastIndexOf(20)));
		
		System.out.println(l);
		
		System.out.println(l.indexOf(20));
		
		l.clear();
		System.out.println(l);
		
		System.out.println("----------------------------------------------------");
		
		
//		Generics
		
		List <String> names = new ArrayList <String> ();
		names.add("Rajesh");
		names.add("Datta");
		names.add("Sahil");
		names.add("Mahesh");
		names.add("Rajesh");
		names.add("Aayan");
		
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		System.out.println(names.contains("Dattatray"));
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		
//		Iterators: Traversing in list
		Iterator <String> i = names.iterator();
		
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm+" ");
		}
		
		System.out.println(names);
		
		ListIterator <String> li=names.listIterator(names.size());
		
		while(li.hasPrevious()) {
			String nm = li.previous();
			System.out.println(nm);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
