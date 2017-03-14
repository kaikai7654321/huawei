package com.exercise0223;

/**
 * @title  :  从单向链表中删除指定值的节点
 * @rank   :  84
 * @time   :  2017/2/23
 * 1. 本来应该用链表的，但是自己直接用现成的了。
 * 2. 答案可以在华为通过，但是答案错误，虽然分数是满分。在牛客上也过不了。例子也是错的。
 */

import java.util.*;

public class LinkNode 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n ;
		List<Integer> list;
		
		while(scan.hasNext())
		{
			n = scan.nextInt();
			list = new LinkedList<Integer>();
			
			list.add(scan.nextInt());
			
			int a,b;
			for(int i = 1; i < n; i++)
			{
				a = scan.nextInt();
				b = scan.nextInt();
				
				int index = list.indexOf(b);
				list.add(index+1, a);
				
			}
			
			int index1 = scan.nextInt();
			
			list.remove((Integer)index1);
			
			for(int i = 0; i < list.size() - 1; i++)
			{
				System.out.print(list.get(i)+" ");
			}
			System.out.println(list.get(list.size()-1));
		}
	}

}
