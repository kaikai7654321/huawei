package com.exercise0221;

/**
 * @title  :  µÈ²îÊýÁÐ
 * @rank   :  65
 * @time   :  2017/2/21
 * 
 *
 */

import java.util.*;
public class DengCha 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		while(scan.hasNext())
		{
			n= scan.nextInt();
			System.out.println((3*n+1)*n/2);
		}
	}

}
