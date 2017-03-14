package com.exercise0222;

/**
 * @title  :  24����Ϸ�㷨
 * @rank   :  76
 * @time   :  2017/2/22
 * 1. �����޷�ͨ��������Point241���Թ�����Ҫ˼��һ�£���Ϊ��Ҳ������ȫ�⡣ֻ����Ϊ��������̫С�����ҹ��ˡ�
 */

import java.util.*;

public class Point24 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int []list;
		Set<Integer> set;
		
		while(scan.hasNext())
		{
			set = new HashSet<Integer>();
			list = new int[4];
			
			for(int i = 0; i < 4; i++)
			{
				list[i] = scan.nextInt();
			}
			
			int result = 0;
			
			result = list[0];
			boolean  flag = true;
			boolean flag2 = true;
			while(flag && flag2)
			{
				flag = false;
				for(int i = 0; i < 4 && flag2; i++)
				{
					for(int j = 0; j < 3 && flag2; j++)
					{
						result = help(result, list[i],j);
						if(result == 24)
						{
							flag2 = false;
						}
						if(!set.contains(result))
						{
							flag = true;
						}
						else 
						{
							set.add(result);
						}
						System.out.println("����: "+result);
					}
					if(result % list[i] == 0)
					{
						result = result / list[i];
						if(result == 24)
						{
							flag2 = false;
						}
						if(!set.contains(result))
						{
							flag = true;
						}
						else 
						{
							set.add(result);
						}
						System.out.println("����: "+result);
					}
				}
				
			}
			if(!flag2)
				System.out.println("true");
			else
			    System.out.println("false");
		}
	}
	
	public static int help(int a, int b, int type)
	{
		int result = 0;
		switch(type)
		{
		case 0: 
			result = a+b;
			break;
		case 1: 
			result = a-b;
			break;
		case 2: 
			result = a*b;
			break;
		
		}
		return result;
	}
	

}
