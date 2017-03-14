package com.exercise0222;
/**
 * 1. 吧乘除都化为加减
 * 2. 目前的方法是把每个数和两个数的和放进set，然后看24是否能整除。其实如果把所有的和加入set，就算是完全解了
 * 3. 目前自己的只能说大部分解可以得到。毕竟还有的可能是某个数的倍数加上另一个数可以被整除。
 * 4. 这个和原来的24点有不同之处就是可以重复，这样就不可以暴力了。
 * 5. 只能把乘除变成加减。
 */

import java.util.*;

public class Point241 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int []list;
		Set<Integer> set;
		
		while(scan.hasNext())
		{
			set = new HashSet<Integer>();
			list = new int[4];
			
			for(int i = 0; i < 4; i++)
			{
				list[i] = scan.nextInt();
				set.add(list[i]);
			}
			
			for(int i = 0; i < 3; i++)
			{
			    for(int j = i+1; j < 4; j++)
			    {
			    	set.add(list[i]+list[j]);
			    }
			}
			
			Iterator iter = set.iterator();
			boolean flag = true;
			while(iter.hasNext())
			{
				if(24 % (int)iter.next() == 0)
				{
					System.out.println("true");
					flag = false;
					break;
				}
			}
			
			if(flag)
			{
				System.out.println("false");
			}
		}
	}
	
	
}
