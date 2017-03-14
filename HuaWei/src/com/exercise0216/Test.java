package com.exercise0216;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> list1 = new ArrayList<Character>();
		list1.add('A');
		list1.add('A');
		list1.remove(new Character('A'));
		System.out.println(list1.size());
	}

}
