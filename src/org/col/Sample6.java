package org.col;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Sample6 {
	public static void main(String[] args) {
		List<Integer> l = new Vector<Integer>();
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		l.add(100);
		l.add(300);
		l.add(500);
		
		
		System.out.println(l);
		
		Set<Integer> s = new TreeSet<Integer>();
		
		s.addAll(l);
		System.out.println(s);
	}

}
