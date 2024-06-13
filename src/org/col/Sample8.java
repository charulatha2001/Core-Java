package org.col;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample8 {
	public static void main(String[] args) {
		
		
		Set<Integer> k = new HashSet<Integer>();

		
		k.add(10);
		k.add(20);
		k.add(30);
		k.add(40);
		k.add(50);
		k.add(60);
		k.add(70);
		k.add(80);
		k.add(90);
		k.add(10);
		k.add(20);
		
		System.out.println(k);
		for (Iterator<Integer> iterator = k.iterator(); iterator.hasNext();) {
			Integer value = (Integer) iterator.next();
			System.out.println(value);
			
		}
		
			
		}
		
		
		
		
	}


