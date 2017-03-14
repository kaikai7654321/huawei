package com.exercise0224;


/**
 * @title  :  四则运算
 * @rank   :  92
 * @time   :  2017/2/24
 * 1. 暂时没有头绪，先不写。
 */

import java.util.*;
public class Expression 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n,temp;
		Map<Integer, Integer> map ;
		
		while(scan.hasNext())
		{
			
		}
	}
	
	public static void calculate(int result, String s, char type)
	{
		if(s.length() == 0)
		{
			
		}
		
		List<Integer> list = new ArrayList<Integer> ();
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(c == '{')
			{
				
			}
		}
		
	}

	
	public static int help(int a, int b, char type)
	{
		int result = a;
		switch(type)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		}
		return result;
	}
}
