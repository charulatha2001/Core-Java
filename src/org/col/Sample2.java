package org.col;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample2 {
	public static void main(String[] args) {
		
		Set<Integer> k = new LinkedHashSet<Integer>();
		k.add(10);
		k.add(10);
		k.add(20);
		k.add(50);
		k.add(60);
		k.add(80);
		k.add(60);
		k.add(50);
		
		System.out.println(k);
	}

}
