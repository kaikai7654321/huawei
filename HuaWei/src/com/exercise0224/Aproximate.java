package com.exercise0224;

/**
 * @title  :  ȡ����ֵ
 * @rank   :  91
 * @time   :  2017/2/24
 *
 * 1. Math.roundҲ���ԡ�������һ�㣬����-5.5���Ƶ�-5.Ҳ���Ƕ��ǽ��Ƶ���ĵط���
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
