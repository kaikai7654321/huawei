package com.exercise0113;
/**
 * @title  输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数
 * @author 23192
 * @rank   16
 * @time   2017/1/13
 * 1. 很简单。用java更是方便到不能自已。算是熟悉了一下Character这个类。
 */

import java.util.*;
import java.io.*;
public class CountChar
{
	public static void main(String[] args) throws Exception
	{
		//文件读入。debug时用
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
