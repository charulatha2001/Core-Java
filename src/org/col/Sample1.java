package org.col;

import java.util.LinkedList;
import java.util.List;

public class Sample1 {
	public static void main(String[] args) {
		
		List<Integer> m = new LinkedList<Integer>();
		
		m.add(100);
		m.add(200);
		m.add(300);
		m.add(400);
		m.add(500);
		m.add(600);
		m.add(700);
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
	}

}
