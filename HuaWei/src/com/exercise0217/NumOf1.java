package com.exercise0217;
/**
 * @title  :  ��int���������ڴ��д洢ʱ1�ĸ���
 * @rank   :  56
 * @time   :  2017/2/17
 * 
 *
 */

import java.util.*;
public class NumOf1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n ,amount;
		String s;
		while(scan.hasNext())
		{
			amount = 0;
			n = scan.nextInt();
			s = Integer.toBinaryString(n);
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i)=='1')
				{
					amount++;
				}
			}
			
			System.out.println(amount);
		}
	}

}
