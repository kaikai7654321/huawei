package com.exercise1;
/*
 * @titile : 挑7
 * @rank   : 4
 * @time   : 2017/1/10
 * 1. 提交两次。第一次因为自己误以为包含七就是个位是1，后来发现，其他位也可以。所以就重新写了一个函数。
 */

import java.util.Scanner;
public class TiaoQi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		//输入数据
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
	//判断一个数是否含7
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
