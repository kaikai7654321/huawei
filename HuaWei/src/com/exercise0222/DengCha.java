package com.exercise0222;

/**
 * @title  :  寻找等差数列
 * @rank   :  68
 * @time   :  2017/2/22
 * 1. 原来没有思路。后来网上搜了一些等差数列，发现可以用dp。原来用的是一维，但是测试不对。后来看网上的发现用的是二维。因为
 *    对于这种随意组合的题，是不满足目前情况之和前面一种情况相关的要求的。所以，直接迭代是算不出来的。
 * 2. label1如果没有等号，就输出首项最小的。此处输出最大的。还有一道中级题目是输出最小。另外，那道题的输出格式
 *     和这倒也不同。那个每两个数字之间加空格。
 * 3. 
 */

import java.util.*;
public class DengCha 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a,b;
		List<Integer> list;
		int dp[][];
		
		while(scan.hasNext())
		{
			list = new ArrayList<Integer> ();
			a = scan.nextInt();
			b = scan.nextInt();
			
			if(a<2) 
			{
				a = 2;
			}
			
			for(int i = a; i <= b; i++ )
			{
				if(isPrime(i))
				{
					list.add(i);
				}
			}
			
			dp = new int[list.size()][b-a];
			
			//运用动态规划来确定最长：
			int big = 0;
			int index = 0;
			int diff = 0;
			
			for(int i = 1; i < list.size(); i++)
			{
				for(int j = i-1; j >= 0; j--)
				{
					int diff2 = list.get(i) - list.get(j);
					dp[i][diff2] = dp[j][diff2]+1;
					//label1
                    if(big <= dp[i][diff2])
                    {
                    	big = dp[i][diff2];
                    	index = i;
                    	diff = diff2;
                    }
					
				}
			}
			
			ArrayList<Integer> resultList = new ArrayList<Integer> ();
            int temp = list.get(index);
            while(temp >= a)
            {
            	resultList.add(temp);
            	temp = temp - diff;
            	if(!isPrime(temp))
            		break;
            }
            
			for(int i = resultList.size()-1; i>=0; i--)
			{
				System.out.println(resultList.get(i));
			}
			
		}
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
