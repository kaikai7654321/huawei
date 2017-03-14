package com.exercise0224;

/**
 * @title  :  �ϲ����¼
 * @rank   :  92
 * @time   :  2017/2/24
 * 1. ��Ҫ����key���򡣾�����treeMap
 * 2. ţ����ÿ����ֵ����һ�С���Ϊ��index��valueҲ�Ƿ��еġ�
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
