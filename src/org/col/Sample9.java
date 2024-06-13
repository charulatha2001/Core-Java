package org.col;

import java.util.HashSet;
import java.util.Set;

public class Sample9 {
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		
		System.out.println("s1 : " +s1);
		
		Set<Integer> s2 = new HashSet<Integer>();
		
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(80);
		
		System.out.println("s2 : " +s2);
	
		s2.removeAll(s1);
		System.out.println("Remove value : " + s2);
		
		
	}

}
