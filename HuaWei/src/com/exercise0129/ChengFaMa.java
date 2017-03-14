package com.exercise0129;
/**
 * @title  :  ≥∆Ì¿¬Î
 * @rank   :  27
 * @time   :  2017/2/2
 *
 */

import java.util.*;

public class ChengFaMa 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		int []weights;
		int []nums;
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> amount;
		int wTemp,nTemp;
		Set<Integer> set ;
		while(scan.hasNext())
		{
			weights = new int[10];
			nums = new int[10];
			set = new HashSet<Integer>();
		    amount = new ArrayList<Integer> ();
			n = scan.nextInt();
			
			for(int i = 0; i < n; i++)
			{
				weights[i] = scan.nextInt();
			}
			for(int i = 0; i < n; i++)
			{
				nums[i] = scan.nextInt();
			}
			
			for(int i = 0; i <= nums[0]; i++)
			{
				set.add(weights[0]*i);
			}
			for(int i = 1; i <= n; i++)
			{
				amount = new ArrayList<Integer>(set);
				for(int j = 0; j <= nums[i]; j++)
				{
					for(int k = 0; k < amount.size(); k++)
					{
						set.add(amount.get(k)+j*weights[i]);
					}
				}
			}
			
			System.out.println(set.size());
		}
	}

}
