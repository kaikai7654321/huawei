package com.exercise0224;

/**
 * @title  :  取近似值
 * @rank   :  91
 * @time   :  2017/2/24
 *
 * 1. Math.round也可以。但是有一点，就是-5.5近似到-5.也就是都是近似到大的地方。
 */

import java.util.*;
public class Aproximate 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double d;
		
		while(scan.hasNext())
		{
			d = scan.nextDouble();
			int temp = (int)d;
			double temp2 = d - temp;
			
			if((temp2 >= 0.5))
				System.out.println(temp+1);
			else 
				System.out.println(temp);
		}
	}

}
