package org.col;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample4 {
	public static void main(String[] args) {
		
		
		Set<Integer> b = new LinkedHashSet<Integer>();
		
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
		b.add(90);
		b.add(10);
		b.add(20);
		
		System.out.println(b);
	}

}
