package com.exercise0203;

/**
 * @title  :  ��С�������κ���������·�̺͵���η����ĸ߶ȡ�
 * @author :  kaikai
 * @rank   :  29
 * @time   :  2017/2/3
 * 1. ��һ�θ�ʽ���󡣹ؼ���������Ƿ��еġ�������Ĳ�һ��
 */

import java.util.*;
public class BallGroud
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int h;
		double h2;
		double result1,result2;
		while(scan.hasNext())
		{
			h = scan.nextInt();
			result1 = 2.875*h;
			result2 = 0.03125*h;
			System.out.println(result1);
			System.out.println(result2);
		}
	}

}


