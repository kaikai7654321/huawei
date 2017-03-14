package com.exercise0129;
/**
 * @title  :  输入n个整数，输出其中最小的k个
 * @rank   :  23
 * @time   :  2017/1/29
 * 1. 格式，最后一个数字不能有空格。
 */
import java.util.*;
public class SmallestInt 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int small = 999999;
		int n=0,m=0,temp;
		ArrayList<Integer> list = new ArrayList<Integer> ();
		while(scan.hasNext())
		{
			n = scan.nextInt();
			m = scan.nextInt();
			
			for(int i = 0; i < n; i++)
			{
				temp = scan.nextInt();
				list.add(temp);
			}
			Collections.sort(list);
			for(int i = 0; i < m; i++)
			{
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			
		}
		
			
		
	}

}
