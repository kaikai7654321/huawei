package com.exercixe0211;
/**
 * @title  :  字符串合并处理
 * @rank   :  40
 * @time   :  2017/2/11
 * 1. 关键在于题意。原来以为吧每个char用ascii码表示之后然后再转换16进制的数字。后来发现，就是把16进制的那几个数变一下而已。
 * 2. label1里面需要全用‘’，数字也需要。不然就自动转换为char 了。
 *
 */

import java.util.*;
public class StringCombine
{
	
	public static void main(String[] args) 
	{
		ArrayList<Character> constList = new ArrayList<Character>();
		//label1
		char [] constArray = {'0','8','4','C','2','A','6','E','1','9','5','D','3','B','7','F'};
		Scanner scan = new Scanner(System.in);
		String s1,s2;
		StringBuilder sb;
		
		ArrayList<Character> list1;
		ArrayList<Character> list2;
		
		//ArrayList<>
		while(scan.hasNext())
		{
			list1 = new ArrayList<Character>();
			list2 = new ArrayList<Character>();
			sb = new StringBuilder("");
			
			s1 = scan.next();
			s2 = scan.next();
			sb.append(s1);
			sb.append(s2);
			for(int i = 0; i < sb.length(); i++)
			{
				if(i%2==0)
					list1.add(sb.charAt(i));
				else 
					list2.add(sb.charAt(i));
			}
			Collections.sort(list1);
			Collections.sort(list2);
			int i = 0,j=0;
			sb = new StringBuilder("");
			while(i<list1.size()||j<list2.size())
			{
				if(i<list1.size())
				{
					sb.append(list1.get(i));
					i++;
				}
				if(j<list2.size())
				{
					sb.append(list2.get(j));
					j++;
				}
				
			}
			StringBuilder sb2 = new StringBuilder("");
			//System.out.println("测试： "+sb);
			for( i = 0; i < sb.length(); i++)
			{
				char cTemp= sb.charAt(i);
				char temp1 = cTemp;
				//System.out.println("原来字符： "+cTemp);
				if(Character.isDigit(cTemp))
				{
			         temp1 = constArray[cTemp-'0'];
				}
				else if((cTemp>='a'&&cTemp<='f')||(cTemp>='A'&&cTemp<='F'))
				{
					temp1 = Character.toUpperCase(cTemp);
					//System.out.println("大写: "+temp1+",index: "+(temp1-'A'+10));
					temp1 = constArray[temp1-'A'+10];
					//System.out.println("temp1: "+temp1);
				}
				sb2.append(temp1);
			}
			System.out.println(sb2);
		}
	}

}
