package com.exercise0205;

/**
 * @title  :  DNA序列
 * @rank   :  36
 * @time   :  2017/2/10
 * 1. 题目有问题。不是最少长度，就是指定那个长度。
 * 2. 原来以为最少长度时，感觉需要动态规划，但是又发现无法使用，因为分子分母都在变化。不得已直接使用了暴力。但是后来发现
 *    题目有问题。
 */

import java.util.*;
public class DNA
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s,sTemp,result="";
		double pTemp=0,per=0;
		int leastLen = 0;
		while(scan.hasNext())
		{
			s = scan.next();
			leastLen = scan.nextInt();
			for(int i = 0; i <= s.length()-leastLen; i++)
			{
				//for(int j = i+leastLen; j<=s.length(); j++)
				{
					sTemp = s.substring(i, i+leastLen);
					//System.out.println("测试2: "+sTemp);
					pTemp = (double)compute(sTemp)/sTemp.length();
					//System.out.println("测试： "+pTemp+","+sTemp);
					if(pTemp>per)
					{
						result = sTemp;
						per = pTemp;
					}
				}
			}
			System.out.println(result);
		}
		
		
	}
	public static int compute(String s)
	{
		int result = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)=='G'||s.charAt(i) == 'C')
			{
				result++;
			}
		}
		return result;
	}
}
