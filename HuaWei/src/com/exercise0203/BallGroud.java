package com.exercise0203;

/**
 * @title  :  求小球落地五次后所经历的路程和第五次反弹的高度。
 * @author :  kaikai
 * @rank   :  29
 * @time   :  2017/2/3
 * 1. 第一次格式有误。关键是输出的是分行的。和上面的不一致
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


