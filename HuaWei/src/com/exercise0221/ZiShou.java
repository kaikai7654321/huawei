package com.exercise0221;
/**
 * @title  :  自守数
 * @rank   :  66
 * @time   :  2017/2/21
 *
 */

import java.util.*;
public class ZiShou 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			int amount = 0;
			for(int i = 0; i <=n; i++)
			{
				if(help(i,i*i))
				{
					System.out.println("自守数： "+i);
					amount++;
				}
			}
			System.out.println(amount);
		}
	}

	public static boolean help(int a,int b)
	{
		while(a!=0)
		{
			int temp1 = a%10;
			int temp2 = b%10;
			if(temp1!=temp2)
				return false;
			a = a/10;
			b = b/10;
		}
		return true;
	}
}
