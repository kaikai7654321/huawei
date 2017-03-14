package com.change2;


import java.math.BigInteger;
import java.util.*;
public class Change1
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			BigInteger temp = new BigInteger("2");
			BigInteger result = new BigInteger("2");
			
			for(int i = 2; i <= n; i++)
			{
				result = result.multiply(temp).add(temp);
			}
			
			System.out.println(result);
		}
	}

}
