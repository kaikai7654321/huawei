package com.exercise0217;
/**
 * @title  :  字符串分隔
 * @rank   :  59
 * @time   :  2017/2/17
 * 1. 和之前的字符串分割那道题很相似。唯一不同就是这个输入只有两个。
 */
import java.util.ArrayList;
import java.util.Scanner;
public class StringSplit
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
			//int n = scan.nextInt();
			for(int x = 0; x < 2; x++)
			{
			s = scan.next();
			//list1.add(s);
			for(int i = 0; i <= s.length()/8; i++)
			{
				//System.out.println("测试2"+s.length()/8);
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
				//System.out.println("测试："+temp1);
				
			}
			}
			for(int i = 0; i < list1.size(); i++)
			{
				System.out.println(list1.get(i));
			}
		}
		
		
	}

}