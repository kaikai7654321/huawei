package com.exercise0217;

/**
 * @title  :  字符个数统计
 * @rank   :  58
 * @time   :  2017/2/17
 * 1. 自己并没判断是否在127以内，但是就这样过了。java里面应该没有现成的可以判断是否在ascii里面的函数。
 * 
 *
 */

import java.util.*;
public class CharAmount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		String s;
		Set<Character> set = new HashSet<Character>();
		while(scan.hasNext())
		{
			s = scan.nextLine();
			for(int i = 0; i < s.length(); i++)
			{
				set.add(s.charAt(i));
			}
			System.out.println(set.size());
		}
	}

}
