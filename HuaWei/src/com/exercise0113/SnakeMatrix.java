package com.exercise0113;
/**
 * @title  ���ξ���
 * @author kaikai
 * @rank   16
 * @time   2017/1/13
 * 1. ���ȣ���Ŀ�ܼ򵥡�ֻ��Ҫϸ����ἴ�ɡ�������ѭ����ʱ��һ��i��j�����˳��Ĺ��̡�ѭ����Ҫ�ú���ᡣ
 * 2. ��ʽ����ʽ����ʽ�����˺ü��Ρ����Ǹ�ʽ����סlabel1���һ������Ҫ�ո�lable2���һ��ҲҪ�ǿ��С���Ϊ��֪һ����������
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
