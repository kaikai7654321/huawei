package com.exercise0205;
/**
 * @title  :  �ַ����ָ�
 * @rank   :  37
 * @item   :  2017/2/10
 * 1. ˼·�ܼ򵥣�����label2�ĵط������û�еĻ����ͻ��һ��00000000��������Ϊ�������1.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class SplitString
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list1;
		String s;
		String temp1;
		while(scan.hasNext())
		{
			list1 = new ArrayList<String>();
			int n = scan.nextInt();
			for(int x = 0; x < n; x++)
			{
			s = scan.next();
			//list1.add(s);
			for(int i = 0; i <= s.length()/8; i++)
			{
				//System.out.println("����2"+s.length()/8);
				if(i*8+8>s.length())
				{
					temp1 = s.substring(i*8, s.length());
					for(int j = s.length()-i*8;j<8; j++)
					{
						temp1+=0;
					}
				}
				else 
				{
					temp1 = s.substring(i*8,i*8+8);
				}
				//label2
				list1.add(temp1);
				if(i*8+8==s.length())
				{
					break;
				}
				//System.out.println("���ԣ�"+temp1);
				
			}
			}
			for(int i = 0; i < list1.size(); i++)
			{
				System.out.println(list1.get(i));
			}
		}
		
		
	}

}