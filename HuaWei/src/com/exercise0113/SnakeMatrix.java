package com.exercise0113;
/**
 * @title  蛇形矩阵
 * @author kaikai
 * @rank   16
 * @time   2017/1/13
 * 1. 首先，题目很简单。只需要细心体会即可。就是在循环的时候，一个i与j此消彼长的过程。循环需要好好体会。
 * 2. 格式，格式，格式。错了好几次。都是格式。记住label1最后一个不需要空格。lable2最后一行也要是空行。因为不知一个测试用例
 */

import java.util.Scanner;
public class SnakeMatrix
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		int [][]matrix;
		while(scan.hasNext())
		{ 
			matrix=new int[100][100];
			n = scan.nextInt();
			int count = 1;
			//int i =0 , j=0;
			for(int i = 0; i < n; i++)
			{
				int x = i, j = 0;
				
				while(x>=0&&j<=i)
				{
					matrix[x--][j++]=count++;
				}
			}
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n-i; j++)
				{
					//label1
					System.out.print(matrix[i][j]);
					if(j!=n-i-1)
						System.out.print(" ");
				}
				//label2
				System.out.println();
			}
		}
	}

}
