package com.exercise0203;
/**
 * @title  :  完全数计算
 * @rank   :  30
 * @time   :  2017/2/3
 *
 */

import java.util.*;
public class WanQuan 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			int sum = 0;
			int count = 0;
			for(int i = 1; i <=n;i++)
			{
				sum = 0;
				for(int j = 1; j <= i/2; j++)
				{
					//System.out.println("i: "+i+" ,j:  "+j);
					if(i%j==0)
					{
						sum+=j;
						//System.out.println("sum: "+sum);
					}
				}
				if(sum==i)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
