package com.exercise0221;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title  :  素数伴侣
 * @rank   :  75
 * @time   :  2017/2/22
 * 1. 使用dp可以过掉华为，但是过不了牛客。所以应该是dp是碰巧过了。另外，应该用二分图。但是自己还没有写。一会写一下。还有
 *    就是PP2是牛客上看到的dp，自己的dp就是仿写这个。
 * 2. label1处是dp[i+1]-dp[j]更为合理，就dp而言。
 *
 */

import java.util.*;

public class PrimePartner 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\23192\\Desktop\\input.txt");
		Scanner scan = new Scanner(file);
		//Scanner scan = new Scanner(System.in);
		int n ;
		List<Integer> list ;
		int dp[];
		
		while(scan.hasNext())
		{
			list = new ArrayList<Integer> ();
			n = scan.nextInt();
			dp = new int[n+1];
			
			for(int i = 0; i < n; i++ )
			{
				list.add(scan.nextInt());
				
			}
			
			if(n == 0 || list.size() == 0 || n%2 != 0)
			{
				System.out.println(0);
				continue;
			}
			
			for(int i = n-2; i >= 0; i--)
			{
				int a = list.get(i);
				for(int j = n-1; j > i; j--)
				{
					//label1
					int temp = isPrime(list.get(i)+list.get(j)) 
							? (dp[i+1] - dp[j] + dp[j+1] +1)
							: dp[i+1];
							//System.out.println("temp : "+temp);
					if(dp[i]<temp)
						{
							dp[i] = temp;
						}
				}
			}
			
			
			System.out.println(dp[0]);
		}
	}

	public static boolean isPrime(int a)
	{
		for(int i = 2; i <= (int)Math.sqrt(a); i++)
		{
			if(a%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
