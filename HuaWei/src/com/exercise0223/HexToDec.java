package com.exercise0223;


/**
 * @title  :  进制转换
 * @rank   :  82
 * @time   :  2017/2/23
 * 1. scan可以按照进制读取。但是由于前面有0x,无法用。
 * 2. 有人用Integer的valueof,感觉不错
 */

import java.util.*;

public class HexToDec 
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
			
			for(int i = len - 1; i > 1; i-- )
			{
				char c = s.charAt(i);
				int temp = 0;
				
				if(Character.isDigit(c))
				{
					temp = c - '0';
				}else 
				{
					temp = c - 'A' + 10;
				}
				
				result += temp * Math.pow(16, len - i - 1);
			}
			
			System.out.println(result);
		}
	}

}
