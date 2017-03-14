package com.exercise0205;

/**
 * @title  :  查找一个偶数最接近的两个素数
 * @rank   :  34
 * @time   :  2017/2/10
 *
 */

import java.util.*;
public class PrimePartner
{
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int n;
		for(int i = 2; i <= 10000 ; i++)
		{
			if(isPrime(i))
				list.add(i);
		}
		while(scan.hasNext())
		{
			int a=0,b=0;
			int temp,temp1,temp2;
			n = scan.nextInt();
			int small = 9999;
			for(int i = 0;i<list.size(); i++)
			{
				temp = list.get(i);
				if(temp>n)
					break;
				temp1 = n-temp;
				if(isPrime(temp1))
				{
					temp2 = Math.abs(temp-temp1);
					if(small>temp2)
					{
					if(temp<temp1)
					{
						a = temp;
						b = temp1;
						small = temp2;
					}else 
					{
						a = temp1;
						b = temp;
						small = temp2;
					}
					}
					
				}
			}
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	//判断是否是素数
	public static boolean isPrime(int n)
	{
		boolean flag = true;
		for(int i = 2; i<=n/2; i++)
		{
			if(n%i==0)
				return false;
		}
		return flag;
	}

}
