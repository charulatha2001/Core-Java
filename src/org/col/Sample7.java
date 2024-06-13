package org.col;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample7 {
	public static void main(String[] args) {
		
		Set<Integer> v = new LinkedHashSet<Integer>();
		
		v.add(105);
		v.add(205);
		v.add(305);
		v.add(405);
		v.add(505);
		v.add(605);
		v.add(705);
		v.add(805);
		
		System.out.println(v);
		
		for (Integer value : v) {
			System.out.println(value);
			
		}
		
			
		}
	}


