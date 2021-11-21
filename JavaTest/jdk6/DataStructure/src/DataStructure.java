package com.test.dataStructure;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DataStructure {

	public static void main(String[] args) {
//		test1();
		test2();
	}

	static void test1() {

	}
	static void test2() {
		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(10);
		tree.add(30);
		tree.add(90);
		tree.add(20);
		tree.add(40);
		tree.add(80);
		
		Iterator<Integer> iter = tree.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
