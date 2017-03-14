package com.exercise0217;



/**
 * @title  :  查找兄弟单词
 * @rank   :  48
 * @time   :  2017/2/17
 * 1. 主要是要求我并不清楚。但是根据例子还是写出来了一个。其实这样用这种方法还是不错的。也可以用map。
 * 2. 目前是不能在牛客上，只能在华为上。牛客上只能通过40%，说是数组越界。不知道为嘛。
 * 3. label2必须，因为对比的时候必须和w的排序后的比。自己原来没有想起来。错了好久。
 */

import java.util.*;


public class WordPartner
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		String w;
		int rank;
		List<String> list ,list1;
		List<String> list2 ;
		while (scan.hasNext())
		{
			list = new ArrayList<String> ();
			list1 = new ArrayList<String> ();
			list2 = new ArrayList<String> ();
			n = scan.nextInt();
			for(int i = 0; i < n; i++)
			{
				w = scan.next();
				list.add(w);
				list1.add(sortString(w));
				//System.out.println(sortString(w));
			}
			w = scan.next();
			//label2
			String w2 = sortString(w);
			rank = scan.nextInt();
			for(int i = 0; i < list1.size(); i++)
			{
				//System.out.println("测试2： "+list1.get(i)+","+w+","+list.get(i));
				if(list1.get(i).equals(w2)&&!(list.get(i).equals(w)))
				{
					list2.add(list.get(i));
					//System.out.println("测试： "+list.get(i));
				}
			}
			Collections.sort(list2);
			System.out.println(list2.size());
			System.out.println(list2.get(rank-1));
		}
	}

	public static String sortString (String s)
	{
		StringBuilder sb = new StringBuilder();
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0;i < s.length(); i++)
		{
			list.add(s.charAt(i));
		}
		Collections.sort(list);
		for(int i = 0; i<list.size(); i++)
		{
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}
