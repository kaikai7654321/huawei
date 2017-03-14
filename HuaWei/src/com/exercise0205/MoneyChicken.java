package com.exercise0205;

/**
 * @title  ：  百钱买百鸡
 * @rank   : 33
 * @time   : 2017/2/10
 *
 */

import java.util.*;
public class MoneyChicken
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int x,y,z;
		while (scan.hasNext())
		{
			int n = scan.nextInt();
			for(int i = 0; i <= 20; i++)
			{
				y = forY(i);
				z = forZ(i);
				if(y<0||y>33)continue;
				if(z<0||z>300)continue;
				System.out.println(i+" "+y+" "+z);
			}
		}
	}
	
	//用x表示y
	public static int forY(int x)
	{
		int result = 7*x;
		result = 100-result;
		if(result >= 0)
		{
			if(result%4==0)
			{
				result = result/4;
			}
			else 
			{
				result = -1;
			}
		}
		else 
		{
			result = -1;
		}
		
		return result;
	}

	//用x表示z
		public static int forZ(int x)
		{
			int result = 3*x;
			result = 300 + result;
			
			if(result%4==0)
			{
				result = result/4;
			}
			else 
			{
				result = -1;
			}
			
			
			return result;
		}

}
