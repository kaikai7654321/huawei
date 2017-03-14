package com.exercise0129;
/**
 * @title   :  找出字符串中第一个只出现一次的字符
 * @rank    :  24
 * @time    :  2017/1/29
 * 1. 还想了好一会，感觉用list，set等都不行。后来想起来了原来的那个map，就是按照顺序的linkedMap,果然书到用时方恨少
 * 2. 也可以按照左右找到的index一直判断。这是个好方法。
 * 3. 也可以自己写hashmap的。
 */

import java.util.*;
public class WordOnce 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		String s ;
		LinkedHashMap<Character,Integer> map;
//		ArrayList<Character> list1 ;
//		ArrayList<Character> list2 ;
		while(scan.hasNext())
		{
//			list1 = new ArrayList<Character>();
//			list2 = new ArrayList<Character>();
			map = new LinkedHashMap<Character,Integer>();
			s = scan.nextLine();
			for(int i = 0; i < s.length() ;i++)
			{
				Character temp = s.charAt(i);
				if(map.containsKey(temp))
				{
					map.put(temp, ((Integer)map.get(temp))+1);
				}else 
				{
					map.put(temp, 1);
				}
				
			}
			
			//拿出只出现一次的第一个
			Set keySet = map.keySet();
			Iterator iter = keySet.iterator();
			boolean flag = true;
			while(iter.hasNext())
			{
				Character cTemp = (Character)iter.next();
				int temp2 = (Integer)map.get(cTemp);
				if(temp2==1)
				{
					System.out.println(cTemp);
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println('.');
			}
			
		}
	}

}
