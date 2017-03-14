package com.exercise0223;

/**
 * @title  :  二维数组操作
 * @rank   :  87
 * @time   :  2017/2/23
 *
 */

import java.util.*;

public class TwoDimension 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int r,c;
		
		while(scan.hasNext())
		{
			r = scan.nextInt();
			c = scan.nextInt();
			
			System.out.println(0);
			
			int r1 = scan.nextInt();
			int c1 = scan.nextInt();
			int r2 = scan.nextInt();
			int c2 = scan.nextInt();
			
			if((r1 >= 0 && r1 < r && c1 >= 0 && c1 < c 
					&& r2 >= 0 && r2 < r && c2 >= 0 && c2 < c))
			{
				System.out.println(0);
			}else 
			{
				System.out.println(-1);
			}
			
			int r3 = scan.nextInt();
			
			if(r3 >= 0 && r3 < r)
			{
				System.out.println(0);
			}else 
			{
				System.out.println(-1);
			}
			
			int c3 = scan.nextInt();
			
		    if(c3 >= 0 && c3 < c)
			{
				System.out.println(0);
			}else 
			{
				System.out.println(-1);
			}
		    
		    int r4 = scan.nextInt();
		    int c4 = scan.nextInt();
		    
		    if(r4 >= 0 && r4 < r && c4 >= 0 && c4 < c)
		    {
		    	System.out.println(0);
		    }else 
			{
				System.out.println(-1);
			}
		}
	}

}
