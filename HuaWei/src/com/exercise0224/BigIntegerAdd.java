package com.exercise0224;




/**
 * @title  :  无线OSS－高精度整数加法
 * @rank   :  92
 * @time   :  2017/2/24
 */

import java.math.BigInteger;
import java.util.*;
public class BigIntegerAdd 
{

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String a , b;
		Map<Integer, Integer> map ;
		
		while(scan.hasNext())
		{
			a = scan.next();
			b = scan.next();
			
		    BigInteger ai = new BigInteger(a);
		    BigInteger bi = new BigInteger(b);
		    
		    System.out.println(ai.add(bi));
		}
	}

}
