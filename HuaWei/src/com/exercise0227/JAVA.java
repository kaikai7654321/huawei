
/**
 * @title  :  201301 JAVA题目0-1级
 * @rank   :  102
 * @time   :  2017/2/27
 * 1. 在牛客上看到的思路。感觉很好的思路。也很简单。其实就是一种递归。只不过换了一种更容易的方式。
 */
package com.exercise0227;

import java.util.*;

public class JAVA 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			int result5 = 0;
			int result3 = 0;
			int amount = 0;
			int[] array = new int[n];
			
			for(int i = 0; i < n; i++)
			{
				int temp = scan.nextInt();
				if(temp % 5 == 0)
				{
					result5 += temp;
				}else if(temp % 3 == 0)
				{
					result3 += temp;
				}else
				{
					array[amount++] = temp;
					
				}
				
			}
			
			int diff = Math.abs(result3 - result5);
			
			System.out.println(help(0, amount, array, 0, diff));
		}
	}

	public static boolean help(int t, int n, int[]array, int result, int amount)
	{
		if(t == n )
		{
			return Math.abs(result) == amount;
		}else 
		{
			return help(t+1, n, array, result + array[t], amount) 
					|| help(t + 1, n, array, result - array[t], amount);
		}
	}
}
