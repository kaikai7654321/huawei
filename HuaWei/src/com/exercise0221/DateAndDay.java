package com.exercise0221;



/**
 * @title  :  计算日期到天数转换
 * @rank   :  63
 * @time   :  2017/2/21
 * 1. label1哪里用目前的方法就比一点一点加要好很多。所以应该有全局视野。
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class DateAndDay 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		int y,m,d;
		int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		while(scan.hasNext())
		{
			y = scan.nextInt();
			m = scan.nextInt();
			d = scan.nextInt();
			if(m<0||m>12) {System.out.println(-1);break;}
			if(d>month[m-1]||d<0) {System.out.println(-1);break;}
			int result = 0;
			for(int i = 0; i < m-1;i++)
			{
				result+=month[i];
			}
			result += d;
			//label1
			if(isLeap(y)&&m>2)
			{
				result++;
			}
			System.out.println(result);
		}
	}
	public static boolean isLeap(int y)
	{
		if((y%4==0&&y%100!=0)||(y%400==0))
		{
			return true;
		}
		return false;
	}

}
