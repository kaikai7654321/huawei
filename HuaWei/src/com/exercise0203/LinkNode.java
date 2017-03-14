package com.exercise0203;

/**
 * @title  :  输出单向链表中倒数第k个节点
 * @rank   :  31
 * @time   :  2017/2/3
 *
 */

import java.util.*;
public class LinkNode 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n,index;
		ArrayList<Integer> list ;
		while(scan.hasNext())
		{
			list =  new ArrayList<Integer>();
			n = scan.nextInt();
			for(int i = 0; i < n; i++)
			{
				list.add(scan.nextInt());
				
			}
			index = scan.nextInt();
			System.out.println(list.get(n-index-1));
		}
	}

}
