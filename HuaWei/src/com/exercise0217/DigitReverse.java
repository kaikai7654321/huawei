package com.exercise0217;

/**
 * @title  :  数字颠倒
 * @rank   :  57
 * @time   :  2017/2/17
 * 1. StringBuilder里面不能直接加int，需要转成String
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
			//System.out.println("测试： "+sb);
			sb = sb.reverse();
			System.out.println(sb.toString());
		}
	}

}
