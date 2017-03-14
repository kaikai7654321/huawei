package com.exercise0112;
/**
 * @title  删除字符串中出现次数最少的字符
 * @author 23192
 * @rank  11
 * @time 2017/1/12
 *
 */

import java.util.*;
public class LeastTimeString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] times = new int[26];
		//输入数据。
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		//统计每个字符的频率
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			int temp = (int)c-97;
			times[temp]++;
		}
		//把要删除的放到这个集合里面。
		int smallest = 9999999;
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < 26; i++)
		{
			if(times[i]!=0&&times[i]<smallest)
				smallest = times[i];
		}
		for(int i = 0; i < 26; i++)
		{
			if(times[i]==smallest)
			{
				set.add((char)(i+97));
			}
		}
		//遍历，把不删除的拷贝到另一个字符串
		String result = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(!set.contains(s.charAt(i)))
			{
				result = result+s.charAt(i);
			}
		}
		System.out.println(result);
	}

}
