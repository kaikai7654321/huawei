package com.exercise0221;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @title  :  ��������
 * @rank   :  75
 * @time   :  2017/2/22
 * 1. ʹ��dp���Թ�����Ϊ�����ǹ�����ţ�͡�����Ӧ����dp�����ɹ��ˡ����⣬Ӧ���ö���ͼ�������Լ���û��д��һ��дһ�¡�����
 *    ����PP2��ţ���Ͽ�����dp���Լ���dp���Ƿ�д�����
 * 2. label1����dp[i+1]-dp[j]��Ϊ������dp���ԡ�
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
