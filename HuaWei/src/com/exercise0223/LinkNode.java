package com.exercise0223;

/**
 * @title  :  �ӵ���������ɾ��ָ��ֵ�Ľڵ�
 * @rank   :  84
 * @time   :  2017/2/23
 * 1. ����Ӧ��������ģ������Լ�ֱ�����ֳɵ��ˡ�
 * 2. �𰸿����ڻ�Ϊͨ�������Ǵ𰸴�����Ȼ���������֡���ţ����Ҳ�����ˡ�����Ҳ�Ǵ�ġ�
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
