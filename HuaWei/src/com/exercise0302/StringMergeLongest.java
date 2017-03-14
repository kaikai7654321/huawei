package com.exercise0302;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title  ��   �ִ��������·������
 * @rank   :  102
 * @time   ��   2017/3/9
 * 1. �Լ�����ˡ��Լ���ֻ��ͨ��2�����ӡ���һ��ͨ������������˵���ַ�����4λ��M = 3����ǰ����
 *    �����Լ��Ͱ��մ�ǰ�����㡣���Ǻ��ź������ԡ�����2�����Ǳ��˵Ĵ��롣�о�˼·�ܺá��Լ�û���뵽�������ķ�����
 *    ��ʵֻҪ�����ÿ������֮��Ĺ�ϵ���Ϳ���������еĹ�ϵ�ˡ����⣬2�����˲�ͬ˳�򡣹��ƾ��Ǵ��ڴˡ�
 */

import java.util.*;
public class StringMergeLongest 
{
	static String result = "";
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("C:\\Users\\23192\\Desktop\\�ļ�\\input.txt");
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
				//System.out.println("test�� sb: "+sb);
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
