package com.exercise0117;
/**
 * @title  图片整理
 * @rank   20
 * @time   2017/1/17
 * 1. 题目要求用C，但是java也可以。
 * 2. 错了一次，因为list的new需要在while里面
 */

import java.util.*;

public class StringSort
{
	public static void main(String[] args) 
	{
		ArrayList<Character> list ;
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			list =  new ArrayList<Character>();
			String s = scan.next();
			for(int i = 0; i < s.length(); i++)
			{
				list.add(s.charAt(i));
			}
			Collections.sort(list);
			
			for(int i = 0; i < list.size(); i++)
			{
				System.out.print(list.get(i));
			}
			System.out.println("");
			
		}
	}

}
