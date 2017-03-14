package com.exercixe0211;

/**
 * @title  :  尼科彻斯定理
 * @rank   :  38
 * @time   :  2017/2/11
 * @author 23192
 * 1. 思路很简单。
 */

import java.util.*;
public class Nikesiter
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		int n;
		int amount=0;
		int amount2;
		while(scan.hasNext())
		{
			
		    n = scan.nextInt();
		    amount2 = n*n*n;
		    for(int i = 1; i<=n*n;i+=2)
		    {
		    	amount = 0;
		    	for(int j = 0; j < n; j++)
		    	{
		    		amount = amount+i+j*2;
		    	}
		    	if(amount == amount2 )
		    	{
		    		for(int j = 0; j < n-1; j++)
			    	{
		    			System.out.print((i+j*2)+"+");
			    	}
		    		System.out.println((i+2*(n-1)));
		    		break;
		    	}
		    }
		}
	}

}
