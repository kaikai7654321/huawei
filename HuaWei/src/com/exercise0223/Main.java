package com.exercise0223;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main 
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
			System.out.println(list.get(list.size()-1)+" ");
		}
	}

}

