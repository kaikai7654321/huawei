package com.exercise0221;
/**
 * @title  :  提取不重复的整数
 * @rank   :  60
 * @time   :  2017/2/21
 * 
 *
 */

import java.util.*;
public class OnlyInteger 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int n;
		List<Integer> list;
		while(scan.hasNext())
		{
			list = new ArrayList<Integer>();
			n = scan.nextInt();
			while(n!=0)
			{
				int temp = n%10;
				n = n/10;
				if(!list.contains(temp))
				{
					list.add(temp);
				}
			}
			for(Integer i : list)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
