package com.exercise0302;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title  ：   字串的连接最长路径查找
 * @rank   :  102
 * @time   ：   2017/3/9
 * 1. 自己算错了。自己的只能通过2个例子。第一个通不过。看评论说是字符都是4位，M = 3，从前到后。
 *    于是自己就按照从前往后算。但是很遗憾，不对。后来2里面是别人的代码。感觉思路很好。自己没有想到用这样的方法。
 *    其实只要求出来每两个点之间的关系，就可以算出所有的关系了。另外，2考虑了不同顺序。估计就是错于此。
 */

import java.util.*;
public class StringMergeLongest 
{
	static String result = "";
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\文件\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(scan.hasNext())
		{
			String temp = scan.next();
			//System.out.println(temp);
			list.add(temp);
		}
		    //String result = "";
		    StringBuilder sb = new StringBuilder("");
		    dfs(0,list,  sb);
		    
			System.out.println(result);
		
	}

	public static void dfs(int index, ArrayList<String> list, 
			StringBuilder sb)
	{
		if(index >= list.size())
		{
			return;
		}
		
		for(; index < list.size(); index++)
		{
			String behind = list.get(index);
			if(sb.length() == 0 || sb == null)
			{
				sb.append(behind);
				dfs(index+1,list, sb);
				sb = new StringBuilder("");
			}else
			{
				//System.out.println("test： sb: "+sb);
				if(sb.substring(sb.length() - behind.length() + 1, sb.length())
						.equals(behind.substring(0,behind.length() - 1)))
				{
					sb.append(behind.substring(behind.length()-1,behind.length()));
					if(result.length() < sb.length())
					{
						result = sb.toString();
						//System.out.println("test: "+result);
					}
					dfs(index+1,list, sb);
					
					sb = new StringBuilder(sb.substring(0,sb.length()-1));
				}
			}
			
			
			
			
		}
		
		
		
	}
}
