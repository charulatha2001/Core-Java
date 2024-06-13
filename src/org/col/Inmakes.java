package org.col;

import java.util.Set;
import java.util.TreeSet;

public class Inmakes {
	public static void main(String[] args) {
		
		Set<Integer> m = new TreeSet<Integer>();
		
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);
		m.add(70);
		m.add(80);
		
		System.out.println("m : " + m);
		
		Set<Integer> n = new TreeSet<Integer>();
		
		n.add(100);
		n.add(100);
		n.add(300);
		n.add(400);
		n.add(500);
		n.add(600);
		n.add(700);
		n.add(800);
		
		System.out.println("n : " + n);
		
		n.removeAll(m);
		System.out.println("Remove value : " + n);
		
	}

}
