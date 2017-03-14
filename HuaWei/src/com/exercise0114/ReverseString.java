package com.exercise0114;
/**
 * @title   ×Ö·ûÄæÐò
 * @author 23192
 * @rank   20
 * @time   2017/1/14
 * ºÜ¼òµ¥
 */

import java.util.*;
public class ReverseString 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			String s = scan.nextLine();
	        StringBuilder sb = new StringBuilder();
	        for(int i = s.length()-1; i>=0; i--)
	        {
	        	sb.append(s.charAt(i));
	        }
	        System.out.println(sb);
		}
		
	}

}
