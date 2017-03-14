/**
 * @title  :  求解立方根
 * @rank   :  100
 * @time   :  2017/3/2
 * 
 * 1. 自己弄明白了泰勒展开式，但是还是没有明白牛顿法。看了网上之后明白了，但是还是无法写出来。
 *    因为还是没有真正明白。计算方法里面的逼近算是白学了。不知道y代表的是什么。
 */

package com.exercise0302;

import java.text.DecimalFormat;
import java.util.*;

public class Cube 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			double n = scan.nextDouble();
			
			System.out.println(getCubeRoot(n));
			
			
		}
	}
	
	
		public static double getCubeRoot(double input) 
		{
			double x0 = 1;
		    double x1 = x0 - (x0 * x0 * x0 - input) / (3 * x0 * x0);
			while (Math.abs(x1 - x0) > 0.000001) 
			{
				x0 = x1;
				x1 = x0 - (x0 * x0 * x0 - input) / (3 * x0 * x0);
		    }
			DecimalFormat df = new DecimalFormat("#0.0");
			return Double.parseDouble(df.format(x1));
		}

}
