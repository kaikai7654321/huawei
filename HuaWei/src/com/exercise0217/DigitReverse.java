package com.exercise0217;

/**
 * @title  :  ���ֵߵ�
 * @rank   :  57
 * @time   :  2017/2/17
 * 1. StringBuilder���治��ֱ�Ӽ�int����Ҫת��String
 */

import java.util.*;
public class DigitReverse 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			StringBuilder sb = new StringBuilder(n+"");
			//System.out.println("���ԣ� "+sb);
			sb = sb.reverse();
			System.out.println(sb.toString());
		}
	}

}
