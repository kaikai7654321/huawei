package com.exercise0223;

import java.util.*;

public class HexToDec2 
{
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		String s;
		int result;
		
		while(scan.hasNext())
		{
			result = 0;
			s = scan.next();
			int len = s.length();
			
			System.out.println(Integer.valueOf(s.replaceFirst("0x", ""),16)); 
		}
	}

}
