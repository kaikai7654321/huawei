package com.exercise0203;

/**
 * @title  :  ���ʵ���
 * @rank   :  30
 * @time   :  2017/2/3
 * 1. �ؼ�����������ʽ��
 * 2. ���и�ʽ��WordSort2�������Լ������Ĵ��룬 û��ͨ������ʽ���ԡ�
 */

import java.util.*;
public class WordSort
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s ;
		while(scan.hasNext())
		{
			s = scan.nextLine();
			String []temp = s.split("[^a-zA-Z]+");
			for(int i = temp.length-1;i >1 ; i--)
			{
				System.out.print(temp[i]+" ");
			}
			if(temp[0].length()==0)
			{
				System.out.println(temp[1]);
			}
			else 
			System.out.println(temp[1]+" "+temp[0]);
		}
	}

}
