/**
 * @title  :  ���Բ�ֵ
 * @rank   :  105
 * @time   :  2017/3/11
 * 1. ˼·�ܼ򵥣�����û������Ŀ��˼��nû���á�����ÿ�����룬��һ������ţ��ڶ�������ֵ
 */

package com.exercise0302;

import java.util.*;

public class InsertValue
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext())
		{
			int m,n;
			 
		    m = scan.nextInt();
		    n = scan.nextInt();
		    int M,A,N,B;
		    
		    M = scan.nextInt();
		    A = scan.nextInt();
		    
		    System.out.println(M + " " + A);
		    
		    
		    for(int i = 1; i < m; i++)
		    {
		    	N = scan.nextInt();
		    	B = scan.nextInt();
		    	
		    	if(N == M)
		    	{
		    		continue;
		    	}
		    		
		    	for(int j = M+1; j < N; j++)
		    	{
		    		int temp = (B - A)/(N - M) * (j - M) + A;
		    		System.out.println(j+" "+temp);
		    	}
		    	System.out.println(N+" "+B);
		    	M = N;
		    	A = B;
		    }
		}
	}

}
