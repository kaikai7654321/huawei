package com.exercise0205;

/**
 * @title  :  �������������
 * @rank   :  33
 * @time   :  2017/2/5
 * 1. javaʮ�ּ򵥡����ǣ������һ������ôд�ġ����߿�һ��Դ�롣
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
