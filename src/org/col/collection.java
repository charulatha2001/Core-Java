package org.col;

import java.util.LinkedHashSet;
import java.util.Set;

public class collection {
	public static void main(String[] args) {
		Set<Integer> l = new LinkedHashSet<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		System.out.println("l : " + l);
		
		Set<Integer> k = new LinkedHashSet<Integer>();
		
		k.add(10);
		k.add(20);
		k.add(60);
		k.add(50);
		k.add(40);
		k.add(70);
		k.add(80);
		k.add(90);
		
		System.out.println("k : " + k);
		
		k.removeAll(l);
		System.out.println("Remove value : " + k);
	}

}
