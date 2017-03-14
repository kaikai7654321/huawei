package com.exercise0223;

/**
 * @title  :  明明的随机数
 * @rank   :  81
 * @time   :  2017/2/23
 *
 */

import java.util.*;

public class Random 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		Set<Integer> set ;
		while(scan.hasNext())
		{
			set = new TreeSet<Integer>();
			n = scan.nextInt();
			
			for(int i = 0; i < n; i++)
			{
				set.add(scan.nextInt());
			}
			
			Iterator iter = set.iterator();
			
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
		}
	}

}
