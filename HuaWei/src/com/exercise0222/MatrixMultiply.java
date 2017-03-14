package com.exercise0222;

/**
 * @title  :  矩阵乘法
 * @rank   :  72
 * @time   :  2017/2/22
 * 1. 牛客网上只能通过10%的测试用例。说是越界。但是华为可以通过。
 */

import java.util.*;

public class MatrixMultiply 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int r1,c1,c2;
		int [][]matrix1;
		int [][]matrix2;
		int [][]matrix3;
		
		while(scan.hasNext())
		{
			r1 = scan.nextInt();
			c1 = scan.nextInt();
			c2 = scan.nextInt();
			matrix1 = new int[r1][c1];
			matrix2 = new int[c1][c2];
			matrix3 = new int[c1][c2];
			
			for(int i = 0; i < r1; i++ )
			{
				for(int j = 0; j < c1; j++)
				{
					matrix1[i][j] = scan.nextInt();
				}
			}
			
			for(int i = 0; i < c1; i++ )
			{
				for(int j = 0; j < c2; j++)
				{
					matrix2[i][j] = scan.nextInt();
				}
			}
			
			for(int i = 0; i < r1; i++)
			{
				for(int j = 0; j < c2; j++)
				{
					for(int k = 0; k < c1; k++)
					{
						matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			
			for(int i = 0; i < r1; i++)
			{
				for(int j = 0; j < c2; j++)
				{
					System.out.print(matrix3[i][j]);
					if(j!=c2-1)
						System.out.print(" ");
				}
			    
				System.out.println();
			}
		}
	}

}
