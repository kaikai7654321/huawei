package com.exercise0223;


/**
 * @title  :  质数因子
 * @rank   :  83
 * @time   :  2017/2/23
 * 
 */

import java.util.*;

public class PrimeFactor 
{
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		String s;
		int n;
		List<Integer> list;
		
		while(scan.hasNext())
		{
			list = new ArrayList<Integer> ();
			n = scan.nextInt();
			int temp = 0;
			
			help(list, n);
			
			
			Collections.sort(list);
			
			for(int i = 0; i < list.size() - 1; i++)
			{
				System.out.print(list.get(i)+" ");
				
			}
			
			System.out.println(list.get(list.size() - 1));
		}
	}
	
	public static void help(List<Integer> list, int n)
	{
		if(isPrime(n))
		{
			list.add(n);
			return ;
		}
		
		int temp = -1;
		for(int i = 2; i < n/2; i++)
		{
			if(n % i == 0 && isPrime(i))
			{
				//list.add(i);
				temp = i;
				break;
			}
		}
		
		list.add(temp);
		
		help(list, n / temp);
		//int temp1 = n
	}
	//判断是否是质数
		public static boolean isPrime(int a)
		{
			for(int i = 2; i <= Math.sqrt(a); i++)
			{
				if(a % i == 0)
				{
					return false;
				}
			}
			return true;
		}

}
