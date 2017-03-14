package com.change2;


import java.math.BigInteger;
import java.util.*;
public class Chalange2
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] value ;
		int[] cost;
		int[][] dp;
		
		while(scan.hasNext())
		{
			int n = scan.nextInt();
		    value = new int[n+1];
		    cost = new int[n+1];
		    
		    
		    
		    for(int i = 1; i <= n; i++)
		    {
		    	
		    	cost[i] = scan.nextInt();
		    	value[i] = scan.nextInt();
		    	//amount += cost[i];
		    }
		    int amount = scan.nextInt();
		    dp = new int[n+1][amount+1];
		    int result = 0;
		    for(int i = 1; i <= n; i++)
		    {
		    	for(int j = 0; j <= amount; j++)
		    	{
		    		
		    		dp[i][j] = dp[i-1][j];
		    		if(j>=cost[i] && dp[i][j] < dp[i-1][j-cost[i]] + value[i])
		    		{
		    			dp[i][j] = dp[i-1][j-cost[i]] + value[i];
		    			if(result < dp[i][j])
		    			{
		    				result = dp[i][j];
		    			}
		    		}
		    	}
		    }
		    System.out.println(result);
		}
	}

}
