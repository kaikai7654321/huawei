package com.exercise0217;

/**
 * @title  :  字符串反转
 * @rank   :  55
 * @time   :  2017/2/17
 * 1. StringReverse2是看华为上面的，可以过的。
 * 2. 自己的在牛客上面可以过，但是再华为不可用。因为label1,使用next是不行的，因为有空格。
 */

import java.util.*;
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String s;
		Scanner scan = new Scanner (System.in);
		while(scan.hasNext())
		{
			//label1
			s = scan.nextLine();
			for(int i = s.length()-1; i >= 0; i--)
			{
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}
