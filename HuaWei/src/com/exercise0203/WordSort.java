package com.exercise0203;

/**
 * @title  :  单词倒排
 * @rank   :  30
 * @time   :  2017/2/3
 * 1. 关键在于正则表达式。
 * 2. 还有格式。WordSort2里面是自己本来的代码， 没有通过，格式不对。
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
