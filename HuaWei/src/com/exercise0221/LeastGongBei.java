package com.exercise0221;

/**
 * @title  :  求最小公倍数
 * @rank   :  61
 * @time   :  2017/2/21
 * 
 *
 */

import java.util.*;
public class LeastGongBei 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a,b;
		int result;
		while(scan.hasNext())
		{
			a = scan.nextInt();
			b = scan.nextInt();
			if(b<a)
			{
				int temp = b; 
				b = a;
				a = temp;
			}
			
			result = a;
			int t = 1;
			while(result%b!=0)
			{
				t++;
				result = a*t;
				
			}
			System.out.println(result);
		}
	}

}
