package com.exercise0121;
/**
 * 1. @title  :  ��������������������1�ĸ���
 * 2. @rank   :  21
 * 3. @time   :  2017/1/21
 * 4. ��Ϊ�ɹ��ĳ���StringSort2�Ǵ���ģ��������Լ�д�ġ�
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
		//��������
		while(scan.hasNext())
		{
			count = 0;
			n = scan.nextInt();
			temp1 = 0;
			while(n!=0)
			{
				
				System.out.println("���ԣ�"+n);
				count++;
				n = n&(n-1);
				
			}
			System.out.println(count);
		}
	}

}
