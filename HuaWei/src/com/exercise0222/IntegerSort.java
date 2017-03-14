package com.exercise0222;

/**
 * @title  :  输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * @rank   :  63
 * @time   :  2017/2/22
 */

import java.util.*;
public class IntegerSort 
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int n,rank;
		List<Integer> list ;
		
		while(scan.hasNext())
		{
			list = new ArrayList<Integer> ();
			n = scan.nextInt();
			for(int i = 0; i < n; i++ )
			{
				list.add(scan.nextInt());
			}
			rank = scan.nextInt();
			Collections.sort(list);
			
			if(rank == 1)
			{
				for(int i = list.size()-1; i>=0; i--)
				{
					System.out.print(list.get(i));
					if(i != 0)
					{
						System.out.print(" ");
					}
					else 
					{
						System.out.println();
					}
				}
			}else
			{
				for(int i = 0; i < list.size(); i++)
				{
					System.out.print(list.get(i));
					if(i != list.size()-1 )
					{
						System.out.print(" ");
					}else
					{
						System.out.println();
					}
				}
			}
		}
	}

}
