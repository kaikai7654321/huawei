package com.exercise0203;
/**
 * @title  :  ͳ��ÿ�������ӵ�����
 * @author 23192
 * @rank   :  28
 * @time   :  2017/2/3
 * 1. ��47�´ﵽ40�ڡ�����Ҫ��̫������顣
 */

import java.util.*;
public class RabbitNum 
{

	public static void main(String[] args) 
	{
		int []num = new int[50];
		num[0] = 1;
		num[1] = 1;
		for(int i = 2; i<50; i++)
		{
			num[i] = num[i-1]+num[i-2];
		}
		Scanner scan = new Scanner(System.in);
		int n;
		while(scan.hasNext())
		{
			n = scan.nextInt();
			System.out.println(num[n-1]);
		}
	}

}
