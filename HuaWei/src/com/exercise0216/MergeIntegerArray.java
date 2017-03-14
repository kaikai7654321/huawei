package com.exercise0216;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title  :  整形数组合并
 * @rank   :  44
 * @time   :  2017/2/16
 * 1. 牛客上可以过，但是华为超时。说是java不能超过两分钟
 * 3. MergeInteger2在牛客上看到的。感觉确实简洁，而且通过了测试。
 * 4. 自己的方法从复杂度上面也没有多少。应该是语句的执行上面有问题。这个待研究。
 *
 */

import java.util.*;
public class MergeIntegerArray 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		
		Scanner scan = new Scanner(System.in);
		int n1,n2;
		List<Integer> list1 ,list2,list3;
		while(scan.hasNext())
		{
			list1 = new ArrayList<Integer>();
			list2 = new ArrayList<Integer>();
			list3 = new ArrayList<Integer>();
			n1 = scan.nextInt();
			for(int i = 0; i < n1; i++)
			{
				list1.add(scan.nextInt());
			}
			
			n2 = scan.nextInt();
			for(int i = 0; i < n2; i++)
			{
				list2.add(scan.nextInt());
			}
			Collections.sort(list1);
			Collections.sort(list2);
			int i = 0,j=0;
			while(i<list1.size()&&j<list2.size())
			{
				//System.out.println(x);
				int m1 = list1.get(i);
				//System.out.println(x);
				if(list3.contains(m1))
				{
					i++;
					continue;
				}
				int m2 = list2.get(j);
				if(list3.contains(m2))
				{
					j++;
					continue;
				}
				if(m1>m2)
				{
					list3.add(m2);
				}else
				{
					list3.add(m1);
				}
			}
			while(i<list1.size())
			{
				int m = list1.get(i);
				if(!list3.contains(m))
				{
					list3.add(m);
					i++;
				}
				
			}
			while(j<list2.size())
			{
				int m = list2.get(j);
				if(!list3.contains(m))
				{
					list3.add(m);
					j++;
				}
				
			}
			for(int k = 0; k < list3.size(); k++)
				System.out.print(list3.get(k));
			System.out.println();
		}
	}

}
