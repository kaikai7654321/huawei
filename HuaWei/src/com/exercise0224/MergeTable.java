package com.exercise0224;

/**
 * @title  :  合并表记录
 * @rank   :  92
 * @time   :  2017/2/24
 * 1. 需要按照key排序。就是用treeMap
 * 2. 牛客上每个键值对是一行。华为是index和value也是分行的。
 */

import java.util.*;
public class MergeTable 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n,temp;
		Map<Integer, Integer> map ;
		
		while(scan.hasNext())
		{
			map = new HashMap<Integer, Integer>();
			n = scan.nextInt();
			
			for(int i = 0; i < n; i++)
			{
				int temp1 = scan.nextInt();
				int temp2 = scan.nextInt();
				
				if(map.containsKey(temp1))
				{
					map.put(temp1, map.get(temp1)+temp2);
				}else
				{
					map.put(temp1, temp2);
				}
				
			}
			
			Set set = map.keySet();
			Iterator iter = set.iterator();
			
			while(iter.hasNext())
			{
				Integer index = (Integer)iter.next();
				
				//label1
				System.out.println(index + " " + map.get(index));
			}
		}
	}

}
