package com.exercise0205;

/**
 * @title  :  超长正整数相加
 * @rank   :  33
 * @time   :  2017/2/5
 * 1. java十分简单。但是，最好想一下是怎么写的。或者看一下源码。
 */
import java.util.*;
import java.math.BigInteger;
public class LongInt 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		BigInteger a,b;
		while(scan.hasNext())
		{
			a = scan.nextBigInteger();
			b = scan.nextBigInteger();
			System.out.println(a.add(b));
		}
	}

}
