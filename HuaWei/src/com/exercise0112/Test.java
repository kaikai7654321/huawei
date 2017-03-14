package com.exercise0112;

import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		//String s = "E:\V1R2\product\fpgadrive.c";
		String s = scan.nextLine();
		System.out.println("≤‚ ‘£∫ "+s);
		String sTemp[] = s.split(" +");
		System.out.println(sTemp[sTemp.length-1]);
	}

}
