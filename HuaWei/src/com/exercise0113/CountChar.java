package com.exercise0113;
/**
 * @title  ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
 * @author 23192
 * @rank   16
 * @time   2017/1/13
 * 1. �ܼ򵥡���java���Ƿ��㵽�������ѡ�������Ϥ��һ��Character����ࡣ
 */

import java.util.*;
import java.io.*;
public class CountChar
{
	public static void main(String[] args) throws Exception
	{
		//�ļ����롣debugʱ��
//		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
//		Scanner scan = new Scanner(file);
		Scanner scan = new Scanner(System.in);
		int[] count ;
		while(scan.hasNext())
		{
			count = new int[4];
			String s = scan.nextLine();
			for(int i = 0; i < s.length(); i++)
			{
				Character c = s.charAt(i);
				if(Character.isDigit(c))
				{
					count[2]++;
				}else if(Character.isLetter(c))
				{
					count[0]++;
				}else if(Character.isSpaceChar(c))
				{
					count[1]++;
				}else 
				{
					count[3]++;
				}
			}
			for(int i = 0; i < 4; i++)
			{
				System.out.println(count[i]);
			}
		}
	}

}
