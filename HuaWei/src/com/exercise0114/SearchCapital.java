package com.exercise0114;
/**
 * @title  统计大写字母个数
 * @author 23192
 * @rank   21
 * @time   2017/1/14
 *
 */

import java.util.*;
public class SearchCapital 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(scan.hasNext())
		{
			count = 0;
			String s = scan.nextLine(); 
			if(s.equals("")||s==null)
			{
				System.out.println(0);
				continue;
			}
			for(int i = 0; i<s.length(); i++)
			{
				if(Character.isUpperCase(s.charAt(i)))
				{
					count++;
				}
			}
			System.out.println(count);
			
		}
	}

}
