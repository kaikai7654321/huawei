package com.exercise0121;
/**
 * 1. @title  :  查找输入整数二进制中1的个数
 * 2. @rank   :  21
 * 3. @time   :  2017/1/21
 * 4. 此为成功的程序，StringSort2是错误的，但是是自己写的。
 */

import java.util.*;

public class OneNumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n ;
		int count = 0;
		int temp1;
		//输入数字
		while(scan.hasNext())
		{
			count = 0;
			n = scan.nextInt();
			temp1 = 0;
			while(n!=0)
			{
				
				System.out.println("测试："+n);
				count++;
				n = n&(n-1);
				
			}
			System.out.println(count);
		}
	}

}
