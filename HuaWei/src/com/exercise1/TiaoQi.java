package com.exercise1;
/*
 * @titile : ��7
 * @rank   : 4
 * @time   : 2017/1/10
 * 1. �ύ���Ρ���һ����Ϊ�Լ�����Ϊ�����߾��Ǹ�λ��1���������֣�����λҲ���ԡ����Ծ�����д��һ��������
 */

import java.util.Scanner;
public class TiaoQi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		//��������
		int num = scan.nextInt();
		int count = 0;
		int index = 7;
		for(int i = 7; i<=num; i++)
		{
			if(i%7==0)
				count++;
			else if(contain7(i))
				count++;
		}
		System.out.println(count);
			
	}
	//�ж�һ�����Ƿ�7
	static boolean  contain7(int num)
	{
	   boolean flag = false;
	   while(num>0)
	   {
	   int left = num%10;
	   if(left==7)
		   return true;
	   num = num/10;
	   }
	   return flag;
	}

}
