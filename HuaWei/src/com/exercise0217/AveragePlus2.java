package com.exercise0217;
/**
 * @title  :  记负均正II
 * @rank   :  56
 * @time   :  2017/2/17
 * 1. 题目基本和AveragePlus相同，只是求得是非负数的平均
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AveragePlus2 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
	
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		int n,m;
		int amount ,amount2;
		double result ;
		
			//n = scan.nextInt();
			amount = 0;
			amount2 = 0;
			result = 0;
			//for(int i = 0; i < n; i++)
			while(scan.hasNext())
			{
				//list.add(scan.nextInt());
				
				m = scan.nextInt();
				if(m<0)amount++;
				else if(m>=0)
					{
					result += m;
					amount2++;
					}
				
			}
			System.out.print(amount+" ");
			//label1
			if(amount2==0)
				System.out.printf("%.1f\n",0.0);
			else 
			    System.out.printf("%.1f\n",result/(amount2));
		
	}

}